contract test {
	enum ActionChoices { GoLeft, GoRight, GoStraight, SitStill }
	ActionChoices choices;

	function test()
	{
	    choices = ActionChoices.GoStraight;
	}
	function getChoice() returns (uint d)
	{
	    d = uint256(choices);
	}
}