import com.npruse65.id023.HumanBeing;
//import com.npruse65.id023.BmiIndexer;
//import com.npruse65.id023.HealthAnalyzer;


public class TestDrive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HumanBeing hb1 = new HumanBeing();
		hb1.setHeight(180);
		hb1.setWeight(53);
		hb1.calculateBMI();
		System.out.println("BMI : " + hb1.getBmi());
		System.out.println(hb1.analyzeBmi());

	}

}
