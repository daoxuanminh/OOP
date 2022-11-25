package hust.soict.dsai.garbage;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class GarbageCreator {

    public static void main(String[] args) throws IOException {
		String filename="E:\\OOP\\Lab02\\AimsProject\\src\\hust\\soict\\dsai\\garbage\\garbage.exe";
		byte[] inputBytes = {0};
		long startTime,endTime;
		try {
			inputBytes=Files.readAllBytes(Paths.get(filename));
        } catch (IOException x) {
            System.err.format("IOException: %s%n", x);
        }
		startTime=System.currentTimeMillis();
		String outputString="";
		
		for(byte b: inputBytes) {
			outputString+=(char)b;
		}
		endTime=System.currentTimeMillis();
		System.out.println(endTime-startTime);
	}
}
