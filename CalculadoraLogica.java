/*
 * @author Victor Fernandez, Alejandro Martin, Kevin Tavares
 * @version 29/11/2021
 * 
 */
package calculadoraLogica;

import java.io.BufferedReader;

import java.io.InputStreamReader;

public class CalculadoraLogica {
	private static double numero1;
	private static double numero2;

	static BufferedReader br = new BufferedReader(
			new InputStreamReader(System.in));

	public static void main(String[] args) {

		elegirMenu();// iniciamos el programa llamando al método elegirMenu

	}
//Metodo para elegir el primer menu
	public static void elegirMenu() {
		int opcionmenu = 0;
		do {

			try {
				System.out.println("           MENU");
				System.out.println("========================");
				System.out.println("1-Menu lógico");
				System.out.println("2-Menu aritmético");
				System.out.println("3-Salir");
				System.out.println("========================");
				opcionmenu = Integer.parseInt(br.readLine());
				switch (opcionmenu) {
					case 1 :
						menuLogico();
						break;

					case 2 :
						menuAritmetico();
						break;
					case 3 :
						System.out.println("Adios");
						break;
					default :
						System.out.println("Elija una de las opciones validas");
						break;
				}
			} catch (NumberFormatException e) {
				System.err.println("Solo se permiten numeros");
			} catch (Exception e) {

			}
		} while (opcionmenu != 3);
	}

	public static void menuLogico() {
		int opcion = 0;
		do {
			System.out.println("========================");
			System.out.println("1-AND");
			System.out.println("2-NOR");
			System.out.println("3-NOT");
			System.out.println("4-Volver al menu principal");
			System.out.println("========================");
			try {
				opcion = Integer.parseInt(br.readLine());
				switch (opcion) {
					case 1 :
						and();
						break;
					case 2 :
						nor();
						break;

					case 3 :
						not();
						break;
					case 4 :
						break;

					default :
						System.err.println("Introduce una opcion valida");
						break;
				}
			} catch (NumberFormatException e) {
				System.err.println("Debes de introducir un numero");
			} catch (Exception e) {

			}

		} while (opcion != 4);
	}

	public static void menuAritmetico() {

		int opcion = 0;
		do {
			System.out.println("========================");
			System.out.println("1-Sumar");
			System.out.println("2-Restar");
			System.out.println("3-Multiplicar");
			System.out.println("4-Dividir");
			System.out.println("5- Volver al menu principal");
			System.out.println("========================");
			try {
				opcion = Integer.parseInt(br.readLine());
				switch (opcion) {
					case 1 :
						System.out.println(
								"La suma es igual a: " + suma() + "\n");
						break;
					case 2 :
						System.out.println(
								"La resta es igual a: " + resta() + "\n");
						break;

					case 3 :
						System.out.println("La multiplicacion es igual a: "
								+ multiplicar() + "\n");
						break;

					case 4 :
						System.out.println(
								"La division es igual a: " + dividir() + "\n");
						break;
					case 5 :

						break;
					default :
						System.err.println(
								"Tienes que introducir un numero entre 1 y 5 \n"); // control
																					// de
																					// error
																					// en
																					// caso
																					// de
																					// que
																					// introduzca
																					// un
																					// numero
																					// que
																					// no
																					// este
																					// entre
																					// 1
																					// y
																					// 5
						break;

				}

			} catch (NumberFormatException e) {
				System.err.println("No se permiten letras \n");// Solo se
																// permiten
																// numeros de
																// entrada

			} catch (Exception e) {
				System.err.println("Error de entrada y salida"); // control de
																	// errores
																	// para
																	// operaciones
																	// indeterminadas
			}
		} while (opcion != 5);
	}

	public static double suma() {
		try {
			System.out.println("Has elegido sumar \n");
			System.out.println("Dime el primer numero");

			numero1 = Double.parseDouble(br.readLine());
			System.out.println("Dime el segundo numero");
			numero2 = Double.parseDouble(br.readLine());

		} catch (NumberFormatException e) {
			System.err.println("Debes introducir un numero");
		} catch (Exception e) {
		}

		return numero1 + numero2;

	}

