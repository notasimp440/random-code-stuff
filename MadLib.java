import java.util.*;
// a class definition header that matches the file name
public class MadLib{
    //  a main method for the program
    public static void main(String[]args){
    //  the use of camelCase when appropriate
    Scanner sc = new Scanner(System.in);
    // Random rand = new Random();
    // System.out.println("give me a noun");
    // String nounOne = sc.nextLine();
    // System.out.println("give me another noun");
    // String nounTwo = sc.nextLine();
    // System.out.println("give me an adjective");
    // String adj = sc.nextLine();

    // List<String> nounList = new ArrayList<String>();
    // nounList.add(nounOne);
    // nounList.add(nounTwo);

    //  comments describing the algorithms
    //  a variable containing the incomplete Mad Lib
    String inconMad = "i have no way to get back to <noun> so i can <adj> the <noun>";


    int placeHolder1Start = inconMad.indexOf("<");
    int placeHolder1End = inconMad.indexOf(">");

    String placeHolder1 = inconMad.substring(placeHolder1Start+1, placeHolder1End);
    System.out.println("Give me a " + placeHolder1);
    String input1 = sc.nextLine();


    int placeHolder2End = inconMad.indexOf(">", placeHolder1End+1);
    int placeHolder2Start = inconMad.indexOf("<", placeHolder1End+1);

    String placeHolder2 = inconMad.substring(placeHolder2Start+1, placeHolder2End);
    System.out.println("Give me a " + placeHolder2);
    String input2 = sc.nextLine();


   
    int placeHolder3End = inconMad.indexOf(">", placeHolder2End+1);
    int placeHolder3Start = inconMad.indexOf("<", placeHolder2End+1);

    String placeHolder3 = inconMad.substring(placeHolder3Start+1, placeHolder3End);
    System.out.println("Give me a " + placeHolder3);
    String input3 = sc.nextLine();


    inconMad = inconMad.replace(placeHolder1, input1);
    inconMad = inconMad.replace(placeHolder2, input2);
    inconMad = inconMad.replace(placeHolder3, input3);

    System.out.println(inconMad);
    
    
    //  only String methods defined in the AP CSA Java Quick Reference
    //  algorithm(s) that process user input

    //  algorithm(s) to parse for the parts of speech to replace
    // System.out.println(inconMad.indexOf("<adj>"));
    // Random ran.nextInt(nounList.indexOf(inconMad));
    // inconMad.replace("noun", ran);
    //  algorithm(s) to parse for sections to include
    //  various prompts to keep the user on track
    //  a final print statement to display the completed story
    }

}

