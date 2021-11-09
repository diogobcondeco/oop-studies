# OOP Studies

In this example I use:
- Inheritance
- Encapsulation
- Polymorphism
- Abstraction
---
In this app example, I used OOP to create three different types of Soldiers:
- Warriors
- Veterans
- Jedi
---
They all share the same properties and behaviors, they have:
- A name
- The ability to eat
- The ability to relax
- The ability to attack
---
- The name is set when we create the instance.
- The abilities "eat" and "relax" are the same for all of them.
- The ability "attack" is the only one that's different.
---
- The warrior can't fly and attacks with swords.
- The veteran can fly and attacks with guns.
- The jedi can fly and attacks with lasers.
---
Print example
```
----- GET NAME -----
Tiago
Daniel
Diogo
----- GET CAN FLY -----
false
true
true
----- EAT ----------
Tiago is eating
Daniel is eating
Diogo is eating
----- RELAX -----
Tiago is relaxing
Daniel is relaxing
Diogo is relaxing
----- ATTACK -----
The warrior Tiago runs to the enemy and attacks by swinging his tiny dagger
The veteran Daniel gets his Desert Eagle, loads with his .50 bullets, aims at the enemy and shoots it perfectly
The jedi Diogo uses his power to fly super high in the sky and uses his laser to attack
----- PEASANT STUFF -----
Peasant is eating
Peasant is relaxing
Peasant
```