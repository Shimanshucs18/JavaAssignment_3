package Source;
import javax.xml.transform.Source;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

public class Question1 {
    public static void main(String[] args) {
        double sum=0.0;
        List <Double> list = new LinkedList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter floating point values in the list till you enter -1");
        double d = sc.nextDouble();
        while(d!=-1) {
            list.add(d);
            d=sc.nextDouble();
    }
        ListIterator<Double> itr = list.listIterator();
        while(itr.hasNext()) {
            sum+=itr.next();
        }
        System.out.println("Sum of the elements of the list is " +sum);
    }
}
