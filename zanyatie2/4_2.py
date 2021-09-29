string.encode(encoding='UTF-8',errors='strict')

print("Четвертое задание")
a = int(input("a: "))
b = int(input("b: "))
l = int(input("l: "))
N = int(input("N: "))
len_ = (a*N + a*(N-1) + 2*b*(N-1) + 2*l)
print(str(len_) + "\n")