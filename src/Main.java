public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        int years = 3 ; // Срок кредита
        int amount = 1000000 ; // Сумма кредита
        double rate = 9.9  ; // Годовая процентная ставка

        double monthlyPayment = service.calculate( 1000000,1, 9.9);
        int finalPayment = (int) Math.round(monthlyPayment);


        System.out.println("Ежемесячный платеж :" + finalPayment + "рублей");
        System.out.println("Срок кредита :" + years + "года");
        System.out.println("Процентная ставка: " + rate + " %");

        double monthlyPayment2 = service.calculate(1000000, 2, 9.9 );
        int finalPayment2 = (int) Math.round(monthlyPayment2);
        int years2 = 2 ;

        System.out.println("Ежемесячный платеж :" + finalPayment2 + "рублей");
        System.out.println("Срок кредита :" + years2 + "года");
        System.out.println("Процентная ставка: " + rate + " %");


        double monthlyPayment3 = service.calculate( 1000000, 3, 9.9 );
        int finalPayment3 = (int) Math.round(monthlyPayment3);
        int years3 = 1;

        System.out.println("Ежемесячнй платеж :" + finalPayment3 + "рублей");
        System.out.println("Срок кредита :" + years3 + "год");
        System.out.println("Процентная ставка: " + rate + " %");

    }
}
