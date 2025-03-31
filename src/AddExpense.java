import java.util.Scanner;

public class AddExpense {

    static Scanner sc=new Scanner(System.in);
    public static void addExpens()
    {
        int day=0;
        while(true) {
            try {
                System.out.println("""
                Enter 1 or 2
                1.Today
                2.Others Day
                """);
                day = sc.nextInt();
                if(day==1|| day==2)
                    break;
                else
                    System.out.println("Enter only 1 or 2");
            } catch (Exception e) {
                System.out.println("Invalid input ! please Enter only 1 or 2 ");
                sc.nextLine();
            }
        }
        int typeExpense=0;
        while(true)
        {
            try{
                System.out.println("""
                        Enter Only Integer
                        1.Rent
                        2.Groceries
                        3.Food
                        4.Loan payment(Emi,credit card bill etc)
                        5.Medical & Healthcare
                        6.Others
                        """);
                typeExpense=sc.nextInt();
                sc.nextLine();
                break;
            }
            catch (Exception e)
            {
                System.out.println("Invalid input! please Enter only Integer values ");
                sc.nextLine();
            }
        }
        System.out.println("Enter the Expense Name");
        String exName=sc.nextLine();
        int exAmount=0;
        while(true) {
            try {
                System.out.println("Enter the Expense Amount ");
                exAmount=sc.nextInt();
                break;
            } catch (Exception e) {
                System.out.println("Invalid input! please Enter only integer value ");
                sc.nextLine();
            }
        }


        System.out.println(exName+":"+exAmount);
    }
}
