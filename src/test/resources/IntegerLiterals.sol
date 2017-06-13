contract IntegerLiterals {
  function f() {
    // The following would have caused a type error in earlier versions (cannot add int8 to uint8),
    // now the value of x is set to 9 and the type to uint8.
    var x = -1 + 10;
    // It is even possible to use literals that do not fit any of the Solidity types as long as
    // the final value is small enough. The value of y will be 1, its type uint8.
    var y = (0x100000000000000000001 * 0x100000000000000000001 * 0x100000000000000000001) & 0xff;
  }
}