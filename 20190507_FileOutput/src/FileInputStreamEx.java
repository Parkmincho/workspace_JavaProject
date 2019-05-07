import java.io.FileOutputStream;
import java.io.IOException;

public class FileInputStreamEx {

	public static void main(String[] args) {
		byte b[] = new byte [6];
		try {
			FileIutputStream fin = new FileInputStream("test.out");
			int n = 0, c;
			while((c = fin.read()) != -1 ) {
				b[n] = (byte)c;
				n++;
			}

			System.out.println("test.out에서 읽은 배열을 출력합니다.");
			for((int i = 0; i < b.length; i++)
					System.out.print(b[i] + "	");
			System.out.println();
			fout.write(b[i]);
			fout.close();
		}
		catch(IOException e) {
			System.out.println("test.out에 저장할 수 없었습니다. 경로명을 확인해 주세요.");
			return;
		}
		System.out.println("test.out을 저장하였습니다.");
	}
}