def inverter_string(s):
    string_invertida = ''
    for char in s:
        string_invertida = char + string_invertida
    return string_invertida

def main():
    string_original = input("Digite a string para inverter: ")
    string_invertida = inverter_string(string_original)
    print(f"String invertida: {string_invertida}")

if __name__ == '__main__':
    main()
