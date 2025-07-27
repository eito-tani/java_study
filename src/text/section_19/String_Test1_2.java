package text.section_19;

public class String_Test1_2 {

   public static void main(String[] args) {
      String moji1 = new String("test");
      String moji2 = new String("test");
      
      //equals()メソッドで比較する  
      if(moji1.equals(moji2)) {
         System.out.println("equals()メソッドで比較した結果は等しい");
      } else {
         System.out.println("equals()メソッドで比較した結果は等しくない");
      }
       
      //等価演算子(==)で比較する 
      if(moji1 == moji2) {
         System.out.println("等価演算子(==)で比較した結果は等しい");
      } else {
         System.out.println("等価演算子(==)で比較した結果は等しくない");
      }
   }

}