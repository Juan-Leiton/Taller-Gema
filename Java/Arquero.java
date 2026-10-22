public class Arquero extends Personaje {
    private int flechas;

    public Arquero(String nombre, int vidaMaxima, int ataque, int flechas) {
        super(nombre, vidaMaxima, ataque);

        if (flechas < 0) {
            throw new IllegalArgumentException(
                "Las flechas no pueden ser negativas"
            );
        }

        this.flechas = flechas;
    }

    @Override
    public void atacar(Personaje objetivo) {
        if (estaVivo() && flechas > 0) {
            flechas--;
            objetivo.recibirDano(getAtaque());
        }
    }

    @Override
    public String toString() {
        return super.toString() + " | Flechas: " + flechas;
    }
}