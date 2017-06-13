contract C {
    struct S { uint a; uint b; }
    struct A { uint x; uint y; S s; }
    A data;
    function f() internal returns (A) {
        // Construct structs inline, pass to a function and return from it.
        // Memory is allocated only once, pointers are passed around.
        // Construction by member name is possible.
        return g(A(5, 7, S({b: 1, a: 2})));
    }
    function g(A _a) internal returns (A) {
        _a.s.b = 2;
        data = _a; // performs a copy
        return _a;
    }
}