total = 0

for i in range(1, 11):
    score = int(input(f"Enter score {i}: "))
    total = total + score

average = total / 10

print("Sum:", total)
print("Average:", average)
