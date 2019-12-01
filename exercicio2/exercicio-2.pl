se('Deus', 'Amor').
se('Amor', 'Cego').
se('Steve', 'Cego').

se('emagrece', 'dieta').
se('dieta', 'verdura').
se('dieta', 'peixe').
se('baleia', 'peixe').
se('elefante', 'verdura').
se('baleia', 'gordo').
se('elefante', 'gordo').

se('mais queijo', 'mais buracos').
se('mais buracos', 'menos queijo').

sofisma(S, A):-
    se(A, Y),
    se(Y, Z),
    se(S, Z).