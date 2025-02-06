public class DataTypes {
    public static void main(String[] args) {

        int num_i = 1;
        float num_f = 3.14f;
        char str_c = 'A';
        String str_s = "hello";
        boolean bool = true;

        System.out.println("num_i: " + num_i);
        System.out.println("num_f: " + num_f);
        System.out.println("str_c: " + str_c);
        System.out.println("str_s: " + str_s);
        System.out.println("bool: "+ bool);

        final String MYNAME= "ShinKwon Jo"; // 앞에 final 붙이면 상수
        // MYNAME = "aaa"; // 수정 불가

        System.out.println("MYNAME: " + MYNAME);

        
        // 형변환 
        String str1 = String.valueOf(123);
        String str2 = Integer.toString(123);
        int num1 = (int)3.14;
        int num2 = Integer.parseInt("456");
        double num3 = Double.parseDouble("45.6");

        System.out.println("str1: " + str1);
        System.out.println("str2: " + str2);
        System.out.println("num1: " + num1);
        System.out.println("num2: " + num2);
        System.out.println("num3: " + num3);
    }
}
