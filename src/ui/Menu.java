package ui;

import java.util.Scanner;
import model.Company;

public class Menu {
	
	private Company company;
	private Scanner sc;
	
	public Menu(){
        InitModel init = new InitModel();
        company = new Company(init.createBatteries());
		sc= new Scanner(System.in);

    }

	public static void main(String[] args) {
		Menu m = new Menu();

		int option = 0;
		do{
			option= m.showMenu();
			m.executeOperation(option);
			
		}while (option!=0);

	}

	public int showMenu() {
		int option=0;

		System.out.println(
				"Seleccione una opción para empezar\n" +
				"(1) Para Registrar una bateria\n" +
                "(2) Para Registrar una bateria recargable\n" +
				"(3) Para Mostrar el total de baterias tradicionales y recargables\n"+
				"(4) Para Calcular el promedio de costo de vida util de las baterias recargables\n"+
				"(5) Para mostrar la informacion de todas las baterias\n" +  
				"(0) Para salir"
				);
		option= sc.nextInt();
		sc.nextLine();
		return option;
	}

	public void executeOperation(int operation) {
		
		switch(operation) {
		case 0:
			System.out.println("Bye!");
			break;
		case 1:
		    registerBattery();	
			break;
		case 2:
            registerRechargeableBattery();
			break;
		case 3:
			System.out.println("El total de baterias es de: " + company.showTotalBatteries());
			//"(3) Para Mostrar el total de baterias tradicionales y recargables\n"+ 
			break;

		case 4:
			System.out.println("El costo promedio de vida util de las baterias recargables es: "+ company.calculateUsefulPromLifeCost());
		    // "(4) Para Calcular el promedio de costo de vida util de las baterias recargables\n"+ 
			break;

		case 5:
			System.out.println(company.showBatteriesInfo());
			// "(5) Para mostrar la informacion de todas las baterias\n" +
			break;
		
		default:
			System.out.println("Error, opción no válida");
		
		}
	}

    public void registerBattery() {

        System.out.println("Ingrese el nombre de la bateria");
		String name;
		name = sc.nextLine();

		double voltage = 0, cost = 0, capacity = 0;
		System.out.println("ingrese el voltaje de la bateria");
		voltage = sc.nextDouble();

		System.out.println("ingrese el cossto de la bateria");
		voltage = sc.nextDouble();

		System.out.println("ingrese la capacidad de la bateria");
		voltage = sc.nextDouble();
        
        company.registerBattery(name, voltage, cost, capacity);
        
    }

    public void registerRechargeableBattery() {

        System.out.println("Ingrese el nombre de la bateria");
		String name;
		name = sc.nextLine();

		double voltage = 0, cost = 0, capacity = 0;
		System.out.println("ingrese el voltaje de la bateria");
		voltage = sc.nextDouble();

		System.out.println("ingrese el costo de la bateria");
		voltage = sc.nextDouble();

		System.out.println("ingrese la capacidad de la bateria");
		voltage = sc.nextDouble();
        
        int chargerNumber; 
        System.out.println("Ingrese el numero de cargas");
        chargerNumber = sc.nextInt();

        char type;
        System.out.println("�cual es el tipo de bateria? Litio (l) o  Niquel-Cadio (n)");
        type = sc.next().toCharArray()[0];
        
        company.registerRechargeableBattery(name, voltage, cost, capacity, chargerNumber, type);
        
    }

}
