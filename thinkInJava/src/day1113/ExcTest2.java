package day1113;

public class ExcTest2 {
    public static void main(String[] args) {
        int[] arr = null;
        try{
            System.out.println(arr.length);
        }catch (Exception e){
            System.out.println("err");
            e.printStackTrace();
        }
    }
}
