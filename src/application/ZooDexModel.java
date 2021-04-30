/*
 * Application Programming - CS 3433 - 001
 * 2-2:50pm MWF
 * Heena Rathore
 * =-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
 * 				Group 04
 * Andrew Vitek
 * Caden Marty
 * Caesar Castillo
 * Herman Garza
 * Roland Sanchez
 * =-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
 */

/*/
 * 		///////////////////////////////////
 * 		//Application Package and Imports//
 * 		///////////////////////////////////
 */

//Import application package.
package application;

//Import Java IO's BufferedReader, File, FileNotFoundException, FileReader, IOException, and
//Java UTIL's ArrayList.
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

	/////////
	//Class//
	/////////

	//TODO: Class description.

public class ZooDexModel {
	private final static File afile = new File("amphibians.txt");
	private final static File bfile = new File("birds.txt");
	private final static File mfile = new File("mammals.txt");
	private final static File rfile = new File("reptiles.txt");
	private final static File ifile = new File("invertebrates.txt");
	private final static File ffile = new File("fish.txt");
	private final static ArrayList<String> animal = new ArrayList<String>();
	
	public static ArrayList<String> amphibList() throws FileNotFoundException {
		animal.clear();
		BufferedReader br = new BufferedReader(new FileReader(afile));
		try {
			String name;
			for(int i = 0; (name = br.readLine()) != null; i++) {
				if (i % 3 == 0) {
					animal.add(name);
					}
				}
			return animal;
			
		} catch(IOException e) {
			e.printStackTrace();
			}
		return null;
		}
	
	public static ArrayList<String> amphibReg() throws FileNotFoundException {
		animal.clear();
		BufferedReader br = new BufferedReader(new FileReader(afile));
		try {
			String region;
			for(int i = 2; (region = br.readLine()) != null; i++) {
				if (i % 3 == 0) {
					animal.add(region);
					}
				}
			return animal;
			
		} catch(IOException e) {
			e.printStackTrace();
			}
		return null;
		}
	
	public static ArrayList<String> amphibDescript() throws FileNotFoundException {
		animal.clear();
		BufferedReader br = new BufferedReader(new FileReader(afile));
		try {
			String description;
			for(int i = 1; (description = br.readLine()) != null; i++) {
				if (i % 3 == 0) {
					animal.add(description);
					}
				}
			return animal;
			
		} catch(IOException e) {
			e.printStackTrace();
			}
		return null;
		}
	
	public static ArrayList<String> birdList() throws FileNotFoundException {
		animal.clear();
		BufferedReader br = new BufferedReader(new FileReader(bfile));
		try {
			String name;
			for(int i = 0; (name = br.readLine()) != null; i++) {
				if (i % 3 == 0) {
					animal.add(name);
					}
				}
			return animal;
			
		} catch(IOException e) {
			e.printStackTrace();
			}
		return null;
		}
	public static ArrayList<String> birdReg() throws FileNotFoundException {
		animal.clear();
		BufferedReader br = new BufferedReader(new FileReader(bfile));
		try {
			String region;
			for(int i = 2; (region = br.readLine()) != null; i++) {
				if (i % 3 == 0) {
					animal.add(region);
					}
				}
			return animal;
			
		} catch(IOException e) {
			e.printStackTrace();
			}
		return null;
		}
	
	public static ArrayList<String> birdDescript() throws FileNotFoundException {
		animal.clear();
		BufferedReader br = new BufferedReader(new FileReader(bfile));
		try {
			String description;
			for(int i = 1; (description = br.readLine()) != null; i++) {
				if (i % 3 == 0) {
					animal.add(description);
					}
				}
			return animal;
			
		} catch(IOException e) {
			e.printStackTrace();
			}
		return null;
		}
	public static ArrayList<String> mamList() throws FileNotFoundException {
			animal.clear();
			BufferedReader br = new BufferedReader(new FileReader(mfile));
			try {
				String name;
				for(int i = 0; (name = br.readLine()) != null; i++) {
					if (i % 3 == 0) {
						animal.add(name);
						}
					}
				return animal;
				
			} catch(IOException e) {
				e.printStackTrace();
				}
			return null;
			}
	public static ArrayList<String> mamReg() throws FileNotFoundException {
			animal.clear();
			BufferedReader br = new BufferedReader(new FileReader(mfile));
			try {
				String region;
				for(int i = 2; (region = br.readLine()) != null; i++) {
					if (i % 3 == 0) {
						animal.add(region);
						}
					}
				return animal;
				
			} catch(IOException e) {
				e.printStackTrace();
				}
			return null;
			}
	public static ArrayList<String> mamDescript() throws FileNotFoundException {
			animal.clear();
			BufferedReader br = new BufferedReader(new FileReader(mfile));
			try {
				String description;
				for(int i = 1; (description = br.readLine()) != null; i++) {
					if (i % 3 == 0) {
						animal.add(description);
						}
					}
				return animal;
				
			} catch(IOException e) {
				e.printStackTrace();
				}
			return null;
			}
	
