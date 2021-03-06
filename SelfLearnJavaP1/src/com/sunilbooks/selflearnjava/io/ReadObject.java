package com.sunilbooks.selflearnjava.io;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

/**
 * Deserialize an object from a File.
 * 
 * @version 1.0
 * @since 16 Nov 2014
 * @author Sunil Sahu
 * @Copyright (c) Sunil Sahu
 * @url www.sunilbooks.com
 */

public class ReadObject {

	public static void main(String[] args) throws Exception {

		FileInputStream file = new FileInputStream("f:/object.ser");

		// Wrap by ObjectInputStream
		ObjectInputStream in = new ObjectInputStream(file);

		// Read Object
		MarksheetBean m = (MarksheetBean) in.readObject();

		System.out.println("Name : " + m.getName());
		System.out.println("Physics : " + m.getPhysics());
		System.out.println("Chemistry : " + m.getChemistry());
		System.out.println("Maths :" + m.getMaths());
		System.out.println("Percentage : " + m.getPercentage());
		System.out.println("Temp Value: " + m.getTemp());

		in.close();
		file.close();
	}

}
