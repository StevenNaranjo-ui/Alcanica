import java.util.Scanner;
//Daniel steven Naranjo Montaño
//codigo en clase sobre alcancia
public class m {
    public static void main(String[] args) {
        int monedas20 = 0;
        int monedas50 = 0;
        int monedas100 = 0;
        int monedas200 = 0;
        int monedas500 = 0;

        Scanner scanner = new Scanner(System.in);
        int opcion = 0;

        while (opcion != 5) {
            System.out.println("\n--- Menú ---");
            System.out.println("1. Agregar moneda");
            System.out.println("2. Contar monedas");
            System.out.println("3. Calcular total ahorrado");
            System.out.println("4. Romper alcancía");
            System.out.println("5. terminar");

            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("que moneda va a ingresar (20, 50, 100, 200, 500): ");
                    int denominacion = scanner.nextInt();
                    switch (denominacion) {
                        case 20:
                            monedas20++;
                            break;
                        case 50:
                            monedas50++;
                            break;
                        case 100:
                            monedas100++;
                            break;
                        case 200:
                            monedas200++;
                            break;
                        case 500:
                            monedas500++;
                            break;
                        default:
                            System.out.println("No existe.");
                    }
                    break;
                case 2:
                    System.out.println("Monedas de $20: " + monedas20);
                    System.out.println("Monedas de $50: " + monedas50);
                    System.out.println("Monedas de $100: " + monedas100);
                    System.out.println("Monedas de $200: " + monedas200);
                    System.out.println("Monedas de $500: " + monedas500);
                    break;
                case 3:
                    int total = monedas20 * 20 + monedas50 * 50 + monedas100 * 100 + monedas200 * 200 + monedas500 * 500;
                    System.out.println("Total ahorrado: $" + total);
                    break;
                case 4:
                    System.out.println("Rompiendo la alcancía...");
                    System.out.println("Monedas de $20: " + monedas20);
                    System.out.println("Monedas de $50: " + monedas50);
                    System.out.println("Monedas de $100: " + monedas100);
                    System.out.println("Monedas de $200: " + monedas200);
                    System.out.println("Monedas de $500: " + monedas500);
                    int totalFinal = monedas20 * 20 + monedas50 * 50 + monedas100 * 100 + monedas200 * 200 + monedas500 * 500;
                    System.out.println("Total ahorrado: $" + totalFinal);


                    monedas20 = 0;
                    monedas50 = 0;
                    monedas100 = 0;
                    monedas200 = 0;
                    monedas500 = 0;
                    System.out.println("Alcancía vaciada.");
                    break;
                case 5:
                    System.out.println("fin");
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        }

        scanner.close();
    }
}

