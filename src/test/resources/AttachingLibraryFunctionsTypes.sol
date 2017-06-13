library Lib {
  function sum(uint[] storage self) returns (uint s) {
    for (uint i = 0; i < self.length; i++)
      s += self[i];
  }
}
contract C {
  using Lib for uint[];
  uint[] data;
  function f() {
    data.push(data.sum());
  }
}