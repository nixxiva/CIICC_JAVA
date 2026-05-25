package chapter2;

public class IfSwitchStatementLesson {

    public static void main(String[] args) {
        int hourOfDay = 20;
        // if(hourOfDay < 11) {
        //     System.out.println("Good Morning!");
        //     System.out.println("Kumain kana ba?");
        // }

        // IF ELSE STATEMENT

        if(hourOfDay < 11)
            System.out.println("Good Morning!");
        else
            System.out.println("Good Afternoon!"); 
        
        System.out.println("end of program");


        // IF ELSE IF STATEMENT
        if(hourOfDay < 11)
            System.out.println("Good Morning!");

        else if(hourOfDay < 18)
            System.out.println("Good Afternoon!"); 

        else if(hourOfDay < 22){
            System.out.println("Good Evening!");
            System.out.println("Gising ka pa?");
        }

        else
            System.out.println("So late at night!");

        System.out.println("end of program");



        // SWITCH STATEMENTS
        
        int dayOfWeek = 1;
        switch(dayOfWeek) {

        case 1:
            System.out.println("Monday");
            break;
        case 2:
            System.out.println("Tuesday");
            break;
        case 3:
            System.out.println("Wednesday");
            break;
        case 4:
            System.out.println("Thursday");
            break;
        case 5:
            System.out.println("Friday");
            break;
        case 6:
            System.out.println("Saturday");
            break;
        case 7:
            System.out.println("Sunday");
            break;
        default:
            System.out.println("Invalid day of the week!");
        }

        // 2ND SWITCH 

        switch(dayOfWeek) {
            case 1,2,3,4,5:
                System.out.println("It's a weekday!");
                break;
            case 6:
            case 7:
                System.out.println("It's a weekend!");
                break;
            default:
                System.out.println("Invalid day of the week!");
        }

    }
}