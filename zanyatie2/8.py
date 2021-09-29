string.encode(encoding='UTF-8',errors='strict')

print("Восьмое задание")
def chis(f, s, t):
	k = 0
	arr1 = [f, s, t]
	for i in range(0, 3):
		for n in range(0, 3):
			if (arr1[i] == arr1[n]) and (n != i):
				k += 1
	return k
arr = input("Введите три числа").split()
print(str(chis(arr[0], arr[1], arr[2])) + "\n")