public class CalcService {
    public int Payment(double sumCredit, double percent, double term) {
        int year = 12;
        double fracpecent = percent / year / 100;
        double myPyament = sumCredit * (fracpecent + (fracpecent / ((Math.pow(1 + fracpecent, term)) - 1)));
        int monthPayment = (int) myPyament;
        return monthPayment;
    }


}