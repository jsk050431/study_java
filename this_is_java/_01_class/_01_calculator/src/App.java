public class App {
    public static void main(String[] args) throws Exception {
        Calculator cal = new Calculator(50,4);
        System.out.println(cal.add());
        System.out.println(cal.sub());
        System.out.println(cal.mul());
        System.out.println(cal.div());

        AddAll sum = new AddAll();
        System.out.println(sum.sum(1,2,3,4,5));
    }
}
