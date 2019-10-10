public class WrappersDelight {
    public static void main(String[] args){
        int num1 = 14;
        Integer num2 = new Integer(8);
        double num3 = 2.5;
        Double num4 = num2 + num3;
        num2= 5;
        num3 = num2 + num1 + num4;
        num1 = (int) (num2 + num4);

        System.out.print(num1 + "\n" + num2 + "\n" + num3 + "\n" + num4);
    }
}
