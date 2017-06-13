contract Base {
	function Base(uint i)
	{
		m_i = i;
	}
	uint public m_i;
}
contract Derived is Base(0) {
	function Derived(uint i) Base(i) {}
}