library Math {
  function max(uint a, uint b) returns (uint) {
    if (a > b) return a;
    else return b;
  }
  function min(uint a, uint b) returns (uint) {
    if (a < b) return a;
    else return b;
  }
}
contract C {
  function register(uint value) {
    value = Math.max(10, Math.min(100, value)); // clamp value to [10, 100]
    // ...
  }
}