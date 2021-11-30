import java.util.ArrayList;
import java.util.Random;

public class PuzzleJava {


    public void getTenRolls(ArrayList<Object> rolls) {

        for(int i=0; i<10; i++){
            Random randMachine = new Random();
            int upperbound = 21;
            int int_random = randMachine.nextInt(upperbound);
            rolls.add(int_random);
        }

        System.out.println(rolls);
    }

    public void getRandomLetter() {

        String[] alphaArray = new String[26];
        alphaArray[0] = "a";
        alphaArray[1] = "b";
        alphaArray[2] = "c";
        alphaArray[3] = "d";
        alphaArray[4] = "e";
        alphaArray[5] = "f";
        alphaArray[6] = "g";
        alphaArray[7] = "h";
        alphaArray[8] = "i";
        alphaArray[9] = "j";
        alphaArray[10] = "k";
        alphaArray[11] = "l";
        alphaArray[12] = "m";
        alphaArray[13] = "n";
        alphaArray[14] = "o";
        alphaArray[15] = "p";
        alphaArray[16] = "q";
        alphaArray[17] = "r";
        alphaArray[18] = "s";
        alphaArray[19] = "t";
        alphaArray[20] = "u";
        alphaArray[21] = "v";
        alphaArray[22] = "w";
        alphaArray[23] = "x";
        alphaArray[24] = "y";
        alphaArray[25] = "z";
        
        Random randMachine = new Random();
        int upperbound = 25;
        int int_random = randMachine.nextInt(upperbound);


        System.out.println(alphaArray[int_random]);
    }

    public void generatePassword(){

        String[] alphaArray = new String[26];
        alphaArray[0] = "a";
        alphaArray[1] = "b";
        alphaArray[2] = "c";
        alphaArray[3] = "d";
        alphaArray[4] = "e";
        alphaArray[5] = "f";
        alphaArray[6] = "g";
        alphaArray[7] = "h";
        alphaArray[8] = "i";
        alphaArray[9] = "j";
        alphaArray[10] = "k";
        alphaArray[11] = "l";
        alphaArray[12] = "m";
        alphaArray[13] = "n";
        alphaArray[14] = "o";
        alphaArray[15] = "p";
        alphaArray[16] = "q";
        alphaArray[17] = "r";
        alphaArray[18] = "s";
        alphaArray[19] = "t";
        alphaArray[20] = "u";
        alphaArray[21] = "v";
        alphaArray[22] = "w";
        alphaArray[23] = "x";
        alphaArray[24] = "y";
        alphaArray[25] = "z";
        
        String password = new String();

        for(int i = 0; i<8; i++){
        Random randMachine = new Random();
        int upperbound = 25;
        int int_random = randMachine.nextInt(upperbound);
        password += alphaArray[int_random];
        }
        


        System.out.println(password);
    }

    public void getNewPasswordSet(int length){

        ArrayList<String> passwords = new ArrayList<String>();

        String[] alphaArray = new String[26];
        alphaArray[0] = "a";
        alphaArray[1] = "b";
        alphaArray[2] = "c";
        alphaArray[3] = "d";
        alphaArray[4] = "e";
        alphaArray[5] = "f";
        alphaArray[6] = "g";
        alphaArray[7] = "h";
        alphaArray[8] = "i";
        alphaArray[9] = "j";
        alphaArray[10] = "k";
        alphaArray[11] = "l";
        alphaArray[12] = "m";
        alphaArray[13] = "n";
        alphaArray[14] = "o";
        alphaArray[15] = "p";
        alphaArray[16] = "q";
        alphaArray[17] = "r";
        alphaArray[18] = "s";
        alphaArray[19] = "t";
        alphaArray[20] = "u";
        alphaArray[21] = "v";
        alphaArray[22] = "w";
        alphaArray[23] = "x";
        alphaArray[24] = "y";
        alphaArray[25] = "z";
        
        
        for(int i = 0; i<length; i++){
            String password = new String();

            for(int j = 0; j<8; j++){
            Random randMachine = new Random();
            int upperbound = 25;
            int int_random = randMachine.nextInt(upperbound);
            password += alphaArray[int_random];
            }
            passwords.add(password);
        }
        System.out.println(passwords);
    }
}