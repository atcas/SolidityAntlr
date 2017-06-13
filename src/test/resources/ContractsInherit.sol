contract Helper {
  function getBalance() returns (uint bal) {
    return this.balance; // balance is "inherited" from the address type
  }
}
contract IsAnAddress {
  Helper helper;
  function setHelper(address a) {
    helper = Helper(a); // Explicit conversion, comparable to a downcast
  }
  function sendAll() {
    // send all funds to helper (both balance and send are address members)
    helper.send(this.balance);
  }
}