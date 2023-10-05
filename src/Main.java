public class Main {
    public static void main(String[] args) {

        int balance = 500;
        int replenished = 1200;
        int bonus = 0;

        if (replenished >= 1000) {
            bonus = (int) Math.floor(replenished / 100) * 1;
            balance += replenished + bonus;
        }else{
            balance += replenished;

        }

        System.out.println("Новый баланс"+balance);

        System.out.println("Начисленно бонусов"+bonus);

        // Новый баланс1712
        //Начисленно бонусов12 (При пополнении на 1200 т.е >1000)
        //
        // Новый баланс700
        //Начисленно бонусов0 (При пополнении на 200 т.е <1000)
    }
}