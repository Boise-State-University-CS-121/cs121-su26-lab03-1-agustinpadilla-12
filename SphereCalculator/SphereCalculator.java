import java.util.Scanner;

public class SphereCalculator {
    
    public static void main(String[] args)

    {
        Scanner kbd = new Scanner(System.in);
        double sphereRadius;
        double volume;
        double surfaceArea;

        System.out.print("Enter the sphere's radius: ");
        
        sphereRadius = kbd.nextInt();
        volume = ((double) 4 / 3) * (Math.PI) * (Math.pow(sphereRadius , 3));
        surfaceArea = 4 * (Math.PI) * (Math.pow(sphereRadius , 2));

        System.out.printf("Volume: %.4f\n" , volume);
        System.out.printf("Surface area: %.4f\n" , surfaceArea);

        
        kbd.close();
    }
}
