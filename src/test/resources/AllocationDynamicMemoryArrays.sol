contract c {
  function f() {
    uint[] memory x = new uint[](100);
    uint[][] memory twoDim = new uint[][](20);
    for (uint i = 0; i < twoDim.length; i++)
      twoDim[i] = new uint[](30);
  }
}