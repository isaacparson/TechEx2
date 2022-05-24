import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @org.junit.jupiter.api.Test
    void poleNum() throws IOException {
        assertEquals("1235", Main.poleNum("Human","PWTS"));
    }

    @org.junit.jupiter.api.Test
    void minWay() {
        int[][] matA = {{2,2,3,3},{3,2,2,2},{2,2,2,2},{2,3,2,2}}, matB = new int[4][4];
        int[][] matC = {{0,2,5,8},{3,4,6,8},{5,6,8,10},{7,9,10,12}};
        Main.minWay(matA,matB);
        boolean tf = true;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (matC[i][j] != matB[i][j]) {
                    tf = false;
                    break;
                }
            }
            if (tf == false) break;
        }
        assertEquals(true, tf);
    }
}