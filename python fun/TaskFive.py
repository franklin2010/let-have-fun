total = 0

for counter in range(1, 11):
    score = int(input(f"Enter score {counter}: "))
    if score % 2 == 0:
        total = total + score

print("Sum of even scores:", total)
