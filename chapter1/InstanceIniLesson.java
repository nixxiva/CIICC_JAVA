package chapter1;

public class InstanceIniLesson {

    public InstanceIniLesson(){
        code = 999;
        System.out.println(code);
    }
    
    int code = 67;

    {
        System.out.println(code);
    }

    public static void main(String[] args) {
        InstanceIniLesson ini = new InstanceIniLesson();

        {
            System.out.println("Feathers");
        }
        
    }

    {
        System.out.println("Snowy");
        code = 100;
        System.out.println(code);
    }
}

// nirun anng psvm, tinawag ang class, tinawag and initializer block {} and last construction and after ni run ang feathers.
