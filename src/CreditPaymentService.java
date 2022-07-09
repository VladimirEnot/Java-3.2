public class CreditPaymentService {
   public double calculate (int amount, int years, double rate) {
       int months = years * 12;
       double monthlyRate = rate / 12 / 100;
       double annuityRatio = monthlyRate + (monthlyRate / ((double) Math.pow(1 + monthlyRate, months) - 1));
       double monthlyPayment = annuityRatio * amount;
       return monthlyPayment;


    }
}
