import java.util.*;
import java.util.stream.Collectors;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Rectangle prost1= new Rectangle(5,8);
        Rectangle prost2= new Rectangle(2,12);
        Rectangle prost3= new Rectangle(5,3);
        Rectangle prost4= new Rectangle(2,3);
        Rectangle prost5= new Rectangle(8,8);
        Rectangle prost6= new Rectangle(7,11);
        Rectangle prost7= new Rectangle(4,3);
        Rectangle prost8= new Rectangle(20,4);
        List<Rectangle> prostokaty = Arrays.asList(prost1,prost2,prost3,prost4,prost5,prost6,prost7,prost8);

        List<Rectangle> prostokaty_a = prostokaty.stream()
                .filter(c->c.getArea()>c.getPerimeter())
                .collect(Collectors.toList());
        System.out.println(prostokaty_a);
        System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&");

        List<Rectangle> prostokaty_b = prostokaty.stream()
                .sorted(Comparator.comparingDouble(Rectangle::getPerimeter))
                .collect(Collectors.toList());
        System.out.println(prostokaty_b);
        System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&");

        OptionalDouble prostokaty_c = prostokaty.stream()
                .mapToDouble(Rectangle::getPerimeter)
                .average();
        System.out.println(prostokaty_c);
        System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&");

        double sredniapola = prostokaty.stream()
                .mapToDouble(rectangle -> rectangle.getArea())
                .summaryStatistics().getAverage();
        List<Rectangle> prostokaty_d = prostokaty.stream()
                .filter(c->c.getArea()<sredniapola)
                .sorted(Comparator.comparingDouble(Rectangle::getArea).reversed())
                .collect(Collectors.toList());
        System.out.println(prostokaty_d);
        System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&");

        double prostokaty_e = prostokaty.stream()
                .mapToDouble(Rectangle::getArea)
                .sum();
        System.out.println(prostokaty_e);
        System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&");

        Map<Rectangle,Double> prostokat_map = prostokaty.stream()
                .collect(Collectors.toMap(rectangle -> rectangle, rectangle -> rectangle.getArea()));
        System.out.println(prostokat_map);
    }
}
