import java.io.*;

public class FileExam1	 {

	public static void main(String[] args) {
		// FileReader file = new FileReader("test.java"); --> 에러발생
		try {
			FileReader file = new FileReader("test.java");
		} catch (FileNotFoundException fe) {
			System.out.println("fe.toString() : "+fe.toString());
			
		}
	}

}