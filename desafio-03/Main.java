import java.util.*;

public class Main {
    public static void main(String[] args) {
      Scanner input = new Scanner(System.in); 
      int k, i, j, n, cont=0; 
      System.out.printf("Digite o valor alvo: ");
      k = input.nextInt(); 
      
      System.out.printf("Digite o valor do tamanho da array: ");
      n = input.nextInt();
      
      List<Integer> arr = new ArrayList<>(); 
      
      for(i=0; i<n; i++)
      {
          arr.add(input.nextInt());
      }
      
      //ordenando a minha list
      Collections.sort(arr);
      
      //Comparando os possíveis pares da Array
      for(i=0;i<arr.size();i++)
      {
          for(j=0;j<arr.size();j++)
          {
              if(arr.get(i)-arr.get(j)==k)
              {
                  cont++; 
              }
          }
      }
        
        System.out.println(cont);
    
    }
}
