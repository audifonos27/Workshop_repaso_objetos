import java.util.ArrayList;
import java.util.List;

public class Workshop {
    public static void main(String[] args) {
        Workshop workshop = new Workshop();

        // Ejemplo de uso de los métodos
        System.out.println("Suma: " + workshop.sumarDosNumeros(3, 5)); // 8
        System.out.println("Mayor de tres: " + workshop.mayorDeTresNumeros(3, 7, 5)); // 7
        System.out.println("Tabla de multiplicar: " + java.util.Arrays.toString(workshop.tablaMultiplicar(2, 5))); // [2, 4, 6, 8, 10]
        System.out.println("Factorial: " + workshop.factorial(5)); // 120
        System.out.println("Es primo: " + workshop.esPrimo(7)); // true
        System.out.println("Fibonacci: " + java.util.Arrays.toString(workshop.serieFibonacci(5))); // [0, 1, 1, 2, 3]
    }

    // Método que suma dos números enteros
    public int sumarDosNumeros(int a, int b) {
        return a + b;
    }

    // Método que encuentra el mayor de tres números enteros
    public int mayorDeTresNumeros(int a, int b, int c) {
        return Math.max(a, Math.max(b, c));
    }

    // Método que retorna la tabla de multiplicar de un número
    public int[] tablaMultiplicar(int numero, int limite) {
        int[] tabla = new int[limite];
        for (int i = 0; i < limite; i++) {
            tabla[i] = numero * (i + 1);
        }
        return tabla;
    }

