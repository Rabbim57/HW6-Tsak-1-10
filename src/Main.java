public class Main {
    public static void main(String[] args) {
        for (int numberOneTen = 1; numberOneTen <= 10; numberOneTen++ ){
            System.out.println(numberOneTen + " Первое задание");
        }

        for (int numberTenOne = 10; numberTenOne >= 0; numberTenOne -= 1 ) {
            System.out.println(numberTenOne + " Второе задание");
        }
        for (int numberEven = 0; numberEven <= 17; numberEven += 2 ) {
            System.out.println(numberEven + " Третье задание");
        }
        for (int numberSmall = 10; numberSmall >= -10; numberSmall -= 1  ) {
            System.out.println(numberSmall + " Четвертое задание");
        }

        for (int year = 1904; year <= 2096; year ++) {
            if (year %4 == 0){
                System.out.println(year + (" год является высокосным"));
            }else if (year % 100 !=0) {
                System.out.println();
            }else if (year % 400 ==0){
                System.out.println( year + (" год является высокосным"));
            }else {
                System.out.println();
            }
        }
        for (int year = 1904; year <= 2096; year += 4){
            System.out.println(year + "Год является высокосынм Второй варинат");
        }
        for (int numberIncrease = 7; numberIncrease <= 98; numberIncrease += 7) {
            System.out.println(numberIncrease + " Шестое задание");
        }
        for (int numberSquare = 1; numberSquare <= 512; numberSquare *= 2) {
            System.out.println(numberSquare + " Седьмое задание");
        }
        int salary = 29000;
        int total = 0;
        for (int month= 1; month <=12; month ++){
            total = total + salary;
            System.out.println("Месяц " + month + ", сумма накоплений равна " + total + " рублей");
        }
        int salaryBank = 29000;
        int totalBank = 0;
        for (int month= 1; month <=12; month ++){
            totalBank = totalBank + total/100;
            totalBank = totalBank + salaryBank;
            System.out.println("Месяц " + month + ", сумма накоплений равна " + totalBank + " рублей" + "Девятое задание");
        }
        for (int numberOneTable = 2; numberOneTable <= 2; numberOneTable ++ ) {
            for (int numberTwoTable = 1; numberTwoTable <= 10; numberTwoTable ++ )
                System.out.println(numberOneTable + "*" + numberTwoTable + "=" + (numberOneTable * numberTwoTable));
        }

        System.out.println();
        // Task 10
        System.out.println("Task 10");

        for ( int i = 0; i<= 10; i ++ ){
            System.out.println("2 * " + i + " = " + (2 * 1));
        }



    }
}
