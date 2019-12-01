
string_lista :: String -> [String]
string_lista []  = []
string_lista xxs@(x:xs)  | x == ' ' = string_lista xs
                    | otherwise = ys : string_lista rest
                      where (ys, rest) = break (== ' ') xxs

reverte_lista :: [a] -> [a]  
reverte_lista [] = []  
reverte_lista (x:xs) = reverte_lista xs ++ [x]

lista_string :: [String] -> String
lista_string [] = ""
lista_string (x:xs) | xs == [] = x
                    | otherwise = x ++ " " ++ lista_string xs

inverterTexto :: String -> String
inverterTexto s = lista_string . reverte_lista . string_lista $ s

main = do
  print(inverterTexto "la vou eu")