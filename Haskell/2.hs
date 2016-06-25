fib :: [Integer]
fib = 0 : 1 : (zipWith (+) fib (tail fib))

even_fibs :: [Integer]
even_fibs = filter even . takeWhile (< 4000000) $ fib

main :: IO()
main = do
     putStrLn . show $ sum even_fibs
