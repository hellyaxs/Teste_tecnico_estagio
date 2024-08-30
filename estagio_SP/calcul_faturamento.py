import json

def main():
    try:
        with open('faturamento.json', 'r') as file:
            dados = json.load(file)

        faturamentos = [dia['faturamento'] for dia in dados if dia['faturamento'] > 0]

        if not faturamentos:
            print("Não há dados de faturamento para processar.")
            return

    
        menor_faturamento = min(faturamentos)
        maior_faturamento = max(faturamentos)
        media_faturamento = sum(faturamentos) / len(faturamentos)


        dias_acima_da_media = len([faturamento for faturamento in faturamentos if faturamento > media_faturamento])

   
        print(f"Menor faturamento: {menor_faturamento:.2f}")
        print(f"Maior faturamento: {maior_faturamento:.2f}")
        print(f"Dias com faturamento acima da média: {dias_acima_da_media}")

    except Exception as e:
        print(f"Ocorreu um erro: {e}")

if __name__ == '__main__':
    main()
