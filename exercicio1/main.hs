--a
fibonacci :: Integer -> Integer
fibonacci 0 = 0
fibonacci 1 = 1
fibonacci n = fibonacci (n-1) + fibonacci (n-2)

--b
fatorial :: Integer -> Integer
fatorial 0 = 1
fatorial n = n * fatorial(n-1)

--c
fibonacciList :: Integer -> [Integer]
fibonacciList n =  map fibonacci [0..n-1]


fatLista :: Int -> [Int]
fatLista n = scanl (*) 1 [2..n]

--d  Remove uma posição da lista
remover::Int->[Int]->[Int]
remover 1 (a:x) = x
remover n (a:x) = a: remover (n-1) x

--e

inserir x n l = fst(splitAt n l) ++ [x] ++ (snd (splitAt n l))

--f
ordenar:: [Int]->[Int]
ordenar lista = sort lista


-- Par/Impar
par :: [Int] -> [Int]
par xs = [x | x <- xs, mod x 2 == 0]
impar :: [Int] -> [Int]
impar xs = [x | x <- xs, mod x 2 == 1]

type ImparPar = ([Int],[Int])
separaImparPar:: [Int] -> ImparPar
separaImparPar t = (ordenar(impar t),ordenar(par t ))

--g


odernarImparPar::[Int]->[Int]
odernarImparPar l = ordenar(impar(l)) ++ ordenar(par(l))



main = do 
  print(fibonacci 3)
  print(inserir 7 3 [1,2,3,4])
 
 
  
  
  
  
  







