public class Main {
    public static void main(String[] args)
    {
        int currBalance = 200; //сумма счета да пополнения
        int addValue = 1001; //вносиммая сумма

        int bonus = 0; //расчет бонусов при выполнении или не выполнении условий акции
        if (addValue > 1000)
            bonus = addValue / 100;

        int newBalance = currBalance + addValue + bonus;
        System.out.println("bonus: " + bonus + " Balance: " + newBalance);
    }
}