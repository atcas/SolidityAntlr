contract Base {
  function exte() external { }
  function publ() public /* can be omitted */ { }
  function inhe() inheritable { priv(); }
  function priv() private { }
}
contract Derived is Base {
  function g() {
    this.exte();
    // impossible: exte();
    this.publ();
    publ();
    // impossible: this.inhe();
    inhe();
    // impossible: this.priv();
    // impossible: priv();
  }
}