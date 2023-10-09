import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        try (Scanner tangentbord = new Scanner(System.in)){
            int[] fält1 = {2,5,2};
            int tal = 7;
            tal+=7;
            tal*=2;
            tal-=6;
            tal/=2;
            tal+=3;
            tal-=7;
            System.out.println(tal);

            int tal1 = tangentbord.nextInt();
            int tal2 = tangentbord.nextInt();  
            System.out.println("tal1: " + tal1);
            System.out.println("tal2: " + tal2);
            tangentbord.nextLine();
            System.out.println("tal 1 är samma som tal2: " + (tal1==tal2));
            System.out.println("tal 1 är mindre än tal2: " + (tal1<tal2));
            System.out.println("tal 2 är mindre än tal1: " + (tal1>tal2));
            int forstaElement = fält1[0];

      
            if (forstaElement > fält1[1] || forstaElement > fält1[2]) {
                System.out.println("1:a elementet är större än 2:a ELLER 3:e elementet");
            }
    
            if (forstaElement < fält1[1] || forstaElement < fält1[2]) {
                System.out.println("1:a elementet är mindre än 2:a ELLER 3:e elementet");
            }
    
            
            if (forstaElement == fält1[1] || forstaElement == fält1[2]) {
                System.out.println("1:a elementet är lika med 2:a ELLER 3:e elementet");
            }
        }
    }
          
         

    }

