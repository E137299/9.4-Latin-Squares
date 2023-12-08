import org.junit.*;

public class MainTest{
    @Test
    public void testLatinSquare1(){
        int order = 3;
        int top_left = 2;
        int[][] matrix = {{2,3,1},{3,1,2},{1,2,3}};
        Assert.assertEquals(matrix, Main.generateLatinSquare(order,top_left));
    }

    @Test
    public void testLatinSquare2(){
        int order = 5;
        int top_left = 4;
        int[][] matrix = {{4,5,1,2,3},{5,1,2,3,4},{1,2,3,4,5},{2,3,4,5,1},{3,4,5,1,2}};
        Assert.assertEquals(matrix, Main.generateLatinSquare(order,top_left));
    }


}