        // 21ce145_Urvin Thummar
       import java.io.IOException;
       public class P4_2 {
        void m() throws IOException{
            throw new IOException("Error");//checked exception
        }



        public static void main(String args[]){
            P4_2 obj=new P4_2();
            try
            {
                obj.m();
            }
            catch(IOException e){
                System.out.println("Exception Handled");
            }

            System.out.println("21ce145_Urvin Thummar");
        }
       }