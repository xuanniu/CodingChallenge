import math

def perimeter(l, num):
  return ((l=='c') * 2 * math.pi * num) + ((l=='s') * 4 * num)
  
print(perimeter('s',2))
print(perimeter('c',2))