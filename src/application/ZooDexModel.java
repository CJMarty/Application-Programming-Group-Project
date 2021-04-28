package application.model;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class ZooDexModel {
	private final static File afile = new File("amphibians.txt");
	private final static File bfile = new File("birds.txt");
	private final static File mfile = new File("mammals.txt");
	private final static File rfile = new File("reptiles.txt");
	private final static File ifile = new File("invertebrates.txt");
	private final static File ffile = new File("fish.txt");
	private final static ArrayList<String> animal = new ArrayList<String>();
	
	public static void amphibList() throws FileNotFoundException {
		BufferedReader br = new BufferedReader(new FileReader(afile));
		try {
			String name;
			for(int i = 0; (name = br.readLine()) != null; i++) {
				if (i % 3 == 0) {
					animal.add(name);
					}
				}
			for(String names : animal)
				System.out.println(names);
			
		} catch(IOException e) {
			e.printStackTrace();
			}
		}
	
	public static void amphibReg() throws FileNotFoundException {
		BufferedReader br = new BufferedReader(new FileReader(afile));
		try {
			String region;
			for(int i = 2; (region = br.readLine()) != null; i++) {
				if (i % 3 == 0) {
					animal.add(region);
					}
				}
			for(String regions : animal)
				System.out.println(regions);
			
		} catch(IOException e) {
			e.printStackTrace();
			}
		}
	
	public static void amphibDescript() throws FileNotFoundException {
		BufferedReader br = new BufferedReader(new FileReader(afile));
		try {
			String description;
			for(int i = 1; (description = br.readLine()) != null; i++) {
				if (i % 3 == 0) {
					animal.add(description);
					}
				}
			for(String descriptions : animal)
				System.out.println(descriptions);
			
		} catch(IOException e) {
			e.printStackTrace();
			}
		}
	
	public static void birdList() throws FileNotFoundException {
		BufferedReader br = new BufferedReader(new FileReader(bfile));
		try {
			String name;
			for(int i = 0; (name = br.readLine()) != null; i++) {
				if (i % 3 == 0) {
					animal.add(name);
					}
				}
			for(String names : animal)
				System.out.println(names);
			
		} catch(IOException e) {
			e.printStackTrace();
			}
		}
	public static void birdReg() throws FileNotFoundException {
		BufferedReader br = new BufferedReader(new FileReader(bfile));
		try {
			String region;
			for(int i = 2; (region = br.readLine()) != null; i++) {
				if (i % 3 == 0) {
					animal.add(region);
					}
				}
			for(String regions : animal)
				System.out.println(regions);
			
		} catch(IOException e) {
			e.printStackTrace();
			}
		}
	
	public static void birdDescript() throws FileNotFoundException {
		BufferedReader br = new BufferedReader(new FileReader(bfile));
		try {
			String description;
			for(int i = 1; (description = br.readLine()) != null; i++) {
				if (i % 3 == 0) {
					animal.add(description);
					}
				}
			for(String descriptions : animal)
				System.out.println(descriptions);
			
		} catch(IOException e) {
			e.printStackTrace();
			}
		}
	public static void mamList() throws FileNotFoundException {
			BufferedReader br = new BufferedReader(new FileReader(mfile));
			try {
				String name;
				for(int i = 0; (name = br.readLine()) != null; i++) {
					if (i % 3 == 0) {
						animal.add(name);
						}
					}
				for(String names : animal)
					System.out.println(names);
				
			} catch(IOException e) {
				e.printStackTrace();
				}
			}
	public static void mamReg() throws FileNotFoundException {
			BufferedReader br = new BufferedReader(new FileReader(mfile));
			try {
				String region;
				for(int i = 2; (region = br.readLine()) != null; i++) {
					if (i % 3 == 0) {
						animal.add(region);
						}
					}
				for(String regions : animal)
					System.out.println(regions);
				
			} catch(IOException e) {
				e.printStackTrace();
				}
			}
	public static void mamDescript() throws FileNotFoundException {
			BufferedReader br = new BufferedReader(new FileReader(mfile));
			try {
				String description;
				for(int i = 1; (description = br.readLine()) != null; i++) {
					if (i % 3 == 0) {
						animal.add(description);
						}
					}
				for(String descriptions : animal)
					System.out.println(descriptions);
				
			} catch(IOException e) {
				e.printStackTrace();
				}
			}
	
	public static void reptList() throws FileNotFoundException {
		BufferedReader br = new BufferedReader(new FileReader(rfile));
		try {
			String name;
			for(int i = 0; (name = br.readLine()) != null; i++) {
				if (i % 3 == 0) {
					animal.add(name);
					}
				}
			for(String names : animal)
				System.out.println(names);
			
		} catch(IOException e) {
			e.printStackTrace();
			}
		}
	public static void reptReg() throws FileNotFoundException {
		BufferedReader br = new BufferedReader(new FileReader(rfile));
		try {
			String region;
			for(int i = 2; (region = br.readLine()) != null; i++) {
				if (i % 3 == 0) {
					animal.add(region);
					}
				}
			for(String regions : animal)
				System.out.println(regions);
			
		} catch(IOException e) {
			e.printStackTrace();
			}
		}
	public static void reptDescript() throws FileNotFoundException {
		BufferedReader br = new BufferedReader(new FileReader(rfile));
		try {
			String description;
			for(int i = 1; (description = br.readLine()) != null; i++) {
				if (i % 3 == 0) {
					animal.add(description);
					}
				}
			for(String descriptions : animal)
				System.out.println(descriptions);
			
		} catch(IOException e) {
			e.printStackTrace();
			}
		}
	public static void invertList() throws FileNotFoundException {
		BufferedReader br = new BufferedReader(new FileReader(ifile));
		try {
			String name;
			for(int i = 0; (name = br.readLine()) != null; i++) {
				if (i % 3 == 0) {
					animal.add(name);
					}
				}
			for(String names : animal)
				System.out.println(names);
			} 
		catch(IOException e) {
				e.printStackTrace();
				}
		}
	public static void invertReg() throws FileNotFoundException {
		BufferedReader br = new BufferedReader(new FileReader(ifile));
		try {
			String region;
			for(int i = 2; (region = br.readLine()) != null; i++) {
				if (i % 3 == 0) {
					animal.add(region);
					}
				}
			for(String regions : animal)
				System.out.println(regions);
						
		} catch(IOException e) {
			e.printStackTrace();
			}
		}
	public static void invertDescript() throws FileNotFoundException {
		BufferedReader br = new BufferedReader(new FileReader(ifile));
		try {
			String description;
			for(int i = 1; (description = br.readLine()) != null; i++) {
				if (i % 3 == 0) {
					animal.add(description);
					}
				}
			for(String descriptions : animal)
				System.out.println(descriptions);
			
		} catch(IOException e) {
			e.printStackTrace();
			}
		}
	public static void fishList() throws FileNotFoundException {
		BufferedReader br = new BufferedReader(new FileReader(ffile));
		try {
			String name;
			for(int i = 0; (name = br.readLine()) != null; i++) {
				if (i % 3 == 0) {
					animal.add(name);
					}
				}
			for(String names : animal)
				System.out.println(names);
			
		} catch(IOException e) {
			e.printStackTrace();
			}
		}
	
	public static void fishReg() throws FileNotFoundException {
		BufferedReader br = new BufferedReader(new FileReader(ffile));
		try {
			String region;
			for(int i = 2; (region = br.readLine()) != null; i++) {
				if (i % 3 == 0) {
					animal.add(region);
					}
				}
			for(String regions : animal)
				System.out.println(regions);
			
		} catch(IOException e) {
			e.printStackTrace();
			}
		}
	
	public static void fishDescript() throws FileNotFoundException {
		BufferedReader br = new BufferedReader(new FileReader(ffile));
		try {
			String description;
			for(int i = 1; (description = br.readLine()) != null; i++) {
				if (i % 3 == 0) {
					animal.add(description);
					}
				}
			for(String descriptions : animal)
				System.out.println(descriptions);
			
		} catch(IOException e) {
			e.printStackTrace();
			}
		}
}