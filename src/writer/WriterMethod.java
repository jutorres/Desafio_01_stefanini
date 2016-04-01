package writer;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import Reader.Consults;

public class WriterMethod {
	
	public Consults writeFile() throws IOException {
		Consults consults = new Consults();
		String str = consults.toString();
		
		final String userhome = System.getProperty("user.home");
		final File folder = new File(userhome + File.separator + "data" + File.separator + "out");
		File filesave = new File(folder + File.separator + "done.dat");
		FileWriter fw = new FileWriter(filesave.getAbsoluteFile());
        BufferedWriter bw = new BufferedWriter(fw);
        
        StringBuilder builder = new StringBuilder();
        String srt1 = builder.append(str).toString();
        bw.write(srt1);
        bw.close();
        return consults;
	}
	
	
	}

