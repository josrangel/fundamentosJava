public class PromedioMaterias {
    public static void main(String[] args) {
        double materias[]={10,5,9,8,7,5,9,9,9,9};
        double sumatoria=0;
        for (double materia:materias) {
            sumatoria += materia;
        }
        System.out.println(sumatoria/10);


    }
}
