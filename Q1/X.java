package day11.Q1;

public interface X {
	
	
   public static void name1() {
	System.out.println("Static method name1() of X");
  }
   default void name2() {
	   System.out.println("Default method name2() of X");
   }
   
   void name3();
   
   
}
