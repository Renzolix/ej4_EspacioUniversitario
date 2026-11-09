public class MainEjercicio4 {

    public static void prepararEspacio(EspacioUniversitario espacio) {
        espacio.limpiar(); // Comportamiento heredado polimórfico

        // Downcasting seguro con comprobación de tipo
        if (espacio instanceof Laboratorio) {
            Laboratorio lab = (Laboratorio) espacio;
            lab.calibrarEquipos();
        } else if (espacio instanceof AulaMagna) {
            AulaMagna aula = (AulaMagna) espacio;
            aula.probarSistemaAudio();
        }
        System.out.println();
    }

    public static void main(String[] args) {
        EspacioUniversitario labComp = new Laboratorio();
        EspacioUniversitario aulaCentral = new AulaMagna();

        System.out.println("--- Preparando Instalaciones ---");
        prepararEspacio(labComp);
        prepararEspacio(aulaCentral);
    }
}