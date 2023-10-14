import java.util.ArrayList;
import java.util.Scanner;

public class signup {
    private ArrayList<String> names;
    private ArrayList<String> passwords;
    private Scanner scanner;

    public signup(ArrayList<String> names, ArrayList<String> passwords){
        this.names = names;
        this.passwords = passwords;
        this.scanner = new Scanner(System.in);
    }
    public void ask(){
        System.out.print("Введіть ваше ім'я: ");
        String name = scanner.nextLine();
        names.add(name);
        System.out.print("Створіть свій пароль: ");
        String password = scanner.nextLine();
        passwords.add(password);
        System.out.println("Реєстрація успішна.");
    }

}
