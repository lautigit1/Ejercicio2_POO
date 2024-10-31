public class Main {
    public static void main(String[] args) {
        // Creación de dos planetas
        Planeta planeta1 = new Planeta("Júpiter", 79, 1.898E27, 1.43128E15, 139820, 778, TipoPlaneta.GASEOSO, true);
        Planeta planeta2 = new Planeta("Marte", 2, 6.39E23, 1.6318E11, 6779, 228, TipoPlaneta.TERRESTRE, true);

        // Imprimir los datos de cada planeta
        planeta1.imprimir();
        planeta2.imprimir();
    }
}
