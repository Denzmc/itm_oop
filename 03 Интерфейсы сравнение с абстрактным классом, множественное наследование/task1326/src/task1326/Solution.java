package task1326;

import java.io.*;
import java.util.*;

/* 
Сортировка четных чисел из файла
В этой задаче тебе нужно:
Ввести имя файла с консоли.
Прочитать из него набор чисел.
Вывести в консоли только четные, отсортированные по возрастанию.
Пример ввода:
5
8
-2
11
3
-5
2
10

Пример вывода:
-2
2
8
10


Requirements:
1. Программа должна считывать данные с консоли.
2. Программа должна создавать FileInputStream для введенной с консоли строки.
3. Программа должна выводить данные на экран.
4. Программа должна вывести на экран все четные числа, считанные из файла, отсортированные по возрастанию.
5. Программа должна закрывать поток чтения из файла — FileInputStream.*/

public class Solution {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        String filePath = sc.nextLine();

        FileInputStream fis = new FileInputStream(filePath);
        BufferedReader br = new BufferedReader(new InputStreamReader(fis));

        String line;
        List<Integer> list = new ArrayList<>();
        while ((line = br.readLine()) != null) {
            list.add(Integer.parseInt(line));
        }
        list.sort(Comparator.naturalOrder());
        for (int a: list) {
            if (a%2 == 1) continue;
            System.out.println(a);
        }
        fis.close();
    }
}
