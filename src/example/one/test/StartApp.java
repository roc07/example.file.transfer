package example.one.test;

import java.io.*;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.Paths;

public class StartApp {

	public static void main(String[] args) throws IOException {
		
		FileInputStream in = null;
		FileOutputStream out = null;
		
		Path strt = Paths.get(".\\src\\example\\one\\cross.png");
		Path realPath = strt.toRealPath(LinkOption.NOFOLLOW_LINKS);
		
		System.out.println(realPath);
		File start = new File(".\\src\\example\\one\\cross.png");
		File finish = new File(".\\src\\example\\one\\out.png");

		try {
			in = new FileInputStream("C:\\_java_practice\\example.one\\src\\example\\one\\test\\8thbit.png");
			out = new FileOutputStream("C:\\_java_practice\\example.one\\src\\example\\one\\done.png");
			
	        int c;
	        while ((c = in.read()) != -1) {
	          out.write(c);
	        }	        	       	        
	    } finally {
	        if (in != null) {
	          in.close();
	        }
	        if (out != null) {
	           out.close();
	        }
	    }
		
		try {
	        in = new FileInputStream(start);
	        out = new FileOutputStream(finish);
	        
	        int x;
	        while ((x = in.read()) != -1) {
	          out.write(x);
	        }			
		} finally {
			if (in != null) {
				in.close();
			}
			if (out != null) {
				out.close();
			}
		}

		
		System.out.println("Done.");
	}

}