    // Método que calcula el factorial de un número entero
    public int factorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("El número no puede ser negativo.");
        }
        int resultado = 1;
        for (int i = 1; i <= n; i++) {
            resultado *= i;
        }
        return resultado;
    }

    // Método que verifica si un número es primo
    public boolean esPrimo(int numero) {
        if (numero < 2) return false;
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }

    // Método que genera una serie de Fibonacci
    public int[] serieFibonacci(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("El número no puede ser negativo.");
        }
        int[] serie = new int[n];
        if (n > 0) serie[0] = 0;
        if (n > 1) serie[1] = 1;
        for (int i = 2; i < n; i++) {
            serie[i] = serie[i - 1] + serie[i - 2];
        }
        return serie;
    }

    // Método que suma todos los elementos de un arreglo
    public int sumaElementos(int[] arreglo) {
        int suma = 0;
        for (int num : arreglo) {
            suma += num;
        }
        return suma;
    }

    // Método que calcula el promedio de los elementos de un arreglo
    public double promedioElementos(int[] arreglo) {
        if (arreglo.length == 0) return 0.0;
        return (double) sumaElementos(arreglo) / arreglo.length;
    }

    // Método que encuentra el elemento mayor en un arreglo
    public int encontrarElementoMayor(int[] arreglo) {
        if (arreglo.length == 0) throw new IllegalArgumentException("El arreglo está vacío.");
        int mayor = arreglo[0];
        for (int num : arreglo) {
            if (num > mayor) {
                mayor = num;
            }
        }
        return mayor;
    }

    // Método que encuentra el elemento menor en un arreglo
    public int encontrarElementoMenor(int[] arreglo) {
        if (arreglo.length == 0) throw new IllegalArgumentException("El arreglo está vacío.");
        int menor = arreglo[0];
        for (int num : arreglo) {
            if (num < menor) {
                menor = num;
            }
        }
        return menor;
    }

    // Método que busca un elemento en un arreglo
    public boolean buscarElemento(int[] arreglo, int elemento) {
        for (int num : arreglo) {
            if (num == elemento) {
                return true;
            }
        }
        return false;
    }

    // Método que invierte un arreglo
    public int[] invertirArreglo(int[] arreglo) {
        int[] invertido = new int[arreglo.length];
        for (int i = 0; i < arreglo.length; i++) {
            invertido[i] = arreglo[arreglo.length - 1 - i];
        }
        return invertido;
    }

    // Método que ordena un arreglo en orden ascendente
    public int[] ordenarArreglo(int[] arreglo) {
        int[] copia = arreglo.clone();
        java.util.Arrays.sort(copia);
        return copia;
    }

    // Método que elimina los duplicados de un arreglo
    public int[] eliminarDuplicados(int[] arreglo) {
        List<Integer> lista = new ArrayList<>();
        for (int num : arreglo) {
            if (!lista.contains(num)) {
                lista.add(num);
            }
        }
        return lista.stream().mapToInt(i -> i).toArray();
    }

    // Método que combina dos arreglos en uno solo
    public int[] combinarArreglos(int[] arreglo1, int[] arreglo2) {
        int[] combinado = new int[arreglo1.length + arreglo2.length];
        System.arraycopy(arreglo1, 0, combinado, 0, arreglo1.length);
        System.arraycopy(arreglo2, 0, combinado, arreglo1.length, arreglo2.length);
        return combinado;
    }

    // Método que rota un arreglo n posiciones
    public int[] rotarArreglo(int[] arreglo, int posiciones) {
        int n = arreglo.length;
        posiciones = posiciones % n; // Ajustar posiciones si es mayor que n
        int[] rotado = new int[n];
        for (int i = 0; i < n; i++) {
            rotado[i] = arreglo[(i + posiciones) % n];
        }
        return rotado;
    }

    // Método que cuenta los caracteres en una cadena
    public int contarCaracteres(String cadena) {
        return cadena.length();
    }

    // Método que invierte una cadena
    public String invertirCadena(String cadena) {
        return new StringBuilder(cadena).reverse().toString();
    }

    // Método que verifica si una cadena es un palíndromo
    public boolean esPalindromo(String cadena) {
        String invertida = invertirCadena(cadena);
        return cadena.equals(invertida);
    }

    // Método que cuenta el número de palabras en una cadena
    public int contarPalabras(String cadena) {
        if (cadena.trim().isEmpty()) return 0;
        return cadena.trim().split("\\s+").length;
    }

    // Método que convierte una cadena a mayúsculas
    public String convertirAMayusculas(String cadena) {
        return cadena.toUpperCase();
    }

    // Método que convierte una cadena a minúsculas
    public String convertirAMinusculas(String cadena) {
        return cadena.toLowerCase();
    }

    // Método que reemplaza una subcadena en una cadena por otra subcadena
    public String reemplazarSubcadena(String cadena, String antiguaSubcadena, String nuevaSubcadena) {
        return cadena.replace(antiguaSubcadena, nuevaSubcadena);
    }

    // Método que busca una subcadena en una cadena y retorna su índice
    public int buscarSubcadena(String cadena, String subcadena) {
        return cadena.indexOf(subcadena);
    }

    // Método que valida un correo electrónico
    public boolean validarCorreoElectronico(String correo) {
        return correo.matches("^[\\w-\\.]+@[\\w-]+\\.[a-zA-Z]{2,}$");
    }

    // Método que calcula el promedio de una lista de números
    public double promedioLista(List<Integer> lista) {
        if (lista.isEmpty()) return 0.0;
        return lista.stream().mapToInt(Integer::intValue).average().orElse(0.0);
    }

    // Método que convierte un número en su representación binaria
    public String convertirABinario(int numero) {
        return Integer.toBinaryString(numero);
    }

    // Método que convierte un número en su representación hexadecimal
    public String convertirAHexadecimal(int numero) {
        return Integer.toHexString(numero).toUpperCase();
    }

    // Método para el juego de piedra, papel, tijera, lagarto, Spock
    public String jugarPiedraPapelTijeraLagartoSpock(String eleccionUsuario) {
        String[] opciones = {"Piedra", "Papel", "Tijera", "Lagarto", "Spock"};
        String eleccionComputadora = opciones[(int) (Math.random() * 5)];

        if (eleccionUsuario.equals(eleccionComputadora)) {
            return "Empate! Ambos eligieron " + eleccionUsuario;

        }
        return eleccionComputadora;
    }
}