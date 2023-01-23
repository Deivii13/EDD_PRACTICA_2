import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;

public class TicTacToeTest {

        /*
          -------------------------------------------
          Test de caja negra sobre el método checkHit
          -------------------------------------------
        */

    // Test 1: no hay ganador pero nos arroja true, cuando no debería ser así
    // porque no hay ningún caso en el haga 3 en raya.
    @Test
    public void test1() {
        int[][] tableroT1 = { // Caso aleatorio con resultado en empate.

                {1, 2, 1},
                {1, 2, 1},
                {2, 1, 2}

        };
        boolean r1 = TicTacToe.checkHit(tableroT1);
        assertEquals(r1, false);
    }



    // Test 2: ganador jugador 1 primera línea horizontal.
    @Test
    public void test2() {
        int[][] tableroT2 = { // caso aleatorio con ganador en línea horizontal.
                {1, 1, 1},
                {1, 2, 2},
                {2, 1, 2}

        };

        boolean r2 = TicTacToe.checkHit(tableroT2);
        assertEquals(r2, false);
    }



    // Test 3: ganador jugador 1 primera línea vertical.
    @Test
    public void test3() {
        int [][] tableroT3 = { // Caso aleatorio con ganador en línea vertical.

                {1, 2, 1},
                {1, 2, 2},
                {1, 1, 2}

        };

        boolean r3 = TicTacToe.checkHit( tableroT3 );
        assertEquals(r3, true);
    }



    // Test 4: ganador jugador 2  línea diagonal.
    @Test
    public void test4() {
        int [][] tableroT4 = { // Caso aleatorio con ganador en línea diagonal.

                {1, 2, 2},
                {1, 2, 2},
                {2, 1, 1}

        };

        boolean r4 = TicTacToe.checkHit( tableroT4 );
        assertEquals(r4, true);
    }



    // Test 5: Le pasamos una array vacía
    // Lo considero caso erróneo porque al dar IndexOutOfBounds opino que se pasa de un caso límite.
    @Test
    public void test5() {
        int [][] tableroT5 = { // Caso erróneo, array vacía.

                {    },
                {    },
                {    }

        };

        assertThrows(ArrayIndexOutOfBoundsException.class,()->TicTacToe.checkHit( tableroT5 ));
    }



    //Test 6:
    @Test
    public void test6 () {

        int [][] tableroT6 = { // Caso erróneo una array de distinto tamaño y sin una combinación ganadora

                {2, 1, 1},
                {2, 2},
                {1, 2, 1}

        };

        assertThrows(ArrayIndexOutOfBoundsException.class,()->TicTacToe.checkHit( tableroT6 ));
    }



    //Test 7: Caso erróneo una array de distinto tamaño y sin una combinación ganadora.
    @Test
    public void test7 () {

        int [][] tableroT7 = {

                {1, 1, 1},
                {2, 2},
                {1, 2, 1}

        };

        boolean r7 = TicTacToe.checkHit( tableroT7 );
        assertEquals(r7, true);
    }

    //Test 8: Caso erróneo una array de distinto tamaño y sin una combinación ganadora
    @Test
    public void test8 () {

        int [][] tableroT8 = {

                {1, 1, 1},
                {2, 2},
                {1, 2, 1}

        };

        boolean r8 = TicTacToe.checkHit( tableroT8 );
        assertEquals(r8, true);
    }


        /*
          -------------------------------------------
          Test de caja blanca sobre el método main2
          -------------------------------------------
        */

    // Test 9: Array con el jugador 2 como un ganador
    // Nos surge un error por un fallo del código y nos indica que el ganador es el jugador1
    @Test
    public void test9() {

        String [] stringT9 = {

                "2", "2", "1",
                "1", "2", "1",
                "1", "1", "2"
        };

        assertEquals( TicTacToe.main2( stringT9 ), "Player 2 WINS!");
    }



    // Test 10: Array con el jugador 1 como un ganador

    @Test
    public void test10() {

        String [] stringT10 = {

                "1", "2", "1",
                "1", "2", "2",
                "1", "1", "2"
        };

        assertEquals( TicTacToe.main2( stringT10 ), "Player 1 WINS!");
    }



    // Test 11: array con el resultado en empate.
    @Test
    public void test11() {

        String [] stringT11 = {
                "1", "2", "2",
                "2", "1", "1",
                "1", "1", "2"
        };

        assertEquals( TicTacToe.main2( stringT11 ), "It's a draw!");
    }



    // Test 12: array completa del mismo número del jugador, nos devuelve
    // como ganador el jugador 1 porque al ser el primero la condición cheating
    // pasa a ser true y entonces procede a decir que el jugador uno es el ganador.
    @Test
    public void test12() {

        String [] stringT12 = {
                "2", "2", "2",
                "2", "2", "2",
                "2", "2", "2"
        };

        assertEquals( TicTacToe.main2( stringT12 ), "Player 2 WINS!");
    }

}