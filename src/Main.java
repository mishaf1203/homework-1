import jdk.swing.interop.SwingInterOpUtils;

public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1");
        byte a = -128;
        short b = 32;
        int c = 64;
        long d = 1024L;

        float x = 8.2f;
        double y = 16.4;
        System.out.println(a + ", " + b + ", " + c + ", " + d + ", " + x + ", " + y);

        char dollar = 36;
        System.out.println(dollar);

        boolean cb = c > b;
        System.out.println(cb);

        System.out.println("Задача 2");
        //Задача 2

        double boxer1Weight = 78.2;
        double boxer2Weight = 82.7;
        double totalWeight = boxer1Weight + boxer2Weight;
        System.out.println("Общий вес спортсменов " + totalWeight + "кг");
        double difference = boxer2Weight - boxer1Weight;
        System.out.println("Разница между весами спорстменов " + difference);

        System.out.println("Задача 3 ");
        //Задача 3

        int banana = 80 * 5;
        int milk = 105 * 2;
        int iceCream = 100 * 2;
        int eggs = 70 * 4;
        int breakfastWeightGramm = banana + milk + iceCream + eggs;
        System.out.println("Вес завтрака  " + breakfastWeightGramm + " грамм");
        double breakfastWeightKilo =  breakfastWeightGramm / 1000.0;
        System.out.println("Вес завтрака  " + breakfastWeightKilo + " килограмм");

        System.out.println("Задача 4");
        //Задача 4

        int totalWeightLoss = 7000; //1 килограмм равен 1 грамму, следовательно 7000 грамм
        int weightLoss250InDay = totalWeightLoss / 250;

        System.out.println("Понадобится " + weightLoss250InDay + " дней для похудения на 250 грамм в день");

        int weightLoss500InDay = totalWeightLoss / 500;
        System.out.println("Понадобится " + weightLoss500InDay + " дней для похудения на 500 грамм в день");

        int weightLossAvg = (weightLoss250InDay + weightLoss500InDay) / 2;
        System.out.println("Понадобится " + weightLossAvg + " в среднем дней для похудения");

        System.out.println("Задача 5  ");
        //Задача 5

        float MashaSalary = 67760F;
        float DenisSalary = 83690F;
        float KristinaSalary = 76230F;

        float MashaAnnualSalary = MashaSalary * 12;
        float DenisAnnualSalary = DenisSalary * 12;
        float KristinaAnnualSalary = KristinaSalary * 12;

        double incrMashaSalary = MashaSalary * 1.1;
        double incrDenisSalary = DenisSalary * 1.1;
        double incrKristinaSalary = KristinaSalary * 1.1;

        System.out.println("Зарплата Маши после повышения " + incrMashaSalary + " рублей");
        System.out.println("Зарплата Дениса после повышения " + incrDenisSalary + " рублей");
        System.out.println("Зарплата Кристины после повышения " + incrKristinaSalary + " рублей");

        double incrMashaAnnualSalary = incrMashaSalary * 12;
        double incrDenisAnnualSalary = incrDenisSalary * 12;
        double incrKristinaAnnualSalary = incrKristinaSalary * 12;

        System.out.println("Повышенные годовые зарплаты Маши, Дениса и Кристины:");
        System.out.println(incrMashaAnnualSalary);
        System.out.println(incrDenisAnnualSalary);
        System.out.println(incrKristinaAnnualSalary);

        double differenceMasha = incrMashaAnnualSalary - MashaAnnualSalary;
        double differenceDenis = incrDenisAnnualSalary - DenisAnnualSalary;
        double differenceKristina = incrKristinaAnnualSalary - KristinaAnnualSalary;

        System.out.println("Разница между годовыми зарплатами до и после повышения Маши, Дениса и Кристины:");
        System.out.println(differenceMasha);
        System.out.println(differenceDenis);
        System.out.println(differenceKristina);


    }


}
