import java.util.ArrayList;
import java.util.Scanner;

public class login {
    private ArrayList<String> names;
    private ArrayList<String> passwords;
    private Scanner scanner;

    public login(ArrayList<String> names, ArrayList<String> passwords){
        this.names = names;
        this.passwords = passwords;
        this.scanner = new Scanner(System.in);
    }
    public void logask(){
        System.out.print("Введіть ваше ім'я: ");
        String loginName = scanner.nextLine();
        System.out.print("Введіть пароль: ");
        String loginPassword = scanner.nextLine();

        if (names.contains(loginName) && passwords.contains(loginPassword)) {
            System.out.println("Ви успішно увійшли!");
        } else {
            System.out.println("Неправильне ім'я або пароль.");
        }
        scanner.close();
    }
}
