package Questions;

public class StringQues {
    int count = 0;


    public int printSecondPosition(String string, char ch) {
        int pos = ((string.indexOf(ch, string.indexOf(ch) + 1)) + 1);
        return pos;
    }
   public int getCount(){
        return count;
   }
    public void printOccurrence(String string, char ch) {
        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) == ch) {
                count += 1;
            }
        }
    }

}



