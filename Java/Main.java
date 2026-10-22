public class Main {
    public static void main(String[] args) {
        Guerrero guerrero = new Guerrero("Thor", 150, 25, 10);
        Mago mago = new Mago("Merlin", 80, 40, 50);
        Arquero arquero = new Arquero("Legolas", 100, 20, 5);

        System.out.println(guerrero);
        System.out.println(mago);
        System.out.println(arquero);

        guerrero.atacar(mago);
        mago.atacar(guerrero);
        arquero.atacar(guerrero);

        System.out.println("\nDespués del combate:");
        System.out.println(guerrero);
        System.out.println(mago);
        System.out.println(arquero);
    }
}