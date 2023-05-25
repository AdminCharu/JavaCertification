package Questions;

public class Password {

    public boolean password(String inputPassword) {
        int count = 0;
        for (int i = 0; i < inputPassword.length(); i++) {
            char in = inputPassword.charAt(i);
            if (Character.isDigit(in)) {
                count++;
            }
            if (inputPassword.length() < 8) {
                System.out.println("At least 8 characters required");
                return false;
            }
            if (!((in >= 'A' && in <= 'Z') || (in >= 'a' && in <= 'z') || (in > '0' && in < '9'))) {
                System.out.println("It should consists of only letters and digits");
                return false;
            }
        }
        if (count < 2) {
            System.out.println("Must contain at least 2 digits");
            return false;
        }
        return true;
    }

    public Password(String pass) {
        if(password(pass)){
            System.out.println("Password Accepted");
        }
        else{
            System.out.println("Password not accepted");
        }

    }
}
