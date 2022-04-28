package Ahorcado;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ejer_10 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		String a="";
		int c = (int)(Math.random()*100000);
		System.out.println("Select lenguaje: english(EN)/spanish(SP)");
		String idioma = teclado.nextLine();
		int s =0;
		String directorio="";
		File file = new File("");
		try {
			directorio = file.getAbsoluteFile().toString();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		BufferedReader fichero = null;
		if (idioma.equals("SP")) {
		fichero = new BufferedReader(new FileReader(directorio+"\\src\\Ahorcado/listadogeneral.txt"));
		s =80383;
		}
		if (idioma.equals("EN")) {
		fichero = new BufferedReader(new FileReader(directorio+"\\src\\Ahorcado/words.txt"));
		  s=466466;
		}
		while(c>s) {
			c=(int)(Math.random()*1000000);
		}
		for (int i = 0; i < c+1; i++) {
			if(i==c) {
				a=fichero.readLine();
			break;
			}
			fichero.readLine();
			
			
		}
		String b = "";
		while(b.length()<a.length()*2 ) {
			b = b+" _";
			
		}
		b = " "+b;
		StringBuilder sb = new StringBuilder(b);
		int m = (int)(Math.random()*10);
		while (m==1||m==2) {
			m =(int)(Math.random()*10);
		}
		String g="";
		for (int j = 1; j*m < (a.length()-1)&&j<4&&j*m<sb.length()/2; j++) {
			
				g = ""+a.charAt((((j*m))));
				sb.deleteCharAt((((j*m))*2)+2);
				sb.insert((((j*m))*2)+2, g);
				
			
			}
			
		
		int vidas =8;
		int cont= 0;
		String letras="";
		if (idioma.equals("SP")) {
			letras ="Ya usaste las letras:";
		}
		if (idioma.equals("EN")){
			letras="You already use this letters";
		}
		while (vidas >=0) {
			if(idioma.equals("SP")) {
		System.out.println("Dame una letra te quedan "+vidas+" vidas");
			}
			if (idioma.equals("EN")) {
				System.out.println("give me a letter... you have "+vidas+" attemps");
			}
		System.out.println(sb);
		//System.out.println(a);
		System.out.println(letras);
		
		String d = teclado.nextLine();
	
		d= d.toLowerCase();
		letras = letras+" "+d+",";
		String l= sb.toString();
		for (int i = 0; i < a.length(); i++) {
			if(d.charAt(0)==a.charAt(i)) {
				sb.deleteCharAt(((i)*2)+2);
				sb.insert(((i)*2)+2, d.charAt(0));
				cont++;
			}	
		
		}
		if(cont==a.length()-1){
			if (idioma.equals("SP")) {
			System.out.println("Has ganado enhorabuena!!!");
			}
			if (idioma.equals("EN")) {
			System.out.println("You win congratulations");	
			}
			break;}
		if (l.equals(sb.toString())) {
			if(idioma.equals("SP")) {
			System.out.println("Esa no pringao");
			}
			if(idioma.equals("EN")) {
				System.out.println("This is incorrect,sorry");
			}
			vidas--;
		}
		if(a.equals(sb.toString())){
			if(idioma.equals("SP")) {
			System.out.println("Has ganado enhorabuena!!!");
			}
			if(idioma.equals("EN")) {
				System.out.println("You win congratulations!!!");
			}
			break;
			
		}
		if (vidas<0) {
			if (idioma.equals("SP")) {
				
			
			System.out.println("Perdisteeeeee");
			}
			if(idioma.equals("EN")) {
				System.out.println("You lose....");
			}
			break;
		}
		}
		System.out.println(a);
		teclado.close();
		fichero.close();
	}

}
