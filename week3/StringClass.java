package week3;

public class StringClass {
    public static void main(String[] args) {
        String sentence = "I am a student of RMIT!";

        char charAt5 = sentence.charAt(5);
        System.out.println("Character at index 5: " + charAt5);
        String concatenatedSentence = sentence.concat(" And I love programming.");
        System.out.println("Concatenated sentence: " + concatenatedSentence);
        System.out.println("Ends with 'RMIT!': " + endsWithRMIT);

        System.out.println("Equals 'I am a student of RMIT!': " + equalsSentence);

        System.out.println("Equals ignore case 'i am a student of rmit!': " + equalsIgnoreCaseSentence);

        int lengthOfSentence = sentence.length();
        System.out.println("Length of sentence: " + lengthOfSentence);

        String replacedSentence = sentence.replace("student", "graduate");
        System.out.println("Replaced sentence: " + replacedSentence);

        boolean startsWithIAm = sentence.startsWith("I am");
        System.out.println("Starts with 'I am': " + startsWithIAm);

        String upperCaseSentence = sentence.toUpperCase();
        System.out.println("Upper case sentence: " + upperCaseSentence);
    }
}
