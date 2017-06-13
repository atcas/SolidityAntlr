contract Test {
  function convert(hash160 h, string20 s) returns (string20 res_s, hash160 res_h) {
    res_s = string20(h);
    res_h = hash160(s);
  }
}