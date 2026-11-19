package ga.esiitech.tp;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ProductTest {

    @Test
    void testValeurDuStock() {
        Product clavier = new Product("Clavier", 15000, 3);
        assertEquals(45000, clavier.getStockValue());
    }
    @Test
    void testStockVide() {
        Product souris = new Product("Souris", 5000, 0);
        assertEquals(0, souris.getStockValue());
    }

    @Test
    void testRemise (){
        Product clavier = new Product("Clavier", 15000, 1);
        assertEquals(13500,clavier.getPriceWithDiscount(10));
    }
}
