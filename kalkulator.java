/**
 * kalkulator
 */
import java.util.Scanner;


public class kalkulator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int angka1,angka2;

        System.out.println("Pilih oprasi : ");
        System.out.println("1. Penjumlahan");
        System.out.println("2. Pengurangan");
        System.out.println("3. Perkalian");
        System.out.println("4. Pembagian");
        System.out.println("5. hasil bagi");

        System.out.println("Masukan pilihan (1/2/3/4)");
        String pilihan = scanner.nextLine();

        if (pilihan.equals("1")|| pilihan.equals("2")|| pilihan.equals("3") || pilihan.equals("4")){
            System.out.println("Masukan bilangan pertama: ");
            angka1 = scanner.nextInt();
            System.out.println("Masukan bilangan kedua");
            angka2 = scanner.nextInt();

            if (pilihan.equals("1")) {
                System.out.println(angka1 + "+" + angka2+ " = "+ (angka1 + angka2));
            }else if(pilihan.equals("2")){
                System.out.println(angka1 + "-" + angka2+ " = "+ (angka1 - angka2));
            }else if(pilihan.equals("3")){
                System.out.println(angka1 + "*" + angka2+ " = "+ (angka1 * angka2));
            }else if(pilihan.equals("4")){
                System.out.println(angka1 + "/" + angka2+ " = "+ (angka1 / angka2));
            
            }else{  System.out.println("Pilihan invalid");

        }

    }
}
}