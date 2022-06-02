package day11.Q2;

public class Mobile {
	String[] outdatedModels = {"note4","note5","note6","note7"};
   public void searchOutdatedModel(String companyName, String  ...mobileNameModel) {
	       for( String x:outdatedModels) {
	    	   
	    	   for(String y:mobileNameModel) {
	    		   if(x.equals(y)){
                      System.out.println(y+"_OUTDATED");
	    	     }
	       }
	       }
   }
   
   public static void main(String[] args) {
	   Mobile mobile=new Mobile();
	   mobile.searchOutdatedModel("mi","note6","note5","note8");
}
}
