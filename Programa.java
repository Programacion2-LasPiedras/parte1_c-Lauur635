public class Programa {
		void iniciar() {
			int a, b, c, x;
			a = 2;
			b = a + a;
			c = a+1;
			x = funcion(a,b,c);
			System.out.println("el valor de x es: " + x);	
		}					
		int funcion(int x, int y, int z) {
			x = x + 1; 
			y = x + 2;  
			z = x + y + z;  
			return z;
		}
	}
//    Retorna un 11 porque es el valor de z .
//  Aparece que el resultado de x es el valor de z porque la variable que llama a la función fue nombrada x.
