package prueba1;
public class Ejer1{
String[] alumnos={"Marta","Jos�","F�tima","Ane"};
void visualizar()throws Exception{ // El m�todo visualizar lanza una excepci�n

	for(int x=0;x<=4;x++){	
		System.out.println(alumnos[x]);
	}
}

void calcular() throws Exception {	
		visualizar();
	
}

public static void main(String[] args) {
	Ejer1 obj=new Ejer1();	
		try {
			obj.calcular();
		} catch (Exception e) {
			System.out.println("no hay m�s alumnos");
		}	

}

}









