#! parrot-nqp

# We want Test::More features for testing. Not NQP's builtin.
Q:PIR { .include "test_more.pir" };
pir::load_bytecode("LLVM.pbc");

my $type;

$type := LLVM::Type::int1();
ok( $type, "int1 created");
ok( $type ~~ LLVM::Type, ".. with proper class");

$type := LLVM::Type::int8();
ok( $type, "int8 created");
ok( $type ~~ LLVM::Type, ".. with proper class");

# Check smartmatch.
ok(  LLVM::Type::int8() ~~ LLVM::Type::int8(), "Same type matched" );
nok( LLVM::Type::int1() ~~ LLVM::Type::int8(), "Not same type matched" );

$type := LLVM::Type::int16();
ok( $type, "int16 created");
ok( $type ~~ LLVM::Type, ".. with proper class");

$type := LLVM::Type::int32();
ok( $type, "int32 created");
ok( $type ~~ LLVM::Type, ".. with proper class");

$type := LLVM::Type::int64();
ok( $type, "int64 created");
ok( $type ~~ LLVM::Type, ".. with proper class");

$type := LLVM::Type::int(128);
ok( $type, "int(128) created");
ok( $type ~~ LLVM::Type, ".. with proper class");

my $ptr := LLVM::Type::pointer(LLVM::Type::int8());
ok( $ptr, "i8* created");
ok( $type ~~ LLVM::Type, ".. with proper class");

$type := $ptr.element_type();
ok( $type, ".. original ElementType fetched" );
ok( $type ~~ LLVM::Type::int8(), ".. correct one");

# FunctionType
# void foo()
$type := LLVM::Type::function(LLVM::Type::void());
ok( $type ~~ LLVM::Type, "void (*)()");

# int foo(...)
$type := LLVM::Type::function(LLVM::Type::int8(), :va_args<1>);
ok( $type ~~ LLVM::Type, "int (*)(...)");

# int foo(int, i8*, ...)
$type := LLVM::Type::function(
    LLVM::Type::int8(),
    LLVM::Type::int8(), LLVM::Type::cstring(),
    :va_args<1>
);
ok( $type ~~ LLVM::Type, "int (*)(int, char*, ...)");

# TODO Add tests for floats

# Refine
# Create struc: struct foo { foo *next }
# "something"
my $abstract := LLVM::Type::opaque();

# Struct "foo{ something * }"
my $concrete := LLVM::Type::struct(
    LLVM::Type::pointer($abstract)
);
# "something" -> "foo"
$abstract.refine_to($concrete);
ok( 1, "Refine done");

# I don't know how to check it. But dump should generate
# %struct.foo = type { %struct.foo* }
#my $m := LLVM::Module.create("foo");
#$m.add_type_name("struct.foo", $concrete);
#$m.dump();

# Shortcuts.

$ptr := LLVM::Type::cstring();
ok( $ptr, "shortcut i8* created");
ok( $type ~~ LLVM::Type, ".. with proper class");

$ptr := LLVM::Type::INTVAL();
ok( $ptr, "INTVAL created");
ok( $type ~~ LLVM::Type, ".. with proper class");

$ptr := LLVM::Type::FLOATVAL();
ok( $ptr, "FLOATVAL created");
ok( $type ~~ LLVM::Type, ".. with proper class");

$ptr := LLVM::Type::STRING();
ok( $ptr, "STRING created");
ok( $type ~~ LLVM::Type, ".. with proper class");

# my $m := LLVM::Module.create("foo");
# $m.add_type_name("struct.STRING", $ptr);
# $m.dump()
#
# %1 = type opaque
# %struct.STRING = type { i32, void*, i32, i8*, i32, i32, i32, %1* }

$ptr := LLVM::Type::PMC();
ok( $ptr, "PMC created");
ok( $type ~~ LLVM::Type, ".. with proper class");

# my $m := LLVM::Module.create("foo");
# $m.add_type_name("struct.PMC", $ptr);
# $m.dump();
#
# %0 = type opaque
# %struct.PMC = type { i32, %0*, void*, %struct.PMC* }


done_testing();

# vim: ft=perl6
