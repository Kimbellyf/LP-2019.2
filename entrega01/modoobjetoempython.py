class Veiculo(object):
    marca=None
    ano = None
    dicTipos ={"carro":"4","moto":"2"}
    
    def __init__(self,tipoVeic):
        self.__tipoVeic = tipoVeic
        self.__rodas=dicTipos[tipoVeic]
        

    def andar(self):
        print("o(a) %s está andando!" %self.tipoVeic)

    def qtdRodas(self):
        print("O veículo escolhido: %s tem %s rodas" %(self.tipoVeic,(self.__rodas)))
        


while True:
    try:
        veiculo=input("Digite 'carro' ou 'moto' e saiba quantas rodas ele tem e digite 0 para parar a aplicação")
        if(veiculo=='0'):
            break
        resposta=Veiculo(veiculo)
        print(resposta.andar())
        resposta.qtdRodas()
        
    except:
        print("Entrada incorreta")
        
    
    
