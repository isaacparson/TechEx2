import java.io.*;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
public class Main {

    //Ввод с клавиатуры
    public static String enter() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        return reader.readLine();
    }
    /*
    public static String getInfo(String Race, char Ch) {
        try {
            File file = new File("info.txt");
            FileReader fr = new FileReader(file);
            BufferedReader reader = new BufferedReader(fr);
            String line = reader.readLine();
            while (line != null) {
                System.out.println(line);
                line = reader.readLine();
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        return null;
    }
     */
    //Замена букв на цифры
    public static String poleNum(String Race, String Pole) throws IOException {
        String PoleNum = Pole;
        File file = new File("C:\\Users\\Isaac\\IdeaProjects\\TechEx2\\src\\info.txt");
        FileReader fr = new FileReader(file);
        BufferedReader reader = new BufferedReader(fr);
        String line = reader.readLine();
        if (line.equals(Race)) {
            for (int i = 0; i < 4; i++) {
                line = reader.readLine();
                char where = line.charAt(0);
                line = reader.readLine();
                char Num = line.charAt(0);
                PoleNum = PoleNum.replace(where, Num);
            }
        }
        else {
            for (int i = 0; i < 100; i++) {
                line = reader.readLine();
                if (line.equals(Race)) break;
            }
            for (int i = 0; i < 4; i++) {
                line = reader.readLine();
                char where = line.charAt(0);
                line = reader.readLine();
                char Num = line.charAt(0);
                PoleNum = PoleNum.replace(where, Num);
            }

        }

        return PoleNum;
    }

    //Нахождение минимального пути в матрице
    public static void minWay(int[][] matrixA, int [][] matrixB) {
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (i == 0 && j == 0) {
                    matrixB[i][j] = 0;
                } else if (i == 0 && j != 0) {
                    matrixB[i][j] = matrixA[i][j] + matrixB[i][j-1];
                } else if (i != 0 && j == 0) {
                    matrixB[i][j] = matrixA[i][j] + matrixB[i-1][j];
                } else {
                    if (matrixB[i-1][j] < matrixB[i][j-1]) {
                        matrixB[i][j] = matrixA[i][j] + matrixB[i-1][j];
                    } else {
                        matrixB[i][j] = matrixA[i][j] + matrixB[i][j-1];
                    }
                }
            }
        }
    }

    public static void main(String[] args) throws IOException {
        System.out.print("Введите поле: ");
        String Pole = enter();
        System.out.print("Введите расу: ");
        String Race = enter();
        System.out.print("Минимальный путь: ");
        System.out.println(Solution.getResult(Pole, Race));
    }
}
