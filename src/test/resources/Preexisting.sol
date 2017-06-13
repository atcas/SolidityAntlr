contract c {
  string s;
  struct Data {uint a; uint b;}
  mapping(uint => Data) data;
  function f() {
    (s, data[45]) = ("abc", Data(1, 2));
  }
}