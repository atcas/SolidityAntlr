contract c {
  function f(uint a) constant private returns (uint b) { return a + 1; }
  uint public data;
}