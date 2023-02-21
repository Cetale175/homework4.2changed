public class Main {
    public static void main(String[] args) {
        BmiService service =  new BmiService();
        double results = service.calculate(77, 1.82);

        System.out.println(results);

    }
}