package OCR;
import java.io.PrintWriter;
public class create_file {
	public void create_output_file(String file_name) {
		String[] command =
	    {
	        "cmd",
	    };
	    Process p;
		try {
			p = Runtime.getRuntime().exec(command);
	    new Thread(new SyncPipe(p.getErrorStream(), System.err)).start();
	    new Thread(new SyncPipe(p.getInputStream(), System.out)).start();
	    PrintWriter stdin = new PrintWriter(p.getOutputStream());
	    stdin.println("cd..");
	    stdin.println("cd..");
	    stdin.println("cd..");
	    stdin.println("cd..");
	    stdin.println("c:");
	    stdin.println("cd..");
	    stdin.println("cd..");
	    stdin.println("cd..");
	    stdin.println("cd Tesseract-OCR ");
	    stdin.println("tesseract "+" "+ "C:\\Users\\haris\\Desktop\\"+file_name +" "+"out");
	    stdin.close();
	    int returnCode = p.waitFor();
	   // System.out.println("Return code = " + returnCode);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}	