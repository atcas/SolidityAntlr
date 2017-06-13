import "mortal";
import "mortal";

contract Test is mortal {
    // since we import the standard library "mortal" contract and we inherit from it
    // we can call the kill() function that it provides
    function killMe() { kill();}
}

contract Test is mortal {
    // since we import the standard library "mortal" contract and we inherit from it
    // we can call the kill() function that it provides
    function killMe() { kill();}
}