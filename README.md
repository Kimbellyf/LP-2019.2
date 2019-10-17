
"# LP-2019.2" 
Exercício 3 passado pelo professor Gabriel, adaptado com a questão 2 da prova 2019.1 por ser mais completo para o entendimento de concorrência com Threads.
<br><br>
 Considerando o diagrama abaixo, implemente o programa concorrente em Java, sabendo que:
<br>
<ul>
  <li> A classe Application cria 2 produtores, 4 consumidores e um tanque de 10 litros de
  capacidade. Todos os produtores e consumidores compartilham o mesmo tanque;</li>
  <li> O método adicionar incrementa em 1 o nível do tanque, enquanto o método consumir
  decrementa em 1 o nível do tanque;</li>
  <li> Produtores e consumidores rodam infinitamente;</li>
  <li> O nível do tanque nunca pode passar de sua capacidade.</li
  <li> Caso o consumidor tente consumir algo e o tanque esteja vazio, ele deve esperar até
    que algum produtor inclua algo no tanque.</li>
  <li> Caso o produtor tente produzir algo e o tanque esteja cheio, ele deve esperar até que algum consumidor consuma algo no tanque.</li>
</ul>
