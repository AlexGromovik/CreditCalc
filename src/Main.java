public class Main {
    public static void main(String[] args) {

        CalcService service = new CalcService();
        double sumCredit = 1_000_000; // сумма кредита4
        double percent = 9.99; // годовая процентная ставка
        double term = 12; // срок кредита в месяцах
        int myPyament;
        myPyament = service.Payment(sumCredit, percent, term);
        System.out.println("Ежемесячный платеж составит " + myPyament);

        System.out.println();
        System.out.println("Миллион на 2 года");
        System.out.println(service.Payment(1_000_000, 9.99, 24));

        System.out.println();
        System.out.println("Миллион на 3 года");
        System.out.println(service.Payment(1_000_000, 9.99, 36));
    }
}