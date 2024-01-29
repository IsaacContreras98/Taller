import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

                Scanner scanner = new Scanner(System.in);
                int tamano = 2;

                
                String[] titulos = new String[tamano];
                int[] anosLanzamiento = new int[tamano];
                String[] generos = new String[tamano];

                
                System.out.println("Ingrese información de películas:");
                for (int a = 0; a < tamano; a++) {

                    System.out.print("Título de la película " + (a + 1) + ": ");
                    titulos[a] = scanner.nextLine();

                    System.out.print("Año de lanzamiento: ");
                    anosLanzamiento[a] = Integer.parseInt(scanner.nextLine());

                    System.out.print("Género: ");
                    generos[a] = scanner.nextLine();
                }

                
                for (int i = 0; i < tamano - 1; i++) {

                    for (int j = 0; j < tamano - 1 - i; j++) {
                        if (anosLanzamiento[j] > anosLanzamiento[j + 1] ||
                                (anosLanzamiento[j] == anosLanzamiento[j + 1] && generos[j].compareTo(generos[j + 1]) > 0)) {

                            // METODO AUXILIAR
                            swap(titulos, j, j + 1);
                            swap(anosLanzamiento, j, j + 1);
                            swap(generos, j, j + 1);
                        }
                    }
                }

                
                System.out.println("\nLista de películas ordenada:");
                for (int i = 0; i < tamano; i++) {
                    System.out.println("Título: " + titulos[i] + ", Año: " + anosLanzamiento[i] + ", Género: " + generos[i]);
                }
            }

            
            public static void swap(String[] arr, int i, int j) {
                String temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }

            public static void swap(int[] arr, int i, int j) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }





