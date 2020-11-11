package D_JavaAdvancedOOP.Lecture4_InterfaceAndAbstraction.ExProblem_2;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws IOException {

        Class[] citizenInterfaces = Citizen.class.getInterfaces();
        if (Arrays.asList(citizenInterfaces).contains(Birthable.class)
                && Arrays.asList(citizenInterfaces).contains(Identifiable.class)) {

            Method[] methods = Identifiable.class.getDeclaredMethods();

            Scanner scanner = new Scanner(System.in);

            String name = scanner.nextLine();
            int age = Integer.parseInt(scanner.nextLine());
            String id = scanner.nextLine();
            String birthDate = scanner.nextLine();
            Identifiable identifiable = new Citizen(name,age,id,birthDate);
            Birthable birthable = new Citizen(name,age,id,birthDate);


            // methods.length - vrashta broikata na metodite koito imash v INTERFACE-a -  Identifiable
            System.out.println(methods.length);
            //methods[0].getReturnType(). - class java.lang.String;
            //methods[0].getReturnType().getSimpleName() - String;
            System.out.println(methods[0].getReturnType().getSimpleName());
            System.out.println(methods.length);
            System.out.println(methods[0].getReturnType().getSimpleName());
        }




    }
}
