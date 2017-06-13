contract ArrayExample {
  uint[7][] 
  data;
  bytes byteData;
  address owner;
  modifier onlyowner(uint r) { if (msg.sender == owner) _; }
  modifier onlyowner2 { if (msg.sender == owner) _; }
  
  function assign(uint[4][] input, bytes byteInput) external {
    data = input; // will assign uint[4] to uint[7] correctly, would produce type error if reversed
    byteData = byteInput; // bytes are stored in a compact way
  }
  function indexAccess() private  onlyowner(3) onlyowner2  constant returns(uint a)  {
    data.length += 20;
    data[3][5] = data[3][2];
    byteData[2] = byteData[7]; // this will access sigle bytes
    return 5;
  }
  function clear() {
    delete data[2]; // will clear all seven elements
    data.length = 2; // clears everything after the second element
    delete data; // clears the whole array
  }
}