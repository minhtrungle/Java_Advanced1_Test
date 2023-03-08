package Exercise1;

public class Main {
    //Test LMT
    public static void main(String[] args) {
        //Khởi tạo theo Circle()
        try{
            Circle c2 = new Circle(-2);
            c2.setRadius(-3);
        }
        catch (Exception e){
            System.out.println(e);
        } finally {
            System.out.println("Exit");
        }
        Circle c1 = new Circle(6);
        System.out.println(c1);

        c1.setRadius(5);
        System.out.println(c1);
        System.out.println("Bán kính là: " + c1.getRadius());

        System.out.printf("Diện tích là: %.3f", c1.getArea());
        System.out.printf("Chu vi là: %.3f", c1.getCircumference());

    }
}
