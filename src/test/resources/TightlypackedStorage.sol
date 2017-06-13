contract C {
  uint248 x; // 31 bytes: slot 0, offset 0
  uint16 y; // 2 bytes: slot 1, offset 0 (does not fit in slot 0)
  uint240 z; // 30 bytes: slot 1, offset 2 bytes
  uint8 a; // 1 byte: slot 2, offset 0 bytes
  struct S {
    uint8 a; // 1 byte, slot +0, offset 0 bytes
    uint256 b; // 32 bytes, slot +1, offset 0 bytes (does not fit)
  }
  S structData; // 2 slots, slot 3, offset 0 bytes (does not really apply)
  uint8 alpha; // 1 byte, slot 4 (start new slot after struct)
  uint16[3] beta; // 3*16 bytes, slots 5+6 (start new slot for array)
  uint8 gamma; // 1 byte, slot 7 (start new slot after array)
}