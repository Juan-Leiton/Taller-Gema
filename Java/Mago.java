public class Mago extends Personaje {
    private int mana;

    public Mago(String nombre, int vidaMaxima, int ataque, int mana) {
        super(nombre, vidaMaxima, ataque);

        if (mana < 0) {
            throw new IllegalArgumentException(
                "El maná no puede ser negativo"
            );
        }

        this.mana = mana;
    }

    @Override
    public void atacar(Personaje objetivo) {
        if (estaVivo() && mana >= 10) {
            mana -= 10;
            objetivo.recibirDano(getAtaque());
        }
    }

    @Override
    public String toString() {
        return super.toString() + " | Maná: " + mana;
    }
}