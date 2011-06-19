b imcc_compile_file_api
r

b include_file
commands $bpnum
  silent
  printf "### include = %s\n", file_name->strstart
  c
end

b do_loadlib
commands $bpnum
  silent
  printf "### loadlib = %s\n", lib
  c
end

clear imcc_compile_file_api
r
