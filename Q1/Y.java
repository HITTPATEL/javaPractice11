package day11.Q1;

public interface Y {
	
	   public static void name4() {
			System.out.println("Static method name4 Of Y");
	   }
	    default void name5() {
	 	   System.out.println("Default method name5() of Y");
	    }
	    
	    void name6();

}
