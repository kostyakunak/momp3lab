public class Main {
    public static void main(String[] args) {
        // 1 завдання: Підрахунок факторіалу
        int n1 = 5;
        int result1Recursion = FactorialCalculator.recursion(n1);
        System.out.println("Факторіал " + n1 + " - " + result1Recursion);

        // 2 завдання: Підрахунок числа Фібоначчі
        int n2 = 15;
        int result2Recursion = FibonacciCalculator.recursion(n2);
        System.out.println("Число Фібоначчі" + n2 + ": " + result2Recursion);

        // 3 завдання: Сума цифр числа
        int n3 = 1893;
        int result3 = NCalculator.execute(n3);
        System.out.println("Сума цифр числа " + n3 + ": " + result3);

        // 4 завдання: Рекурсивне додавання двох чисел
        int a4 = 7;
        int b4 = 5;
        int result4 = RecursiveAddition.execute(a4, b4);
        System.out.println("сума без використання оператора плюс: " + a4 + " плюс " + b4 + " дорівнює " + result4);
    }
}
