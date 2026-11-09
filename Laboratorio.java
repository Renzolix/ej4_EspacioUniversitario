public class Laboratorio extends EspacioUniversitario {

    @Override
    public void limpiar() {
        System.out.println("Desinfectando mesas de trabajo y esterilizando instrumental de laboratorio.");
    }

    public void calibrarEquipos() {
        System.out.println("-> [Acción Específica] Calibrando osciloscopios y microscopios digitales.");
    }
}