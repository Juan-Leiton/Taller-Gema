class Personaje:
    def __init__(self, nombre, vida_maxima, ataque):
        self.nombre = nombre
        self.vida_maxima = vida_maxima
        self.ataque = ataque
        self.vida = vida_maxima

    @property
    def vida(self):
        return self.__vida

    @vida.setter
    def vida(self, valor):
        self.__vida = max(0, min(valor, self.vida_maxima))

    def recibir_dano(self, cantidad):
        if cantidad < 0:
            raise ValueError("El daño no puede ser negativo")
        self.vida -= cantidad

    def esta_vivo(self):
        return self.vida > 0

    def atacar(self, objetivo):
        if self.esta_vivo():
            objetivo.recibir_dano(self.ataque)

    def __str__(self):
        return f"{self.nombre}: {self.vida}/{self.vida_maxima} HP"