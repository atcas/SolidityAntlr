contract mortal { function kill() { suicide(msg.sender); } }
contract named is mortal { function kill() { /*namereg.unregister();*/ super.kill(); } }
contract tokenStorage is mortal { function kill() { /*returnAllTokens();*/ super.kill(); } }
contract MyContract is named, tokenStorage {}