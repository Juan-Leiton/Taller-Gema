from personaje import Personaje

class Mago(Personaje):
    def __init__(self, nombre, vida_maxima, ataque, mana):
        super().__init__(nombre, vida_maxima, ataque)
        self.mana = mana

    def atacar(self, objetivo):
        if self.esta_vivo() and self.mana >= 10:
            self.mana -= 10
            objetivo.recibir_dano(self.ataque)

    def __str__(self):
        return f"{super().__str__()} | Maná: {self.mana}"