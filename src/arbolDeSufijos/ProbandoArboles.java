package arbolDeSufijos;

public class ProbandoArboles {

	public static void main(String[] args) {
		Arbol arbol = new Arbol();
		char[] uno = "evil.corp".toCharArray();//RECORRE LAS RAMAS GENIAL
		char[] dos = "evil.cors".toCharArray();
		char[] tre = "evil.carn".toCharArray();
		char[] cua = "evilkepas".toCharArray();
		char[] cin = "eviteraso".toCharArray();
		char[] sei = "evil.cora".toCharArray();
		
		arbol.addPalabra(toShortArray(uno), 123);
		arbol.addPalabra(toShortArray(dos), 234);
		arbol.addPalabra(toShortArray(tre), 345);
		arbol.addPalabra(toShortArray(cua), 456);
		arbol.addPalabra(toShortArray(cin), 678);
		arbol.addPalabra(toShortArray(sei), 789);
		
		arbol.imprimePalabras();
		System.out.println("\n\n");
		arbol.recorreRamas();

	}
	
	public static short[] toShortArray (char[] vector){
		short[] nuevo = new short[vector.length];
		for (int i = 0; i < vector.length; i++){
			nuevo[i]=(short)vector[i];
		}
		return nuevo;
	}

}