package task1515;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Статики-2
В этой задаче тебе нужно:
В статическом блоке считать с консоли А и В — две переменные с типом int.
Обработать IOException в блоке catch.
Закрыть поток ввода методом close().

Requirements:
1. Поле A должно быть публичным и статическим.
2. Поле B должно быть публичным и статическим.
3. Программа должна считывать данные с клавиатуры в статическом блоке.
4. Программа должна инициализировать поля A и B в статическом блоке согласно введенным с клавиатуры значениям.
5. Программа должна выводить в консоль минимальное из введенных с клавиатуры значений.*/

public class Solution {
    public static int A;
    public static int B;

    public static final int MIN = min(A, B);

    public static void main(String[] args) {
        System.out.println(MIN);
    }

    public static int min(int a, int b) {
        return a < b ? a : b;
    }
}
