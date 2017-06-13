contract ArrayExample {
  uint[7][] data;
  bytes byteData;
  function assign(uint[4][] input, bytes byteInput) external {
    data = input; // will assign uint[4] to uint[7] correctly, would produce type error if reversed
    byteData = byteInput; // bytes are stored in a compact way
  }
  function indexAccess() {
    data.length += 20;
    data[3][5] = data[3][2];
    byteData[2] = byteData[7]; // this will access sigle bytes
  }
  function clear() {
    delete data[2]; // will clear all seven elements
    data.length = 2; // clears everything after the second element
    delete data; // clears the whole array
  }
}