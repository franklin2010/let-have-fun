total = 0

for i in range(1, 11):
    number = int(input(f"Enter number {i}: "))
    if i % 2 == 0:
        total = total + number

print("Sum of the even indexes:", total)
