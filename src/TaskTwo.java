public class TaskTwo {
   public static void main(String[]arguments){

       int numOne= 10 ,numTwo = 5;
       char operation = '/';

       switch (operation){
           case '+':
               System.out.println("Result :" + " " + (numOne+numTwo));
               break;
           case '-':
               System.out.println("Result :" + " " + (numOne - numTwo));
               break;
           case '*':
               System.out.println("Result :" + " " +(numOne*numTwo));
               break;
           case '/':
               switch (numOne) {
                   case 0:
                       System.out.println("Error: Division by zero is Not Allowed");
                       break;
                   default:
                       System.out.println("Result :" + " " + (numOne / numTwo));

               }

       }

       if(operation == '+'){
           System.out.println("Result :" + " " + (numOne+numTwo));
       } else if (operation == '-') {
           System.out.println("Result :" + " " + (numOne-numTwo));
       } else if (operation == '*') {
           System.out.println("Result :" + " " + (numOne*numTwo));
       } else if (operation == '/') {
           if(numOne == 0){
               System.out.println("Error: Division by zero is Not Allowed");

           }else {
               System.out.println("Result :" + " " + (numOne/numTwo));

           }

       }


   }
}
