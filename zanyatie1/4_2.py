string.encode(encoding='UTF-8',errors='strict')

print("Четвертое задание.2")
def len_(a, b, l, N):
	return (a*N + a*(N-1) + 2*b*(N-1) + 2*l)
a = int(input("a: "))
b = int(input("b: "))
l = int(input("l: "))
N = int(input("N: "))
print(str(len_(a, b, l, N)) + "\n")