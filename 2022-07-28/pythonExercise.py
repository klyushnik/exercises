def perimeter(l, num):
    return ((l == "s") * num * 4) + ((l == "c") * num * 6.28)

print(perimeter("c", 4))