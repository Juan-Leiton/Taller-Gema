from guerrero import Guerrero
from mago import Mago
from arquero import Arquero

guerrero = Guerrero("Thor", 150, 25, 10)
mago = Mago("Merlín", 80, 40, 50)
arquero = Arquero("Legolas", 100, 20, 5)

print(guerrero)
print(mago)
print(arquero)

guerrero.atacar(mago)
mago.atacar(guerrero)
arquero.atacar(guerrero)

print("\nDespués del combate:")
print(guerrero)
print(mago)
print(arquero)
