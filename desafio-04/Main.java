import java.util.*;

public class Main {

	public static void Main(String[] args) {
		Scanner input = new Scanner(System.in);
		int N;
                //Lendo a quantidade de testes que irei fazer
                N = input.nextInt();
                
                //Loop de testes
		for (int i = 0; i < N; i++) {
                        //Lendo a frase
			String frase = readLine(input);
                        
                        /**
                         * A classe StringBuilder permite criar e manipular dados de Strings dinamicamente, ou seja, podem criar variáveis de String modificáveis.
                         * O método .substring nos permite criar Strings menores a partir de outras Strings ou até nos retornar partes dessas Strings 
                         */
			StringBuilder primeira_metade = new StringBuilder(frase.substring(0, frase.length() / 2));
			StringBuilder segunda_metade = new StringBuilder(frase.substring(frase.length() / 2, frase.length()));
			primeira_metade.reverse();
			segunda_metade.reverse();
			System.out.println(primeira_metade.toString() + segunda_metade.toString());
		}
	}
	
        /**
         * 
         * O método readLine implementa a funcionalidade para leituras de linhas da fonte, retornando um objeto String. Assim, 
         * caso se deseje ler linhas de texto de um arquivo, é necessário decorar um FileReader com a funcionalidade de um BufferedReader: 
         */
	public static String readLine(Scanner input) {
		String line = input.nextLine();
		while (line.isEmpty())
			line = input.nextLine();
		return line;
	}
	
}
