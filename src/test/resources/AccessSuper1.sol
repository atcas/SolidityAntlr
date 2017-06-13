contract mortal { function kill() { suicide(msg.sender); } }
contract named is mortal { function kill() { /*namereg.unregister();*/ mortal.kill(); } }
contract tokenStorage is mortal { function kill() { /*returnAllTokens();*/ mortal.kill(); } }
contract MyContract is named, tokenStorage {}