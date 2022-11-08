public class Main {
    public static void main(String[] args) {

 //  Задание 1
        var dog = 8.0;
        System.out.println("dog = " + dog);
        var cat = 3.6;
        System.out.println("cat = " + cat );
        var paper = 763789;
        System.out.println("paper = " + paper);

  // Задание 2
        dog = dog + 4;
        System.out.println("dog = " + dog);
        cat = cat + 4;
        System.out.println("cat = " + cat);
        paper = paper + 4;
        System.out.println("paper = " + paper);

  // Задание 3
        dog = dog - 3.5;
        System.out.println("dog = " + dog);
        cat = cat - 1.6;
        System.out.println("cat = " + cat);
        paper = paper - 7639;
        System.out.println("paper = " + paper);

 // Задание 4
        var friend = 19;
        System.out.println(" friend = " + friend );
        friend = friend + 2;
        System.out.println(" friend = " + friend );
        friend = friend / 7;
        System.out.println(" friend = " + friend  );

  // Задание 5
        var frog = 3.5;
        System.out.println(" frog = " + frog );
        frog = frog * 10;
        System.out.println(" frog = " + frog );
        frog = frog / 3.5;
        System.out.println(" frog = " + frog );
        frog = frog + 4;
        System.out.println(" frog = " + frog );


   // Задание 6
        var weightOfOneBoxer = 78.2;
        var weightOfTheSecondBoxer = 82.7;
        var totalWeightOfTwoBoxers = weightOfOneBoxer + weightOfTheSecondBoxer;
        System.out.println(" Общий вес боксеров = " + totalWeightOfTwoBoxers );

        var weightDifference = weightOfTheSecondBoxer - weightOfOneBoxer;
        System.out.println(" Второй боксер тяжелее первого на  " + weightDifference + "кг!" );

        // Задание 7
        var weightDifferenceTwoBoxers = weightOfTheSecondBoxer - weightOfOneBoxer;
        System.out.println(" Второй боксер тяжелее первого на  " + weightDifferenceTwoBoxers + "кг!" );
        var theDifferenceInTheWeightsOfAthletes = weightOfTheSecondBoxer % weightOfOneBoxer;
        System.out.println(" Второй боксер тяжелее первого на  " + theDifferenceInTheWeightsOfAthletes + "кг!" );



    }
}