	public static double resta() {
		try {
			System.out.println("Has elegido restar \n");
			System.out.println("Dime el primer numero");

			numero1 = Double.parseDouble(br.readLine());
			System.out.println("Dime el segundo numero");
			numero2 = Double.parseDouble(br.readLine());
		} catch (NumberFormatException e) {

		} catch (Exception e) {
			System.err.println("Debes de introducir un numero");
		}
		return numero1 - numero2;
	}

	public static double multiplicar() {
		try {
			System.out.println("Has elegido multiplicar \n");
			System.out.println("Dime el primer numero");

			numero1 = Double.parseDouble(br.readLine());
			System.out.println("Dime el segundo numero");
			numero2 = Double.parseDouble(br.readLine());
		} catch (NumberFormatException e) {
			System.err.println("Debes de introducir un numero");
		} catch (Exception e) {
		}
		return numero1 * numero2;
	}

	public static double dividir() {
		try {
			System.out.println("Has elegido dividir \n");
			System.out.println("Dime el primer numero");

			numero1 = Double.parseDouble(br.readLine());
			System.out.println("Dime el segundo numero");
			numero2 = Double.parseDouble(br.readLine());
		} catch (NumberFormatException e) {
			System.err.println("Debes de introducir un numero");
		} catch (Exception e) {

		}
		return numero1 / numero2;
	}

	public static void and() {
		try {

			System.out.println("Elige los operandos lógicos:");
			do {

				System.out.println("Primero:");

				numero1 = Integer.parseInt(br.readLine());
				if (numero1 != 0 && numero1 != 1) {
					System.err.println(
							"Debes de introducir operadores logicos válidos");
				}
			} while (numero1 != 1 && numero1 != 0);

			System.out.println("Segundo:");
			do {

				numero2 = Integer.parseInt(br.readLine());
				if (numero2 != 0 && numero2 != 1) {
					System.err.println(
							"Debes de introducir operadores logicos válidos");
				}
			} while (numero2 != 1 && numero2 != 0);
			if (numero1 == 1 && numero2 == 1) {

				System.out.println("El resultado es: Verdadero(1) \n");
			} else {

				System.out.println("El resultado es: Falso(0) \n");
			}

		} catch (NumberFormatException e) {
			System.err.println(
					"Debes introducir un numero, vuelve a elegir la opcion");
		} catch (Exception e) {

		}

	}

	public static void nor() {
		try {

			System.out.println("Elige los operandos lógicos:");
			do {

				System.out.println("Primero:");

				numero1 = Integer.parseInt(br.readLine());
				if (numero1 != 0 && numero1 != 1) {
					System.err.println(
							"Debes de introducir operadores logicos válidos");
				}
			} while (numero1 != 1 && numero1 != 0);

			System.out.println("Segundo:");
			do {

				numero2 = Integer.parseInt(br.readLine());
				if (numero2 != 0 && numero2 != 1) {
					System.err.println(
							"Debes de introducir operadores logicos válidos");
				}
			} while (numero2 != 1 && numero2 != 0);
			if (numero1 == 0 && numero2 == 0) {

				System.out.println("El resultado es: Falso(0) \n");
			} else {

				System.out.println("El resultado es: Verdadero(1) \n");
			}

		} catch (NumberFormatException e) {
			System.err.println(
					"Debes introducir un numero, vuelve a elegir la opcion");
		} catch (Exception e) {

		}

	}

	public static void not() {
		try {

			System.out.println("Introduce un operando logico:");
			do {

				numero1 = Integer.parseInt(br.readLine());
				if (numero1 != 0 && numero1 != 1) {
					System.err.println(
							"Debes de introducir operadores logicos válidos");
				}
			} while (numero1 != 1 && numero1 != 0);
			if (numero1 == 0) {
				System.out.println("El resultado es Verdadero(1) \n");

			} else {
				System.out.println("El resultado es Falso(0) \n");
			}

		} catch (NumberFormatException e) {
			System.err.println(
					"Debes introducir un numero, vuelve a elegir la opcion");
		} catch (Exception e) {

		}

	}
}
