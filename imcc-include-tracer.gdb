b imcc_compile_file_api
r
b compilers/imcc/imclexer.c:3281
clear imcc_compile_file_api
clear compilers/imcc/imclexer.c:3281

b include_file
commands $bpnum
  silent
#  p file_name->strstart
  printf "### include = %s\n", file_name->strstart
  c
end

b do_loadlib
commands $bpnum
  silent
#  x/s lib
  printf "### loadlib = %s\n", lib
  c
end

r
