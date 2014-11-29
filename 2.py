# Problem 2:
# By considering the terms in the Fibonacci sequence whose values do not exceed four million, find the sum of the even-valued terms.

# Approach:
# Instead of using recursion, use iteration. (Faster) 
# Keep track of two previous fibonacci numbers. 

sum_fib = 0

prev_fib = 1
cur_fib = 2

while cur_fib < 4000000:
  if cur_fib % 2 == 0:
    sum_fib += cur_fib
  temp = cur_fib
  cur_fib = cur_fib + prev_fib
  prev_fib = temp

print sum_fib