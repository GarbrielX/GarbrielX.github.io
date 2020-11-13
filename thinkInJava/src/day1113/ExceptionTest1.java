package day1113;

public class ExceptionTest1 {
    public static void main(String[] args) {
        try {
            throw new Exception("i am an exception");
        }catch (Exception e){
            System.out.println(e);
            e.printStackTrace();
        }finally {
            System.out.println("completed");
        }
    }
}
