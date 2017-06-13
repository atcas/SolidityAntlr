contract c {
  function c()
  {
      val2 = 123;
      val1 = sha3("foo"); // sha3(0x666f6f)
      val3 = sha3(val2, "bar", 1031); //sha3(0x7b6261720407)
  }
  uint256 val1;
  uint16 val2;
  uint256 val3;
}