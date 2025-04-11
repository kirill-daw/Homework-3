public class Main {
    public static void main(String[] args) {

        System.out.println("Задание 1");
        byte earth = 1;
        short cat = 2000;
        int cupcake = 100000;
        long people = 1000000000;
        float crumb = 1.29f;
        double fraction = 1.2999999999;
        System.out.println("Значение переменной earth с типом byte = " + earth);
        System.out.println("Значение переменной cat с типом short = " + cat);
        System.out.println("Значение переменной cupcake с типом int = " + cupcake);
        System.out.println("Значение переменной people с типом long = " + people);
        System.out.println("Значение переменной crumb с типом float = " + crumb);
        System.out.println("Значение переменной fraction с типом double = " + fraction);

        System.out.println("Задание 2");
        float hours = 27.12f;
        long years = 987678965549L;
        float minutes = 2.786f;
        short warriors = 569;
        short debt = -159;
        short developers = 27897;
        byte mentors = 67;
        System.out.println("Значение переменной hours типа float = " + hours);
        System.out.println("Значение переменной years типа long = " + years);
        System.out.println("Значение переменной minutes типа float = " + minutes);
        System.out.println("Значение переменной warriors типа short = " + warriors);
        System.out.println("Значение переменной debt типа short = " + debt);
        System.out.println("Значение переменной developers типа short = " + developers);
        System.out.println("Значение переменной mentors типа byte = " + mentors);

        System.out.println("Задание 3");
        byte studentsOfLyudmilaP = 23;
        byte studentsOfAnnaS = 27;
        byte studentsOfEkaterinaA = 30;
        short paperSheets = 480;
        byte totalStudents = (byte) (studentsOfLyudmilaP + studentsOfAnnaS + studentsOfEkaterinaA);
        byte paperSheetsForOneStudent = (byte) (paperSheets / totalStudents);
        System.out.println("На каждого ученика рассчитано " + paperSheetsForOneStudent + " листов бумаги.");

        System.out.println("Задание 4");
        int time = 2;
        int bottle = 16;
        byte bottleInMinute = (byte) (bottle / time);
        time = 20;
        bottle = (bottleInMinute * time);
        System.out.println("За " + time + " минут машина произвела " + bottle + " штук бутылок.");
        time = 60 * 24;
        bottle = (bottleInMinute * time);
        System.out.println("За сутки машина произвела " + bottle + " штук бутылок.");
        time *= 3;
        bottle = (bottleInMinute * time);
        System.out.println("За 3 дня машина произвела " + bottle + " штук бутылок.");
        time *= 10;
        bottle = (bottleInMinute * time);
        System.out.println("За месяц машина произвела " + bottle + " штук бутылок.");

        System.out.println("Задание 5");
        byte paint = 120;
        byte brownPaint = 4;
        byte whitePaint = 2;
        byte paintForClassroom = (byte) (brownPaint + whitePaint);
        byte classrooms = (byte) (paint / paintForClassroom);
        brownPaint *= classrooms;
        whitePaint *= classrooms;
        System.out.println("В школе, где " + classrooms + " классов, нужно " + whitePaint + " банок белой краски и " + brownPaint + " банок коричневой краски.");

        System.out.println("Задание 6");
        byte banana = 5;
        byte weightBanana = 80;
        byte milk = 200 / 100;
        byte weightMilk = 105;
        byte iceCream = 2;
        byte weightIceCream = 100;
        byte egg = 4;
        byte weightEgg = 70;
        float weightCocktail = (float) (banana * weightBanana + milk * weightMilk + iceCream * weightIceCream + egg * weightEgg);
        weightCocktail /= 1000;
        System.out.println("Вес спортивного завтрака " + weightCocktail + " кг.");

        System.out.println("Задание 7");
        byte lostWeight = 7;
        float lostWeightInDayMin = 0.250f;
        float lostWeightInDayMax = 0.500f;
        byte daysMax = (byte) (lostWeight / lostWeightInDayMin);
        System.out.println(daysMax + " дней уйдет на похудение, если спортсмен будет терять каждый день по 250 грамм.");
        byte daysMin = (byte) (lostWeight / lostWeightInDayMax);
        System.out.println(daysMin + " дней уйдет на похудение, если спортсмен будет терять каждый день по 500 грамм.");
        int daysAverage = (daysMin + daysMax) / 2;
        System.out.println(daysAverage + " дней уйдет на похудение в среднем.");

        System.out.println("Задание 8");
        int incomeMasha = 67760;
        int incomeDenis = 83690;
        int incomeKristina = 76230;
        int incomeMashaRaised = incomeMasha + (incomeMasha / 10);
        int incomeDenisRaised = incomeDenis + (incomeDenis / 10);
        int incomeKristinaRaised = incomeKristina + (incomeKristina / 10);
        int incomeDiffMashaInYear = (incomeMashaRaised * 12) - (incomeMasha * 12);
        int incomeDiffDenisInYear = (incomeDenisRaised * 12) - (incomeDenis * 12);
        int incomeDiffKristinaInYear = (incomeKristinaRaised * 12) - (incomeKristina * 12);
        System.out.println("Маша теперь получает " + incomeMashaRaised + " рублей. Годовой доход вырос на " + incomeDiffMashaInYear + " рублей.");
        System.out.println("Денис теперь получает " + incomeDenisRaised + " рублей. Годовой доход вырос на " + incomeDiffDenisInYear + " рублей.");
        System.out.println("Кристина теперь получает " + incomeKristinaRaised + " рублей. Годовой доход вырос на " + incomeDiffKristinaInYear + " рублей.");
    }
}