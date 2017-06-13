contract c {
  struct Account { address owner; uint balance; }
  Account[] accounts;
  function newAccount(address _owner, uint _balance) {
    accounts.push(Account(_owner, _balance));
  }
}