contract C {
  bytes32 x;
  function greet() returns (string) {
    x = "Hello, World!";
    return "Hello, World!";
  }
}