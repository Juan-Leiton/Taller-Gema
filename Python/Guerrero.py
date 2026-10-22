from personaje import Personaje

class Guerrero(Personaje):
    def __init__(self, nombre, vida_maxima, ataque, defensa):
        super().__init__(nombre, vida_maxima, ataque)
        self.defensa = defensa

    def recibir_dano(self, cantidad):
        if cantidad < 0:
            raise ValueError("El daño no puede ser negativo")
        dano_real = max(0, cantidad - self.defensa)
        super().recibir_dano(dano_real)

    def __str__(self):
        return f"{super().__str__()} | Defensa: {self.defensa}"