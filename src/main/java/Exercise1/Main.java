package Exercise1;

public class Main {
    //Test LMT
    public static void main(String[] args) {
        //Khởi tạo theo Circle()
        Circle c1 = new Circle(6);
        System.out.println(c1);

        Circle c2 = new Circle();
        System.out.println(c2);

        c1.setRadius(5);
        System.out.println(c1);
        System.out.println("Bán kính là: " + c1.getRadius());

        System.out.printf("Diện tích là: %.3f%n", c1.getArea());
        System.out.printf("Chu vi là: %.3f%n", c1.getCircumference());
        try{
            Circle c3 = new Circle(-2);
            c3.setRadius(-3);
        }
        catch (Exception e){
            System.out.println(e);
        }
    }
}
