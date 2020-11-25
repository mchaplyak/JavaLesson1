public class Main {
    public static void main(String[] args) {
//        1. Створити 10 цілочисленних змінних
//          - додати їх між собою
//          - відняти їх між собою
//          - перемножити їх між собою
//          - поділити їх між собою
//          Вивести результати в консоль

        int num1 = 12;
        int num2 = 2;
        int num3 = 98;
        int num4 = 259;
        int num5 = 13;
        int num6 = 34;
        int num7 = 442;
        int num8 = 566;
        int num9 = 339;
        int num10 = 476;


//        2. Придумати речення з 10-12 слів. Кожне слово покласти в змінну. Вивести в консоль
//        ціле речення.

        int plus = num1 + num2 + num3 + num4 + num5 + num6 + num7 + num8 + num9 + num10;
        System.out.println("PlusResult: " + plus);
        int minus = num1 - num2 - num3 - num4 - num5 - num6 - num7 - num8 - num9 - num10;

        System.out.println("MinusResult: " + minus);
        int multiply = num1 * num2 * num3 * num4 * num5 * num6 * num7 * num8 * num9 * num10;

        System.out.println("MultiplyResult: " + multiply);
        int divide = num1 / num2;
        System.out.println("DivideResult: " + divide);

        String firstWord = "Lorem";
        String secondWord = "ipsum";
        String thirdWord = "dolor";
        String fourthWord = "sit";
        String fiveWord = "amet";
        char sixChar = ',';
        String sevenWord = "consectetur";
        String eightWord = "adipiscing";
        String nineWord = "elit.";

        String sentence =
                "MySentence: " +
                        " " +
                        firstWord +
                        " " +
                        secondWord +
                        " " +
                        thirdWord +
                        " " +
                        fourthWord +
                        " " +
                        fiveWord +
                        sixChar +
                        " " +
                        sevenWord +
                        " " +
                        eightWord +
                        " " +
                        nineWord;
        System.out.println(sentence);

//        3. Створити 10 об'єктів класу User.
//        Скласти між собою значення їх віку і вивести в консоль.
//        Скласти між собою значення їх ваги і вивести в консоль.
//        Скласти між собою значення їх зросту і вивести в консоль.


        User user1 = new User(1, 23, "Max", "Chaplyak", 55.5, 173);
        User user2 = new User(2, 21, "Vova", "Petiv", 65.3, 175);
        User user3 = new User(3, 30, "Oleh", "Katola", 76.2, 180);
        User user4 = new User(4, 45, "Segiy", "Formus", 63.7, 172);
        User user5 = new User(5, 18, "Vasyl", "Bobylyak", 74.1, 181);
        User user6 = new User(6, 12, "Pedro", "Schepanyak", 44.4, 160);
        User user7 = new User(7, 65, "Yura", "Bednar", 80.8, 185);
        User user8 = new User(8, 34, "Bodya", "Steciv", 95.5, 195);
        User user9 = new User(9, 26, "Nazar", "Beniv", 58.9, 170);
        User user10 = new User(10, 33, "Andriy", "Geryliv", 59.9, 169);

        int agePlus = user1.age +
                user2.age +
                user3.age +
                user4.age +
                user5.age +
                user6.age +
                user7.age +
                user8.age +
                user9.age +
                user10.age;

        System.out.println("AllUserAge: " + agePlus);

        double weightPlus = user1.weight +
                user2.weight +
                user3.weight +
                user4.weight +
                user5.weight +
                user6.weight +
                user7.weight +
                user8.weight +
                user9.weight +
                user10.weight;
        System.out.println("AllUserWeight: " + weightPlus);

        double heightPlus = user1.height +
                user2.height +
                user3.height +
                user4.height +
                user5.height +
                user6.height +
                user7.height +
                user8.height +
                user9.height +
                user10.height;
        System.out.println("AllUserHeight: " + heightPlus);


//        4. Зробити завдання 3, але 10 об'єктів покласти в один масив.
//        Скласти між собою значення їх віку і вивести в консоль.
//        Скласти між собою значення їх ваги і вивести в консоль.
//        Скласти між собою значення їх зросту і вивести в консоль.

        User[] users = new User[10];

        users[0] = new User(1, 23, "Max", "Chaplyak", 55.5, 173);
        users[1] = new User(2, 21, "Vova", "Petiv", 65.3, 175);
        users[2] = new User(3, 30, "Oleh", "Katola", 76.2, 180);
        users[3] = new User(4, 45, "Segiy", "Formus", 63.7, 172);
        users[4] = new User(5, 18, "Vasyl", "Bobylyak", 74.1, 181);
        users[5] = new User(6, 12, "Pedro", "Schepanyak", 44.4, 160);
        users[6] = new User(7, 65, "Yura", "Bednar", 80.8, 185);
        users[7] = new User(8, 34, "Bodya", "Steciv", 95.5, 195);
        users[8] = new User(9, 26, "Nazar", "Beniv", 58.9, 170);
        users[9] = new User(10, 33, "Andriy", "Geryliv", 59.9, 169);

        int agePlusArray = users[0].age +
                users[1].age +
                users[2].age +
                users[3].age +
                users[4].age +
                users[5].age +
                users[6].age +
                users[7].age +
                users[8].age +
                users[9].age;

        System.out.println("AllUserAgeInArray: " + agePlusArray);

        double weightPlusArray = users[0].weight +
                users[1].weight +
                users[2].weight +
                users[3].weight +
                users[4].weight +
                users[5].weight +
                users[6].weight +
                users[7].weight +
                users[8].weight +
                users[9].weight;

        System.out.println("AllUserWeightInArray: " + weightPlusArray);

        double heightPlusArray = users[0].height +
                users[1].height +
                users[2].height +
                users[3].height +
                users[4].height +
                users[5].height +
                users[6].height +
                users[7].height +
                users[8].height +
                users[9].height;

        System.out.println("AllUserHeightInArray: " + heightPlusArray);

//        5. Створити 10 об'єктів класу Car.
//        Скласти між собою значення їх об'ємів і вивести в консоль.
//        Скласти між собою значення їх потужностей і вивести в консоль.

        Car car1 = new Car("Tesla", "Model S", "White", 80000, 2017, 700, 0);
        Car car2 = new Car("Tesla", "Model 3", "Black", 40000, 2019, 600, 0);
        Car car3 = new Car("Mercedes", "S34", "Purple", 100000, 2015, 550, 3.5);
        Car car4 = new Car("Volvo", "Dolos", "Pink", 20000, 2013, 200, 2.2);
        Car car5 = new Car("Peugeot", "Partner", "Orange", 15000, 2007, 150, 1.5);
        Car car6 = new Car("Volkswagen", "Passat", "Yellow", 10000, 2005, 230, 1.0);
        Car car7 = new Car("Lada", "Kalina", "Brown", 13000, 2017, 340, 3.3);
        Car car8 = new Car("Range Rover", "Diablo", "Silver", 75000, 2017, 400, 6.0);
        Car car9 = new Car("Porsche", "911 Turbo S", "Black", 120000, 2017, 120, 1.5);
        Car car10 = new Car("Ford", "Focus", "Ivory", 14000, 2017, 400, 2.0);

        double allEngines = car1.engine +
                car2.engine +
                car3.engine +
                car4.engine +
                car5.engine +
                car6.engine +
                car7.engine +
                car8.engine +
                car9.engine +
                car10.engine;
        System.out.println("AllCarsEngines: " + allEngines);

        double allPower = car1.power +
                car2.power +
                car3.power +
                car4.power +
                car5.power +
                car6.power +
                car7.power +
                car8.power +
                car9.power +
                car10.power;
        System.out.println("AllCarsPower: " + allPower);


    }

}
