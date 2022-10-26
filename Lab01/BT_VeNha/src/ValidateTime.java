import java.util.Scanner;

public class ValidateTime {
    public static void main(String[] args) {
        String month[] = { "January", "February", "March", "April", "May", "June", "July", "August", "September",
                "October", "November", "December", "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct",
                "Nov", "Dec", "Jan.", "Feb.", "Mar.", "May.", "Jun.", "Jul.", "Aug.", "Sep.", "Oct.", "Nov.", "Dec.",
                "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12" };
        String month_31_day[] = { "January", "March", "May", "July", "August", "October", "December", "Jan", "Mar",
                "May", "Jul", "Aug", "Oct", "Dec", "Jan.", "Mar.", "May.", "Jul.", "Aug.", "Oct.", "Dec.", "1", "3",
                "5", "7", "8", "10", "12" };
        String month_28_29_day[] = { "February", "Feb", "Feb.", "2" };
        String inputMonth;
        int inputYear;
        boolean isInvalid = true;
        int index;
        Scanner input = new Scanner(System.in);
        do {
            System.out.print("Input month: ");
            inputMonth = input.next();
            System.out.print("Input year: ");
            inputYear = input.nextInt();
            for (int i = 0; i < month.length; i++) {
                if (inputMonth.equals(month[i]) && inputYear >= 0) {
                    isInvalid = false;
                    index = i;
                    break;
                }
            }
            if (isInvalid) {
                System.out.println("Invalid!");
            }
        } while (isInvalid);
        for (int i = 0; i < month_28_29_day.length; i++) {
            if (inputMonth.equals(month_28_29_day[i])) {
                if (inputYear % 4 == 0) {
                    if (inputYear % 100 == 0) {
                        if (inputYear % 400 == 0) {
                            System.out.println(inputMonth + "/" + inputYear + " have 29 day!");
                        } else {
                            System.out.println(inputMonth + "/" + inputYear + " have 28 day!");
                        }
                    }
                }
                System.exit(0);
            }
        }
        for (int i = 0; i < month_31_day.length; i++) {
            if (inputMonth.equals(month_31_day[i])) {
                System.out.println(inputMonth + "/" + inputYear + " have 31 day!");
                System.exit(0);
            }
        }
        System.out.println(inputMonth + "/" + inputYear + " have 30 day!");
    }
}
