contract test {
  struct s { uint8 a; uint8 b; uint8 c; }
  mapping(uint => s) data;
  function f(uint x, uint8 _a, uint8 _b, uint8 _c) {
    data[x].a = _a;
    data[x].b = _b;
    data[x].c = data[x].a;
  }
}