import java.lang.Math;

public class PaymentService {
public float calculate (double years, double loan, double interest) {
    double months = years * 12;
    double month_interest = interest / 100 / 12;
    double coeff1 = month_interest * Math.pow(1+month_interest, months);
    double coeff2 = Math.pow(1+month_interest, months) - 1;
    double coeff = coeff1 / coeff2;
    double payment = coeff * loan;
    return (float) payment;
}
}

   // Размер аннуитетного взноса определяется по формуле: A = K * S, где:

    //А — ежемесячная плата;
   // K — коэффициент аннуитета;
    //S — сумма займа.
   // Коэффициент аннуитета вычисляется по формуле: K = i * (1 + i)n / ((1 + i)n - 1), где:

   // i — месячная процентная ставка (годовая ставка / 12 / 100);
   // n — количество месяцев, в течение которых выплачивается кредит.


