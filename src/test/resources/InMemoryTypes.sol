contract c {
  uint[] x;
  function f(uint[] memoryArray) {
    x = memoryArray; // works, copies the array to storage
    var y = x; // works, assigns a pointer
    y[7]; // fine, returns the 8th element
    y.length = 2; // fine, modifies storage
    delete x; // fine, clears the array
    // y = memoryArray; // does not work, would need to create a new temporary / unnamed array in storage, but storage is "statically" allocated
    // delete y; // does not work, would set pointer to zero and does not make sense for pointer
  }
}