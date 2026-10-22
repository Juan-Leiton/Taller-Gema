from personaje import Personaje

class Arquero(Personaje):
    def __init__(self, nombre, vida_maxima, ataque, flechas):
        super().__init__(nombre, vida_maxima, ataque)
        self.flechas = flechas

    def atacar(self, objetivo):
        if self.esta_vivo() and self.flechas > 0:
            self.flechas -= 1
            objetivo.recibir_dano(self.ataque)

    def __str__(self):
        return f"{super().__str__()} | Flechas: {self.flechas}"
