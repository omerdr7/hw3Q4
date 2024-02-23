package homework3q4;

import java.util.ArrayList;

public class Homework3Q4 {

    public static int isFactorian(int sayi) {
        int counter = 0;
        sayi = 3245;
        int result = 1;
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> listOfFactorielOfDigits = new ArrayList<>();
        while (sayi > 0) {
            int digit = sayi % 10;
            list.add(digit);
            sayi = sayi / 10;
            counter++;
        }
        System.out.println("digit count=" + counter);
        for (Integer integer : list) {
            System.out.println("digits=" + integer);
        }
        for (int i = 0; i < counter; i++) {
            for (int j = 1; j <= list.get(i); j++) {
                result = j * result;
//                System.out.println(j);
            }
            listOfFactorielOfDigits.add(result);
            result = 1;
//            System.out.println(result);
        }
        for (Integer listOfFactorielOfDigit : listOfFactorielOfDigits) {
            System.out.println("factoriel of digits=" + listOfFactorielOfDigit.intValue());
        }
        int sum = 0;
        for (int b = 0; b < listOfFactorielOfDigits.size(); b++) {
            sum += listOfFactorielOfDigits.get(b);
        }
//        System.out.println(sum);
        sayi=3245;
        if (sum == sayi) {
            int factorianNumber = sum;
            System.out.println("factorian number=" + factorianNumber);
        }else{
            System.out.println("sum= "+sum +" isn't equal the number= "+sayi +" so it is not a factorian number.");
        }
        return 0;
    }

    public static void main(String[] args) {
        isFactorian(3245);
    }
}
