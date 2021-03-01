import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistrationProblem
{
	public static void firstNameCheck(String name){ //check if fname i/p match with pattern
	String regex = "^[A-Z]{1}[a-zA-Z]{2,}$"; //1st letter is capital min 3 letter

	Pattern pattern = Pattern.compile(regex);
	Matcher match = pattern.matcher(name);
	boolean bool = match.matches();
	if (bool) 
			System.out.println(name + " is a valid name");
		else
			System.out.println(name + " is not a valid name");
	}
	public static void main(String[] args)
{
System.out.println("Enter first Name");

Scanner sc = new Scanner(System.in);
String firstName= sc.next();
firstNameCheck(firstName);
}
}
