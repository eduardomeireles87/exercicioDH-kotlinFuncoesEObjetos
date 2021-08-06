# exercicioDH-kotlinFuncoesEObjetos
exercicioDH-kotlinFuncoesEObjetos


Exercício 1: Clientes e Contas 
1. Definir uma nova classe Cliente contendo as seguintes propriedades: 
- nome 
- sobrenome 
2. Definir uma nova classe Conta contendo as seguintes propriedades: 
- número da conta 
- saldo 
- titular (o titular é um objeto do tipo Cliente). 
3. Criar uma função chamada depósito() que tenha como parâmetro de entrada quantia em dinheiro. Como estamos fazendo um depósito, a quantia de dinheiro é somada ao saldo. A função deve imprimir na tela o tipo de transação realizada e o novo saldo. 
4. Criar uma função chamada saque() que tenha como parâmetro de entrada quantia em dinheiro. Como estamos fazendo um saque, a quantia é subtraída do saldo. Caso o valor do saque a realizar seja maior que o saldo disponível, imprimir na tela: “Saldo insuficiente”. Caso contrário, a função deve imprimir na tela “Transação realizada!” e o novo saldo, concatenados.
5. Definir um novo arquivo chamado ExercicioConta e criar uma função main(). Dentro da função main, criar dois Clientes, passando nome e sobrenome, e criar uma Conta para cada um, inicializando com o número da conta, saldo e titular. Em seguida, fazer um deposito() e um saque() em cada conta. 


Exercício 2: Jogadores e treinamento 
1. Definir uma nova classe JogadorDeFutebol contendo as seguintes propriedades: 
- nome 
- energia 
- alegria 
- gols 
- experiência 
2. Criar uma função chamada fazerGol() em JogadorDeFutebol, que tire 5 pontos de energia e dê 10 pontos de alegria ao jogador, além de aumentar o número de gols em 1. A função deve imprimir “GOOOOL!” na tela. 
3. Criar uma função chamada correr() em JogadorDeFutebol, que tire 10 pontos de energia dele. O método deve imprimir na tela: “Cansei”. 

 4. Definir uma nova classe SessaoDeTreinamento contendo as seguintes propriedades: 
- experiência (ganha quando um treinamento é realizado)
5. Criar uma função chamado treinarA que tenha como parâmetro de entrada um jogador de futebol. Como é um treinamento, o jogador precisa: 
1- Correr 2- Fazer um Gol 3- Correr 
Depois que o JogadorDeFutebol fizer essas três coisas, a experiência dele deve aumentar, somando um ponto na experiência. A função deve imprimir a experiência inicial e a experiência final do jogador. 
6. Definir um novo arquivo chamado JogadoresETreinamentos e criar uma função main(). Dentro da função main, criar dois JogadorDeFutebol configurando as propriedades necessárias, e criar uma SessaoDeTreinamento, também com as propriedades necessárias. Os dois jogadores devem realizar um treinamento. 


Exercício 3: Atletas e prova 
1. Definir uma nova classe Atleta contendo as seguintes propriedades: 
- nome 
- nível 
- energia 
2. Definir uma nova classe Prova contendo as seguintes propriedades: 
- dificuldade 
-energiaNecessaria

3. Criar, na classe Prova, a função podeRealizar(), que tenha como parâmetro de entrada um objeto do tipo Atleta. A função deve retornar true caso o atleta possa realizar a prova e, caso contrário, false. Um atleta pode realizar a prova se tiver um nível maior ou igual à dificuldade da prova, além de energia suficiente. 
4. Definir um novo arquivo chamado AtletasEProva e criar uma função main(). Dentro da função main, criar dois atletas, configurando as propriedades necessárias, e criar três provas para cada um, também com os atributos necessários. Depois, verificar se os atletas podem realizar essas provas. 
