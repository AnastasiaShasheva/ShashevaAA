string.encode(encoding='UTF-8',errors='strict')

print("Девятое задание")
def choc(n, m, k):
	if (k % n == 0) or (k % m == 0):
		return("Да")
	else:
		return("Нет")
n = int(input("n: "))
m = int(input("m: "))
k = int(input("k: "))
print(choc(n, m, k))