package menu;

public class MainMenu implements Menu{
    //auth

    public MainMenu(){
        System.out.println("Добро пожаловать в систему PizzaPresto <3");
        menu();
    }

    @Override
    public void menu() {
        while(true) {
            printMainMenu();
            String choice = in.next();
            switch (choice) {
                case "1": {  //custom1er
                    new CustomerMenu();
                    System.out.println("User");
                    break;
                }
                case "2": {  //pizzaMaker
                    new PizzaMakerMenu();
                    System.out.println("pizzaMaker");
                    break;
                }
                case "3": {  //admin
                    new AdminMenu();
                    System.out.println("admin");
                    break;
                }
                case "0": {  //exit
                    System.exit(0);
                    break;
                }
                default:
                    System.out.println("Ошибка, попробуй ещё раз..");
            }
        }
    }

    private void printMainMenu(){
        System.out.println("1. Войти как пользователь");
        System.out.println("2. Войти как пиццамейкер");
        System.out.println("3. Войти как администратор");
        System.out.println("0. Выход");
    }
}
