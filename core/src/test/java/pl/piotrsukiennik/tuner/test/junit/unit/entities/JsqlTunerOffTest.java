package pl.piotrsukiennik.tuner.test.junit.unit.entities;

import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import pl.piotrsukiennik.tuner.test.junit.TestEntities;

/**
 * @author Piotr Sukiennik
 * @date 19.02.14
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "/jsqltuner-test-root-plain-context.xml" })
public class JsqlTunerOffTest extends TestEntities {
}
