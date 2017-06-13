contract c {
  bytes data;
  function() { data = msg.data; }
  function forward(address addr) { addr.call(data); }
  function getLength() returns (uint) { return addr.length; }
  function clear() { delete data; }
}