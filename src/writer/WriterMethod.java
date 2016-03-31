package writer;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriterMethod {
	
	public BufferedWriter fileWriter() throws IOException {
		final String userhome = System.getProperty("user.home");
		final File folder = new File(userhome + File.separator + "data" + File.separator + "out");
		File filesave = new File(folder + File.separator + "done.dat");
		FileWriter fw = new FileWriter(filesave.getAbsoluteFile());
        BufferedWriter bw = new BufferedWriter(fw);
        return bw;
	}
	
	
	}

