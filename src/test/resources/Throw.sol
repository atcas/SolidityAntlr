contract Sharer {
    function sendHalf(address addr) returns (uint balance) {
        if (!addr.send(msg.value/2))
            throw; // also reverts the transfer to Sharer
        return address(this).balance;
    }
}