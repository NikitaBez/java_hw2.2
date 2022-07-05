public class Main {
    public static void main(String[] args) {
        int startbalance = 100;
        int refill = 3100;

        int bonus;
        if (refill >= 1000) {
            bonus = refill / 100;
        } else {
            bonus = 0;
        }
        int finishbalance = startbalance + refill + bonus;

        System.out.println( " Баланс лицевого счета составляет " + finishbalance + " руб. " );
        System.out.println( " В том числе " + bonus + " бонусных рублей ");
    }
}
