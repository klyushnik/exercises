def digits_count(num):
    # base case
    if (abs(num) < 10):
        return 1
    else:
        return digits_count(num / 10) + 1
    
print(digits_count(123456))