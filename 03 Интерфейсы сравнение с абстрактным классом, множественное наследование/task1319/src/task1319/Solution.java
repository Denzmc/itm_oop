package task1319;

import java.io.*;

/* 
Писатель в файл с консоли
В этой задаче тебе нужно:
Прочесть с консоли имя файла.
Считывать строки с консоли, пока пользователь не введет строку "exit".
Записать абсолютно все введенные в п.2 строки в файл: каждую строчку — с новой строки.

Requirements:
1. Программа должна считывать c консоли имя файла.
2. Создай и используй объект типа BufferedWriter.
3. Программа не должна ничего считывать из файловой системы.
4. Программа должна считывать строки с консоли, пока пользователь не введет строку "exit".
5. Программа должна записать все введенные строки (включая "exit", но не включая имя файла) в файл: каждую строчку — с новой строки.
6. Метод main должен закрывать объект типа BufferedWriter после использования.
7. Метод main не должен выводить данные на экран.*/

public class Solution {
    public static void main(String[] args) {
        try{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("File name");
            String str = br.readLine();

            System.out.println("Input text");
            BufferedWriter bw = new BufferedWriter(new FileWriter(str));

            String str2;
            while (true) {
                str2 = br.readLine();
                if (str2.equals("exit")) break;
                bw.write(str2+"\n");
            }
            br.close();
            bw.close();
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
