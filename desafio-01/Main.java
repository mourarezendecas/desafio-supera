import java.util.*;

public class Main {
    public static void main(String[] args) {
      Scanner input = new Scanner(System.in); 
      int n, i, num; 
      n = input.nextInt(); 
      
      //Declarando as listas de numeros pares e impares
      List<Integer> pares = new ArrayList<>(); 
      List<Integer> impares = new ArrayList<>(); 
      
      for(i=0; i<n; i++)
      {
          num = input.nextInt(); 
          
          //ao ler o número o meu algoritmo ja o classifica como par ou impar 
          if (num%2==0)
          {
              pares.add(num);
          }
          else
          {
              impares.add(num);
          }
      }
      
      //ordenando os números impares e pares 
      Collections.sort(pares);
      Collections.sort(impares);
      
        //Imprimindo os números pares em ordem crescente
        for(i=0;i<pares.size();i++)
        {
            System.out.println(pares.get(i));
        }
        
        //Imprimindo os números ímpares em ordem decrescente
        for(i=impares.size()-1;i>=0;i--)
        {
            System.out.println(impares.get(i));
        }
        
      
    
    }
}
