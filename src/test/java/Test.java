import com.rainsoft.serviceImpl.TestBaseServiceImpl;

public class Test {

	public static void main(String[] args) {

		TestBaseServiceImpl hi = null;
		try {
			hi = new TestBaseServiceImpl();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(hi);
	}
}
