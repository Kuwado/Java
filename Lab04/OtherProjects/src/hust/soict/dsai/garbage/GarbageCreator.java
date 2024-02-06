package hust.soict.dsai.garbage;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
// Lưu Việt Hoàn - 20215054

public class GarbageCreator {
	public static void main(String[] args) throws IOException {
		String filename = "C:\\Users\\JULLER\\IT3103.732873.2023.1.5054.Hoan.LV\\OtherProjects\\src\\hust\\soict\\dsai\\garbage\\test.txt";
		byte[] inputBytes = { 0 };
		long startTime, endTime;
		inputBytes = Files.readAllBytes(Paths.get(filename));
		startTime = System.currentTimeMillis();
		String outputString = "";
		for (byte b : inputBytes) {
			outputString += (char) b;
		}
		endTime = System.currentTimeMillis();
		System.out.println(endTime - startTime);
	}
}