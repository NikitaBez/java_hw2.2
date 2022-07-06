public class Main {
    public static void main(String[] args) {
        int startBalance = 100;
        int refill = 1100;

        int bonus;
        if (refill >= 1000) {
            bonus = refill / 100;
        } else {
            bonus = 0;
        }
        int finishBalance = startBalance + refill + bonus;

        System.out.println( " Баланс лицевого счета составляет " + finishBalance + " руб. " );
        System.out.println( " В том числе " + bonus + " бонусных рублей ");
    }
}
