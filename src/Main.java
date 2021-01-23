public class Main {
    public static void main(String[] args) {
        PaymentService service1 = new PaymentService();
        double years1 = 1;
        double loan1 = 1_000_000;
        double interest1 = 9.99;
        double payment1 = service1.calculate(years1,loan1,interest1);
        System.out.println((int)payment1);

        PaymentService service2 = new PaymentService();
        double years2 = 2;
        double loan2 = 1_000_000;
        double interest2 = 9.99;
        double payment2 = service2.calculate(years2,loan2,interest2);
        System.out.println((int)payment2);

        PaymentService service3 = new PaymentService();
        double years3 = 3;
        double loan3 = 1_000_000;
        double interest3 = 9.99;
        double payment3 = service3.calculate(years3,loan3,interest3);
        System.out.println((int)payment3);
    }
}