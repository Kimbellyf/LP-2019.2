dicVeiculo={"carro":"4","moto":"2"}

while True:
    try:
        veiculo=input("Digite 'carro' ou 'moto' e saiba quantas rodas ele tem e digite 0 para parar a aplicação")
        if(veiculo=='0'):
            break
        resposta=dicVeiculo[veiculo]
        print(resposta)
    except:
        print("Entrada incorreta")
        
    
    
