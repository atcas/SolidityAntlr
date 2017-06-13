contract Base {
  function f(uint a) {}
}
contract Derived is Base {
  function f(uint8 b) {}
  function g() {
    // f(250); would create a type error since 250 can be implicitly
    // converted both to a uint8 and to a uint type
    f(2000); // calls f from Base
  }
}