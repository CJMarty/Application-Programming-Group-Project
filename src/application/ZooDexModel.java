//Application Programming - CS 3433 - 001
//2-2:50pm MWF
//Heena Rathore
//=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
//  Group 04
//Andrew Vitek
//Caden Marty
//Cesar Castillo
//Herman Garza
//Roland Sanchez
//=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=

///////////////////////////////////
//Application Package and Imports//
///////////////////////////////////

//Import application.model package.
package application.model;

//Import FileReader, BufferReader, Alert, and ArrayList
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;

/*
 * 		/////////
 * 		//Class//
 * 		/////////
 * 
 * TODO: Class description.
 * Created public class 'ZooDexModel'.
 */
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
			for (int i = 0; (name = br.readLine()) != null; i++) {
				if (i % 3 == 0) {
					animal.add(name);
				}
			}
			for (String names : animal)
				System.out.println(names);

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void amphibReg() throws FileNotFoundException {
		BufferedReader br = new BufferedReader(new FileReader(afile));
		try {
			String region;
			for (int i = 2; (region = br.readLine()) != null; i++) {
				if (i % 3 == 0) {
					animal.add(region);
				}
			}
			for (String regions : animal)
				System.out.println(regions);

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void amphibDescript() throws FileNotFoundException {
		BufferedReader br = new BufferedReader(new FileReader(afile));
		try {
			String description;
			for (int i = 1; (description = br.readLine()) != null; i++) {
				if (i % 3 == 0) {
					animal.add(description);
				}
			}
			for (String descriptions : animal)
				System.out.println(descriptions);

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void birdList() throws FileNotFoundException {
		BufferedReader br = new BufferedReader(new FileReader(bfile));
		try {
			String name;
			for (int i = 0; (name = br.readLine()) != null; i++) {
				if (i % 3 == 0) {
					animal.add(name);
				}
			}
			for (String names : animal)
				System.out.println(names);

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void birdReg() throws FileNotFoundException {
		BufferedReader br = new BufferedReader(new FileReader(bfile));
		try {
			String region;
			for (int i = 2; (region = br.readLine()) != null; i++) {
				if (i % 3 == 0) {
					animal.add(region);
				}
			}
			for (String regions : animal)
				System.out.println(regions);

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void birdDescript() throws FileNotFoundException {
		BufferedReader br = new BufferedReader(new FileReader(bfile));
		try {
			String description;
			for (int i = 1; (description = br.readLine()) != null; i++) {
				if (i % 3 == 0) {
					animal.add(description);
				}
			}
			for (String descriptions : animal)
				System.out.println(descriptions);

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void mamList() throws FileNotFoundException {
		BufferedReader br = new BufferedReader(new FileReader(mfile));
		try {
			String name;
			for (int i = 0; (name = br.readLine()) != null; i++) {
				if (i % 3 == 0) {
					animal.add(name);
				}
			}
			for (String names : animal)
				System.out.println(names);

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void mamReg() throws FileNotFoundException {
		BufferedReader br = new BufferedReader(new FileReader(mfile));
		try {
			String region;
			for (int i = 2; (region = br.readLine()) != null; i++) {
				if (i % 3 == 0) {
					animal.add(region);
				}
			}
			for (String regions : animal)
				System.out.println(regions);

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void mamDescript() throws FileNotFoundException {
		BufferedReader br = new BufferedReader(new FileReader(mfile));
		try {
			String description;
			for (int i = 1; (description = br.readLine()) != null; i++) {
				if (i % 3 == 0) {
					animal.add(description);
				}
			}
			for (String descriptions : animal)
				System.out.println(descriptions);

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void reptList() throws FileNotFoundException {
		BufferedReader br = new BufferedReader(new FileReader(rfile));
		try {
			String name;
			for (int i = 0; (name = br.readLine()) != null; i++) {
				if (i % 3 == 0) {
					animal.add(name);
				}
			}
			for (String names : animal)
				System.out.println(names);

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void reptReg() throws FileNotFoundException {
		BufferedReader br = new BufferedReader(new FileReader(rfile));
		try {
			String region;
			for (int i = 2; (region = br.readLine()) != null; i++) {
				if (i % 3 == 0) {
					animal.add(region);
				}
			}
			for (String regions : animal)
				System.out.println(regions);

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void reptDescript() throws FileNotFoundException {
		BufferedReader br = new BufferedReader(new FileReader(rfile));
		try {
			String description;
			for (int i = 1; (description = br.readLine()) != null; i++) {
				if (i % 3 == 0) {
					animal.add(description);
				}
			}
			for (String descriptions : animal)
				System.out.println(descriptions);

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void invertList() throws FileNotFoundException {
		BufferedReader br = new BufferedReader(new FileReader(ifile));
		try {
			String name;
			for (int i = 0; (name = br.readLine()) != null; i++) {
				if (i % 3 == 0) {
					animal.add(name);
				}
			}
			for (String names : animal)
				System.out.println(names);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void invertReg() throws FileNotFoundException {
		BufferedReader br = new BufferedReader(new FileReader(ifile));
		try {
			String region;
			for (int i = 2; (region = br.readLine()) != null; i++) {
				if (i % 3 == 0) {
					animal.add(region);
				}
			}
			for (String regions : animal)
				System.out.println(regions);

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void invertDescript() throws FileNotFoundException {
		BufferedReader br = new BufferedReader(new FileReader(ifile));
		try {
			String description;
			for (int i = 1; (description = br.readLine()) != null; i++) {
				if (i % 3 == 0) {
					animal.add(description);
				}
			}
			for (String descriptions : animal)
				System.out.println(descriptions);

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void fishList() throws FileNotFoundException {
		BufferedReader br = new BufferedReader(new FileReader(ffile));
		try {
			String name;
			for (int i = 0; (name = br.readLine()) != null; i++) {
				if (i % 3 == 0) {
					animal.add(name);
				}
			}
			for (String names : animal)
				System.out.println(names);

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void fishReg() throws FileNotFoundException {
		BufferedReader br = new BufferedReader(new FileReader(ffile));
		try {
			String region;
			for (int i = 2; (region = br.readLine()) != null; i++) {
				if (i % 3 == 0) {
					animal.add(region);
				}
			}
			for (String regions : animal)
				System.out.println(regions);

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void fishDescript() throws FileNotFoundException {
		BufferedReader br = new BufferedReader(new FileReader(ffile));
		try {
			String description;
			for (int i = 1; (description = br.readLine()) != null; i++) {
				if (i % 3 == 0) {
					animal.add(description);
				}
			}
			for (String descriptions : animal)
				System.out.println(descriptions);

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void addNewAnimal(String newAnimalNameString, String newAnimalRegionString,
			String newAnimalDescriptionString, String newAnimalCategoryString) {
		if (newAnimalNameString.equals("") || newAnimalRegionString.equals("") || newAnimalDescriptionString.equals("")
				|| newAnimalCategoryString == null) {
			// Create alert
			Alert alert = new Alert(AlertType.ERROR);
			// Setting the content of the dialog
			alert.setContentText(
					"New animal unsuccessfully added. Make sure an animal category is selected and all text fields are filled.");
			// Show the dialog
			alert.show();
			return;
		}

		try {
			FileWriter fileWriter = new FileWriter("bin/application/" + newAnimalCategoryString + ".txt", true);
			BufferedWriter bw = new BufferedWriter(fileWriter);
			bw.write("\n");
			bw.write(newAnimalNameString + "\n");
			bw.write(newAnimalRegionString + "\n");
			bw.write(newAnimalDescriptionString);
			bw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

		// Create alert
		Alert alert = new Alert(AlertType.CONFIRMATION);
		// Setting the content of the dialog
		alert.setContentText("New animal successfully added");
		// Show the dialog
		alert.show();

	}
}
