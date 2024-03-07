import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        Scanner scanner= new Scanner(System.in);
        System.out.println("Donnez les coordonnées de votre premier point ");
        System.out.print("X=");
        double X1= scanner.nextDouble();
        System.out.print("Y=");
        double Y1= scanner.nextDouble();
        System.out.println("Donnez les coordonnées de votre deuxième point ");
        System.out.print("X=");
        double X2= scanner.nextDouble();
        System.out.print("Y=");
        double Y2= scanner.nextDouble();
        System.out.println("Donnez les coordonnées de votre troisième point ");
        System.out.print("X=");
        double X3= scanner.nextDouble();
        System.out.print("Y=");
        double Y3= scanner.nextDouble();

        Point P1= new Point(X1, Y2);
        Point P2= new Point(X2, Y2);
        Point P3= new Point(X3, Y3);

        String S= P1.toString(), Q=P2.toString(), L=P3.toString();

        System.out.println("Les trois points sont:");
        System.out.println("A="+ S);
        System.out.println("B="+ Q);
        System.out.println("C="+ L);

        System.out.println("La distance AB= "+ P2.calculerDistance(P1)+"  et le milieu du segment AB est" + P2.calculerMilieu(P1));
        System.out.println("La distance BC= "+ P2.calculerDistance(P3)+"  et le milieu du segment BC est" + P2.calculerMilieu(P3));
        System.out.println("La distance AC= "+ P3.calculerDistance(P1)+"  et le milieu du segment AC est" + P3.calculerMilieu(P1));


        TroisPoints troisPoints = new TroisPoints(P1, P2, P3);
        System.out.println("Les points A, B et C sont alignés: "+ troisPoints.sontAlignés());

        System.out.println("Les points A, B et C, forment-ils un triangle isocèle?");
        System.out.println(troisPoints.sontIsocèles());




    }
}
