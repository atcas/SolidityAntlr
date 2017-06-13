contract c {
  function () returns (uint) { return g(8); }
  function g(uint pos) internal returns (uint) { setData(pos, 8); return getData(pos); }
  function setData(uint pos, uint value) internal { data[pos] = value; }
  function getData(uint pos) internal { return data[pos]; }
  mapping(uint => uint) data;
}