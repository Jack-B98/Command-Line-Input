
import java.util.ArrayList;

public class TimeToRefresh
{
    public static void main(String[] args)
    {
        int argNum = args.length;
        int errCount = 0;
        int validCount = 0;

        ArrayList<Integer> validNums = new ArrayList<Integer>();

        ArrayList<String> errors = new ArrayList<String>();

        if (argNum == 0)
        {
            System.out.println("\nYou didn't enter any numbers...\n");
        }
        else
        {
            for (int i = 0; i < args.length; i++)
            {
                try
                {
                    validNums.add(Integer.parseInt(args[i]));
                    validCount++;

                }
                catch (Exception e)
                {
                    errors.add(args[i]);
                    errCount++;
                }
            }

            System.out.println("\nYou entered " + validCount + " valid numbers");
            System.out.print("Numbers: ");

            for (int j = 0; j < validNums.size(); j++)
            {
                System.out.print(validNums.get(j));

                if (j != (validNums.size() - 1))
                {
                    System.out.print(", ");
                }
            }
            System.out.print("\n");


            System.out.println("\n" + errCount + " of your inputs were invalid");
            System.out.print("Errors: ");

            for (int j = 0; j < errors.size(); j++)
            {
                System.out.print(errors.get(j));

                if (j != (errors.size() - 1))
                {
                    System.out.print(", ");
                }
            }
            System.out.print("\n");
        }

        System.out.print("\nProgram Finished!!!\n");
    }
}
