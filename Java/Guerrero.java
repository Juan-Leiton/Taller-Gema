public class Guerrero extends Personaje {
    private int defensa;

    public Guerrero(String nombre, int vidaMaxima, int ataque, int defensa) {
        super(nombre, vidaMaxima, ataque);

        if (defensa < 0) {
            throw new IllegalArgumentException(
                "La defensa no puede ser negativa"
            );
        }

        this.defensa = defensa;
    }

    @Override
    public void recibirDano(int cantidad) {
        if (cantidad < 0) {
            throw new IllegalArgumentException(
                "El daño no puede ser negativo"
            );
        }

        int danoReal = Math.max(0, cantidad - defensa);
        super.recibirDano(danoReal);
    }

    @Override
    public String toString() {
        return super.toString() + " | Defensa: " + defensa;
    }
}