	public static ArrayList<String> reptList() throws FileNotFoundException {
		animal.clear();
		BufferedReader br = new BufferedReader(new FileReader(rfile));
		try {
			String name;
			for(int i = 0; (name = br.readLine()) != null; i++) {
				if (i % 3 == 0) {
					animal.add(name);
					}
				}
			return animal;
			
		} catch(IOException e) {
			e.printStackTrace();
			}
		return null;
		}
	public static ArrayList<String> reptReg() throws FileNotFoundException {
		animal.clear();
		BufferedReader br = new BufferedReader(new FileReader(rfile));
		try {
			String region;
			for(int i = 2; (region = br.readLine()) != null; i++) {
				if (i % 3 == 0) {
					animal.add(region);
					}
				}
			return animal;
			
		} catch(IOException e) {
			e.printStackTrace();
			}
		return null;
		}
	public static ArrayList<String> reptDescript() throws FileNotFoundException {
		animal.clear();
		BufferedReader br = new BufferedReader(new FileReader(rfile));
		try {
			String description;
			for(int i = 1; (description = br.readLine()) != null; i++) {
				if (i % 3 == 0) {
					animal.add(description);
					}
				}
			return animal;
			
		} catch(IOException e) {
			e.printStackTrace();
			}
		return null;
		}
	public static ArrayList<String> invertList() throws FileNotFoundException {
		animal.clear();
		BufferedReader br = new BufferedReader(new FileReader(ifile));
		try {
			String name;
			for(int i = 0; (name = br.readLine()) != null; i++) {
				if (i % 3 == 0) {
					animal.add(name);
					}
				}
			return animal;
		}
		catch(IOException e) {
				e.printStackTrace();
				}
		return null;
		}
	public static ArrayList<String> invertReg() throws FileNotFoundException {
		animal.clear();
		BufferedReader br = new BufferedReader(new FileReader(ifile));
		try {
			String region;
			for(int i = 2; (region = br.readLine()) != null; i++) {
				if (i % 3 == 0) {
					animal.add(region);
					}
				}

			return animal;
						
		} catch(IOException e) {
			e.printStackTrace();
			}
		return null;
		}
	public static ArrayList<String> invertDescript() throws FileNotFoundException {
		animal.clear();
		BufferedReader br = new BufferedReader(new FileReader(ifile));
		try {
			String description;
			for(int i = 1; (description = br.readLine()) != null; i++) {
				if (i % 3 == 0) {
					animal.add(description);
					}
				}
			
			return animal;
			
		} catch(IOException e) {
			e.printStackTrace();
			}
		return null;
		}
	public static ArrayList<String> fishList() throws FileNotFoundException {
		animal.clear();
		BufferedReader br = new BufferedReader(new FileReader(ffile));
		try {
			String name;
			for(int i = 0; (name = br.readLine()) != null; i++) {
				if (i % 3 == 0) {
					animal.add(name);
					}
				}
				return animal;
		} catch(IOException e) {
			e.printStackTrace();
			}
		return null;
		}
	
	public static ArrayList<String> fishReg() throws FileNotFoundException {
		animal.clear();
		BufferedReader br = new BufferedReader(new FileReader(ffile));
		try {
			String region;
			for(int i = 2; (region = br.readLine()) != null; i++) {
				if (i % 3 == 0) {
					animal.add(region);
					}
				}
			return animal;
			
		} catch(IOException e) {
			e.printStackTrace();
			}
		return null;
		}
	
	public static ArrayList<String> fishDescript() throws FileNotFoundException {
		animal.clear();
		BufferedReader br = new BufferedReader(new FileReader(ffile));
		try {
			String description;
			for(int i = 1; (description = br.readLine()) != null; i++) {
				if (i % 3 == 0) {
					animal.add(description);
					}
				}
			return animal;
			
		} catch(IOException e) {
			e.printStackTrace();
			}
		return null;
		}
}