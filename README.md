# TP4-Java

Realiser par RAHIOUI Youssef
## Ex 1 
En conclusion, cet exercice m'a permis d'appliquer les concepts fondamentaux de la programmation orientée objet en Java, notamment la généricité avec l'interface IMetier<T>, l'implémentation des collections pour la gestion des données, et la création d'une application console interactive offrant les fonctionnalités CRUD (Create, Read, Update, Delete) sur les produits. La structure modulaire adoptée, séparant clairement l'interface des implémentations concrètes, favorise la maintenabilité et l'extensibilité du code, constituant ainsi une base solide pour d'éventuels développements futurs comme l'ajout de persistance des données ou d'une interface graphique plus élaborée.

## Ex 2 
Les wildcards en Java offrent une flexibilité essentielle dans la manipulation des collections génériques, comme démontré dans cet exercice. Le wildcard borné supérieurement (<? extends Animal>) nous permet de lire des éléments d'une collection de n'importe quelle sous-classe d'Animal, mais pas d'y ajouter d'éléments, tandis que le wildcard borné inférieurement (<? super Chien>) nous permet d'ajouter des Chiens à une collection contenant des Chiens ou leurs superclasses. Le wildcard non borné (<?>) accepte n'importe quel type de collection mais limite les opérations aux méthodes d'Object. Cette approche suit le principe PECS (Producer Extends, Consumer Super), offrant une solution élégante pour créer des méthodes génériques qui maintiennent la sécurité de type à la compilation tout en maximisant la réutilisabilité.
