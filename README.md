## Padrões de Projetos
<h2>O que são?</h2>
Padrões de Projetos ou Design Patterns, são soluções de alto nível (entendimento a nível desenvolvedor) de como problemas comuns podem ser resolvidos.

## Strategy
Identificando situação de uso (Pasta `strategyshowcase`)
- Várias classes possuem métodos que realizam uma mesma função, porém com implementações distintas.<br>

Solução (Pasta `strategysolution`)
- Criação de uma interface que contém o método abstrato (método este, que é comum a todas classes envolvidas);
- Implementação nas devidas classes com o uso da palavra reservada "implements".

Obs:. Desta maneira a manutenção do código se torna mais fácil, adicionar ou retirar algum serviço se torna mais simples.
