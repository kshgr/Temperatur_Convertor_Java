import java.util.Scanner;
import java.text.DecimalFormat;

public class Main
{
    static double Input, Kelvin, Fahrenheit, Celsius;

    public static double get_input()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Temperature to convert: ");
        double Input = scanner.nextDouble();

        return Input;
    }

    public static char Unit(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Unit (K,C or F): ");
        char Unit = scanner.next().charAt(0);
        scanner.close();
        return Unit;
    }
    public static void main(String[] args)
    {
        Input = get_input();
        char Unit = Unit();
        switch (Unit) {
            case 'K' -> {
                Kelvin = Input;
                Celsius = Kelvin - 273.15;
                Fahrenheit = ((Celsius * 9) / 5) + 32;
            }
            case 'C' -> {
                Celsius = Input;
                Kelvin = Celsius + 273.15;
                Fahrenheit = ((Celsius * 9) / 5) + 32;
            }
            case 'F' -> {
                Fahrenheit = Input;
                Celsius = (Fahrenheit - 32) * 5 / 9;
                Kelvin = Celsius + 273.15;
            }
            default -> {
                System.out.println("Please enter valid Unit!");
                return;
            }
        }

        DecimalFormat df = new DecimalFormat("#.##");
        System.out.println(Input + " " + Unit + " is equivalent to:");
        System.out.println(df.format(Kelvin) + " K or");
        System.out.println(df.format(Celsius) + " C or");
        System.out.println(df.format(Fahrenheit) + " F");

    }
}