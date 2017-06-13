contract Contract {
  struct Data {
    uint deadline;
    uint amount;
  }
  Data data;
  function set(uint id, uint deadline, uint amount) {
    data.deadline = deadline;
    data.amount = amount;
  }
  function clear(uint id) { delete data; }
}