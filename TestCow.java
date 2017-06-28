

import farmanimals.Cow;
import farmanimals.FarmAnimal;
import java.util.Date;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author georg
 */
public class TestCow {
    
    public TestCow() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void cowTest() {
        System.out.println("Corriendo prueba");
        String [] nombresEsperados ={"juana","maria","maruja","carla","pepita"};
        int [] idEsperados={1,2,3,4,5};
        String [] nombresActuales={"","","","",""};
        int [] idActuales={0,0,0,0,0};
        Date [] fechaEsperada=new Date [5];
        Date [] fechaActual=new Date[5];
            FarmAnimal [] vacas= new Cow [5];
            System.out.println("inicializando vacas");
            for(int i=0;i<vacas.length;i++){
                vacas[i]= new Cow();
            }
            System.out.println("vacas inicializadas");
            
            for(int i=0;i<vacas.length;i++){
                vacas[i].setName(nombresEsperados[i]);
                System.out.println("vaca"+(i+1));
                vacas[i].setId(idEsperados[i]);
                System.out.println("id"+(i+1));
                vacas[i].setBornOn(new Date(116,3+i,4));
                fechaEsperada[i]=vacas[i].getBornOn();
                System.out.println("fecha"+(i+1));
            }
            System.out.println("datos esperados");
            for(int i=0;i<5;i++){
                nombresActuales[i] = vacas[i].getName();
                System.out.println("nombre");
                idActuales[i]=vacas[i].getId();
                System.out.println("id");
                fechaActual[i]=vacas[i].getBornOn();
                System.out.println("fecha");
            }
            System.out.println("datos actuales");
            for(int i=0;i<5;i++){
                assertEquals(nombresEsperados[i],nombresActuales[i]);
                System.out.println("Name test passed");
                assertEquals(idEsperados[i],idActuales[i]);
                System.out.println("id test passed");
                assertEquals(fechaEsperada[i],fechaActual[i]);
            }
            System.out.println("edad test passed");
        
    }
    
    
}
