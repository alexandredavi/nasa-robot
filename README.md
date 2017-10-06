# nasa-robot
* Projeto para a NASA colocar um time de robôs para explorar um terreno em Marte.
* O robô precisa navegar de tal forma que suas câmeras acopladas possam obter uma visão completa da região, enviando essas imagens novamente para a Terra.
* A posição de cada robô é representada pela combinação de coordenadas cartesianas (x, y) e por uma letra, que pode representar uma das quatro orientações: NORTH, SOUTH, EAST e WEST.
* Para controlar cada robô, a NASA envia uma string simples, que pode conter as letras ‘L’, ‘R’ e ‘M’. As letras ‘L’ e ‘R’ fazem o robô rotacionar em seu próprio eixo 90 graus para esquerda ou para direita, respectivamente, sem se mover da sua posição atual. A letra ‘M’ faz o robô deslocar-se uma posição para frente.

# Implementação
Nesse projeto utilizei Spring Boot como framework para desenvolvimento da aplicação em Java, JUnit para testes unitários e uma maquina de estados para controle do robô (direções e movimento).
