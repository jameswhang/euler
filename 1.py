sum = 0 # initialize sum
for i in range(1000): # iterate over range of 1000
  if i % 3 == 0 or i % 5 == 0:
    sum += i # increment the sum by i if i is divisible by 3 or 5
print sum # print the result