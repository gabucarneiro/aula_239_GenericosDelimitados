package program;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import entities.Product;
import services.Calculations;

public class Program {

	public static void main(String[] args) {
		List<Product> prodList = new ArrayList<>();
		try(BufferedReader br = new BufferedReader(new FileReader("F:\\eclipse\\workspace\\aula_239_GenericosDelimitados\\src\\in.txt"))){
			String line;
			while((line = br.readLine()) != null) {
				String[] fromFile = line.split(",");
				prodList.add(new Product(fromFile[0], Double.parseDouble(fromFile[1])));
			}
			Product x = Calculations.max(prodList);
			System.out.println(x.toString());
		}
		catch (IOException ioe) {
			System.out.println("File not found!");
			System.out.println(ioe.getMessage());
			ioe.printStackTrace();
		}
		catch (Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}

}
