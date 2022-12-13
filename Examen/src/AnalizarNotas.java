import java.util.Scanner;

public class AnalizarNotas {

	/**
	 * Metodo principal
	 * 
	 * @param args . Los argumentos del main no se utilizan en este programa
	 */
	public static void main(String[] args) {
		//Declaramos las variables

		Scanner sc=new Scanner(System.in);//Creamos un Scaner para leer las entradas por teclado
		String notaActual;//En esta variable vamos a guardar la nota que escribe el usuario
		String notaAnterior="";//Va a almacenar la nota que escribio el usuario anteriomente. Inicialmente le damos el valor de la cadena vacia.
		int notasInstroducidas=0;//Contador, con el que contaremos las notas tecleadas por el usuario. Inicialmente valdra cero.
		int numeroSecuenciaFaRe=0;//Contabilia las veces que aparece fa y re seguidos. Empieza en cero
		boolean fin=false;//Booleano que indica si el usuario ha escrito fin. Inicialmente es falso.
		
		//Empezamos el programa con un bucle do-while
		do {
			System.out.println("introduce una nota");
			notaActual=sc.nextLine();//Se lee la nota introducida por el usuario por teclado

			switch (notaActual) {//En funcion del valor de la nota actual. Haremos lo siguiente
			case "do", "re", "mi", "fa", "sol","la","si"->{//Si se introduce una nota
				if(notaAnterior.equals("fa") && notaActual.equals("re"))//Si lA nota anterio fue fa, y la actual re
					numeroSecuenciaFaRe++;//Sumamos uno al contador de la secuencia fa re
				notasInstroducidas++;//Incrementamos el numero de notas
				notaAnterior=notaActual;//La nota que se ha introducido, pasa a ser la nota anterior, para la siguiente iteracion (vuelta) del bucle.
			}
			case "fin"->{
				fin=true;//El usuario ha escrito fin, por lo que actualizamos el booleano.
				}
			default->{//No se ha introducido una nota
				System.out.println("Nota erronea, por favor introduce una nota correcta.");
			}
			}
		}while(!fin);//Mientras no escriba el usuario fin, el bucle seguira.
		
		System.out.println("La secuencia fa, re se ha repetido "+numeroSecuenciaFaRe +" veces de un total de "+notasInstroducidas+" notas.");//Imprimimos por pantalla el resultado	
	}
}
