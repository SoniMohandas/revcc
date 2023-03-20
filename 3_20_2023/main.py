def int_to_str(a):
    s = ""
    temp = a
    while (temp > 0):
        digit = temp % 10
        temp = temp // 10

        s = chr(digit + 48) + s
    return s

def str_to_int(a):
    res = 0
    for c in a:
        res *= 10
        digit = ord(c) - 48
        res += digit
    return res
    

if __name__ == "__main__":
    print(int_to_str(4))
    print(str_to_int("4"))
    print(int_to_str(29348))
