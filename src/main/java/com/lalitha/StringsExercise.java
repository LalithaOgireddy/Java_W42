package com.lalitha;

public class StringsExercise {
    public static void main(String[] args) {
        //Length of string "Java"
        String str = "Java";
        System.out.println("Length of Java is : "+str.length());

        //Char at index position 6
        String str1 = "Long example sentence";
        System.out.println("Char at index position 6 is : "+str1.charAt(6));

        //Index position of o
        String str2 = "Even longer example sentence";
        System.out.println("Index of o is is : "+str2.indexOf('o'));

        //Create substring from string
        String str3 = "Ok this is not as long!";
        System.out.println("Substring is :"+str3.substring(11,22));

        //Uppercase and lowercase
        String str4 = "CAPS EQUAL SCREAMING";
        str4 = str4.toLowerCase();
        System.out.println("Lowercase: "+str4);
        str4 = str4.toUpperCase();
        System.out.println("Uppercase :"+str4);

        //Replace
        String str5 = "Java is the worst programming language";
        str5 = str5.replace("worst","best");
        System.out.println("Corrected stmt: "+str5);

        //Trim
        String str6 = "\tJ\ta\tv\ta";
        str6 = str6.trim();
        //str6 = str6.trim().replace("\t",""); //this will remove all the tab spaces from the word
        System.out.println("trimmed word:"+str6); //trim removes only leading and tailing spaces only

        //type casting
        int num = 20;
        String strNum = String.valueOf(num);
        strNum = strNum + "20";
        System.out.println("Final string:"+strNum);

        //Split sentence to String array
        String str7 = "Oil and water";
        String[] words = str7.split("and");
        for(int i=0;i<words.length;i++){
            words[i] =words[i].trim();
            System.out.println("\""+words[i]+"\"");
        }

        //Split sentence
        String str8 = "Carl,Susie,Fredrick,Bob,Erik";
        String[] names = str8.split(",");
        for(int i=0;i<names.length;i++){
            names[i] =names[i].trim();
            System.out.println("\""+names[i]+"\"");
        }

        //String to charArray
        String str9 = "ThisShouldBeConverted";
        char[] charArr = str9.toCharArray();
        System.out.println("Characters in the string are :");
        for(char ch : charArr){
            System.out.println(ch);
        }

        //Character array to string
        char[] chArray = {'J','a','v','a'};
        String str10 = String.valueOf(chArray);
        System.out.println("Char array to string :"+str10);
    }
}
