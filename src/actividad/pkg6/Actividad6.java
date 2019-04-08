package actividad.pkg6;

import java.util.Scanner;

/**
 *
 * @author lalor
 */
public class Actividad6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Scanner leer = new Scanner(System.in);
        int numeroconv;
        String numeroconv2;
        int result;
        String son;
        int repetir = 1;

        System.out.println("** Programa de conversiones**");
        System.out.println("a. Convertir de decimal a binario");
        System.out.println("b. Convertir de decimal a octal");
        System.out.println("c. Convertir de decimal a hexadecimal");
        System.out.println("d. Convertir de binario a decimal");
        System.out.println("e. Convertir de octal a decimal");
        System.out.println("f. Convertir de hexadecimal a decimal");

        while (repetir > 0) {
            System.out.print("Tipo de conversion? ");
            String solicitud = sc.nextLine();

            switch (solicitud) {
                case "a":
                    System.out.print("Numero a convertir? ");
                    numeroconv = sc.nextInt();
                    sc.nextLine();
                    String binario = Integer.toBinaryString(numeroconv);
                    System.out.println("El numero " + numeroconv + " en base binario es: " + binario);
                    break;
                case "b":
                    System.out.print("Numero a convertir? ");
                    numeroconv = sc.nextInt();
                    sc.nextLine();
                    String octal = Integer.toOctalString(numeroconv);
                    System.out.println("El numero " + numeroconv + " en base octal es: " + octal);
                    break;
                case "c":
                    System.out.print("Numero a convertir? ");
                    numeroconv = sc.nextInt();
                    sc.nextLine();
                    String hexadecimal = Integer.toHexString(numeroconv);
                    System.out.println("El numero " + numeroconv + " en base hexadecimal es: " + hexadecimal);
                    break;
                case "d":
                    System.out.print("Numero a convertir? ");
                    numeroconv2 = sc.nextLine();
                    result = Integer.parseInt(numeroconv2, 2);
                    System.out.println("El numero binario " + numeroconv2 + " en decimal es: " + result);
                    break;
                case "e":
                    System.out.print("Numero a convertir? ");
                    numeroconv2 = sc.nextLine();
                    result = Integer.parseInt(numeroconv2, 8);
                    System.out.println("El numero octal " + numeroconv2 + " en decimal es: " + result);
                    break;
                case "f":
                    System.out.print("Numero a convertir? ");
                    numeroconv2 = sc.nextLine();
                    result = Integer.parseInt(numeroconv2, 16);
                    System.out.println("El numero hexadecimal " + numeroconv2 + " en decimal es: " + result);
                    break;
                default:

                    System.out.println("No ingreso de manera correcta los datos, intente nuevamente");
                    break;
            }

            System.out.print("Desea Otra conversión (si/no)? ");
            son = leer.nextLine();
            if ("si".equals(son)) {
                repetir = 1;
            } else {
                repetir = 0;
            }
        }
    }

}
