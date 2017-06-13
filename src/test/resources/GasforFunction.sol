contract Helper {
  function getBalance() returns (uint bal) { return this.balance; }
}
contract Main {
  Helper helper;
  function Main() { helper = new Helper.value(20)(); }
  /// @notice Send `val` Wei to `helper` and return its new balance.
  function sendValue(uint val) returns (uint balanceOfHelper) {
    return helper.getBalance.value(val)();
  }
}