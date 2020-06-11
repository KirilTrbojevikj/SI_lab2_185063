import org.junit.jupiter.api.Test;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SILab2Test {

    Angle one=null;
    Angle two= new Angle(10,-10,10);
    Angle three= new Angle(10,10,61);
    Angle six= new Angle(360,20,50);
    Angle seven= new Angle(400,0,20);
    Angle four= new Angle(10,10,10);
    Angle five= new Angle(360,0,0);
    


    private List<Angle> createList(Angle... elems){
        return new ArrayList<>(Arrays.asList(elems));
    }
    private List<Integer> createListInt(Integer... elems){
        return new ArrayList<>(Arrays.asList(elems));
    }

    @Test
    void everyStatementTestAndBranchTest() {
        RuntimeException ex;

        ex= assertThrows(RuntimeException.class, () -> SILab2.function(createList(two)));
        assertTrue(ex.getMessage().contains("The minutes of the angle are not valid!"));

        ex= assertThrows(RuntimeException.class, () -> SILab2.function(createList(three)));
        assertTrue(ex.getMessage().contains("The seconds of the angle are not valid"));

        ex= assertThrows(RuntimeException.class, () -> SILab2.function(createList(six)));
        assertTrue(ex.getMessage().contains("The angle is greater then the maximum"));

        ex= assertThrows(RuntimeException.class, () -> SILab2.function(createList(seven)));
        assertTrue(ex.getMessage().contains("The angle is smaller or greater then the minimum"));

      assertEquals(createListInt(1296000), SILab2.function(createList(five)));

      assertEquals(createListInt(36610), SILab2.function(createList(four)));

    }

}