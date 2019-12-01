
:- initialization(main).
amava('Carlos', 'Dora').
amava('Dora', 'Lia').
amava('Lia', 'Lea').
amava('Lea', 'Paulo').
amava('Paulo', 'Juca').
amava('Juca', 'Dora').
amava('Dora', 'Carlos').
amava('Dora', 'Rita').
amava('Dito', 'Rita').
amava('Rita', 'Dito').
amava('Rita', 'Carlos').
amava('Dora', 'Pedro').
amava('Dora', 'Lea').
amava('Dora', 'Juca').
amava('Dora', 'Paulo').
rival(X, Y):-
    amava(X, Z),
    amava(Y, Z),
    X \= Y.
casal(X,Y):-
    amava(Y,X),
    amava(X,Y),
    X \= Y.
main :- 
%amava('Carlos', X)
%rival(X,Y)
%casal(X,Y)
writeln('Runing querys...').