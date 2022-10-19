public class assignment2 {
    public static void main(String[] args) throws Exception {
        int count = 0;

         while (count !=3){
            System.out.println("Lanz Ashlee");
            count ++;
        }
        // do while loop

         int i = 0;
         do {
            System.out.println("Dinglasa");
             i ++;
        } while (i != 4);

        //for loop

        for (int l = 0; l != 5;  l++) {
            System.out.println("Ricamara");
        }
        // char array
        
       // 4. Create a char array that consists all of the characters of your FIRST NAME and use a for loop to print each character of your FIRST NAME. 

     char[] firstnameCharacters = { 'L', 'A', 'N', 'Z', 'A', 'S', 'H', 'L', 'E', 'E' }; 

     for (int count4 = 0; count4 < firstnameCharacters.length; count4++){ 

         System.out.println(firstnameCharacters[count4]);

     } 
        
     // 5. Use a for loop to print the char array of your FIRST NAME in REVERSE order. 

     char[] firstnameReverse = { 'E', 'E', 'L', 'H', 'S', 'A', 'Z', 'N', 'A', 'L' }; 

     for (int count5 = 0; count5 < firstnameReverse.length; count5++){ 

         System.out.println(firstnameReverse[count5]); 
     }
    }
}

