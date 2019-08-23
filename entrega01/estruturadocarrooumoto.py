
def numRodasVeiculo(veiculo):
    dicVeiculo={"carro":"4","moto":"2"}
    return dicVeiculo[veiculo]

while True:
    try:
        veiculo=input("Digite 'carro' ou 'moto' e saiba quantas rodas ele tem e digite 0 para parar a aplicação")
        if(veiculo=='0'):
            break
        resposta=numRodasVeiculo(veiculo)
        print(resposta)
    except:
        print("Entrada incorreta")
        
    
    
