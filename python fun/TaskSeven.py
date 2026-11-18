total = 0
count = 0

for i in range(1, 11):
    score = int(input(f"Enter score {i}: "))
    if score % 2 == 0:
        total = total + score
        count = count + 1

if count > 0:
    average = total / count
    print("Average of even scores:", average)
else:
    print("There were no even scores.")
