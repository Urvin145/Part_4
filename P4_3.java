// 21ce145_Urvin thummar
public class P4_3 {
    public static void main(String args[]){
        // ArithmeticException
        try
        {
            int data=100/0; //may throw exception
        }

        catch(ArithmeticException e)
        {
            System.out.println(e);
        }

        finally {
            System.out.println("ArithmeticException");
        }


        // ArrayIndexOutOfBoundsException
        int arr[]= {1,3,5,7};
        try
        {
            System.out.println(arr[10]); //may throw exception
        }

        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println(e);
        }

        finally {
            System.out.println("ArrayIndexOutOfBoundsException");
        }

        System.out.println("21ce145_Urvin Thummar");

    }
}
