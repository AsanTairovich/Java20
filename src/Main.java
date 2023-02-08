import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String soz = scanner.nextLine();
        Kyrgyzstan kyrgyzstan = Kyrgyzstan.valueOf(soz.toUpperCase());
        switch (kyrgyzstan){
            case CHUI -> System.out.println(kyrgyzstan.getJ());
            case OSH -> System.out.println(kyrgyzstan.getJ());
            case DJAL_ALABAT -> System.out.println(kyrgyzstan.getJ());
            case NAARYN -> System.out.println(kyrgyzstan.getJ());
            case BATCEN -> System.out.println(kyrgyzstan.getJ());
            case YSYK_KOL -> System.out.println(kyrgyzstan.getJ());
            case TALAS -> System.out.println(kyrgyzstan.getJ());

        }
    }
}