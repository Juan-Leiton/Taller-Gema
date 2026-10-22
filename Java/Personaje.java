public class Personaje {
    private String nombre;
    private int vida;
    private int vidaMaxima;
    private int ataque;

    public Personaje(String nombre, int vidaMaxima, int ataque) {
        if (vidaMaxima < 0 || ataque < 0) {
            throw new IllegalArgumentException(
                "La vida máxima y el ataque no pueden ser negativos"
            );
        }

        this.nombre = nombre;
        this.vidaMaxima = vidaMaxima;
        this.ataque = ataque;
        setVida(vidaMaxima);
    }

    public int getVida() {
        return vida;
    }

    public int getVidaMaxima() {
        return vidaMaxima;
    }

    public int getAtaque() {
        return ataque;
    }

    public String getNombre() {
        return nombre;
    }

    public void setVida(int valor) {
        this.vida = Math.max(0, Math.min(valor, vidaMaxima));
    }

    public void recibirDano(int cantidad) {
        if (cantidad < 0) {
            throw new IllegalArgumentException(
                "El daño no puede ser negativo"
            );
        }
        setVida(vida - cantidad);
    }

    public boolean estaVivo() {
        return vida > 0;
    }

    public void atacar(Personaje objetivo) {
        if (estaVivo()) {
            objetivo.recibirDano(ataque);
        }
    }

    @Override
    public String toString() {
        return nombre + ": " + vida + "/" + vidaMaxima + " HP";
    }
}