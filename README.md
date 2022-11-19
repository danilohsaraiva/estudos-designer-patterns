## Padrões de Projetos/ Design Patterns
<h2>O que são?</h2>
Soluções de alto nível (entendimento a nível desenvolvedor), de como problemas comuns podem ser resolvidos.

<h2>Importância de estudá-los</h2>
O estudo dessas soluções tem impacto direto na assimilação de códigos e na resoluções de problemas, a partir da compreensão de seu caso de uso e implementação.

<h2>Observação adicional🚧</h2>

- Conceitos se aplicam independente da linguagem.
- Linguagem utilizada neste repositório: Java.

## Strategy
Consiste em criar uma classe abstrata para ser implementada por classes concretas que realizam um mesmo método com implementações distintas.<br>

- Ilustração do problema (Pasta `strategyshowcase`).
- Proposta de solução (Pasta `strategysolution`).

Obs:. Melhora manutenibilidade, coesão e diminuição no acoplamento do código.

## Singleton

Consiste na classe reservar o direito de se autoinstanciar, para isso seu construtor e atributo instância (do mesmo tipo da classe) tem de ter modificador de acesso private. Para acessá-lo é necessário um método public que retorna essa instância ou realiza a instanciação caso null.
Isso implica que independente da quantidade de chamadas ao método, só será instanciado um único objeto.

- Pasta modelo `singleton`

Obs:. Há outras formas para implementar este resultado, o conceito em sí está em reservar a instância da classe a ela mesma, evitando assim que mais objetos sejam criados com base nesta classe.

