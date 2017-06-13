contract C {
  function willFail() returns (uint) {
    address(709).call();
    return 1;
  }
}