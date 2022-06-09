import static org.junit.jupiter.api.Assertions.*;

class HyperparTest {

    @org.junit.jupiter.api.Test
    void hyper() {
        Hyperpar B1 = new Hyperpar();
        boolean resultado = B1.Hyper(2213);
        assertEquals(false,resultado);
    }

    @org.junit.jupiter.api.Test
    void hyper1() {
        Hyperpar B1 = new Hyperpar();
        boolean resultado = B1.Hyper(2222);
        assertEquals(true,resultado);
    }

    @org.junit.jupiter.api.Test
    void hyper2() {
        Hyperpar B1 = new Hyperpar();
        boolean resultado = B1.Hyper(2264);
        assertEquals(true,resultado);
    }
}