package day11.Q1;

public interface Z extends X,Y {
    void name7();

	@Override
	default void name2() {
		// TODO Auto-generated method stub
		System.out.println("Overridden default method In Z of X");
	}

	
}
