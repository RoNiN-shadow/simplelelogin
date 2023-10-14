//import java.security.KeyStore;

import java.util.ArrayList;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
      ArrayList<String> names = new ArrayList<>();
      ArrayList<String> passwords = new ArrayList<>();
      signup registration = new signup(names, passwords);
      registration.ask();

      login logining = new login(names, passwords);
      logining.logask();
    }

}