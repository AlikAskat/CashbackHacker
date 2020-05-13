import ru.netology.service.CashbackHackService;

class Main {

    public static void main(String[] args) {
        CashbackHackService cashbackHackService = new CashbackHackService();
        {
            System.out.println("It should return 10 for 1000");
            int result = cashbackHackService.remain(1000);
            System.out.println(10 == result);
        }

        {
            System.out.println("Buy no less than 1000");
            int result = cashbackHackService.remain(999);
            System.out.println(0 == result);
        }
    }

}