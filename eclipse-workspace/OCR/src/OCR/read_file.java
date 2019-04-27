package OCR;

import java.io.BufferedReader;
import java.io.FileReader;

public class read_file {
	
	
	public String read_file(String file_name) {

		BufferedReader br = null; 
		String read_string="";
		try {

			String sCurrentLine;

			br = new BufferedReader(new FileReader("c:\\Tesseract-OCR\\"+"out.txt"));

			while ((sCurrentLine = br.readLine()) != null) {
				
				read_string=read_string+sCurrentLine;
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (br != null)br.close();
			} catch (Exception ex) {
				ex.printStackTrace();
			}
		}
		return read_string;

	}
}
