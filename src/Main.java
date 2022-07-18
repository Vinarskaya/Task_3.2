public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        int bmi = (int) service.calculate(65, 1.75F);
        System.out.println(bmi);
    }
}
