contract Code {
  uint m_data;
  function (uint v) { m_data = v; }
}
contract ActualContract {
  uint public m_data;
  function f() { Code(0x12345).callcode(7); }
}