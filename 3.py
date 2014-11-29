# Problem 3 
# The prime factors of 13195 are 5, 7, 13 and 29.
# What is the largest prime factor of the number 600851475143 ?

import math

def isPrime(num):
  if num < 2:
    return False
  i = 2
  while i <= math.sqrt(num):
    if num % i == 0:
      return False
    i += 1
  return True

num = 600851475143
max_prime = 2

while num != 1:
  #print num
  if isPrime(num): # If the number is already prime, then break out of loop
    if num > max_prime:
      max_prime = num
    break
  else:
    i = 2
    while i < num:
      if isPrime(i) and num % i == 0:
        num = num / i        
        if i > max_prime:
          max_prime = i
      i += 1


print max_prime
