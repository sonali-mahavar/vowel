
package vowel;

import java.util.Scanner;
public class Vowel {

    
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    char ch='z';
    switch(ch){
        case'a':
        case'e':
        case'i':
        case'o':
        case'u':
            System.out.print(ch+" is a vowel");
                    break;
        default:
            System.out.print(ch+" is a consonant");
                            
                
                
    }
        
    
    }
    
}
