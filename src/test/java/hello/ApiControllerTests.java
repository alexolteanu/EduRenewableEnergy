package hello;

import static org.assertj.core.api.Assertions.assertThat;


import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.test.context.junit4.SpringRunner;

import java.sql.Timestamp;

@SpringBootTest(classes = ApiController.class)
@EnableJpaRepositories("hello.model")
@DataJpaTest
@EntityScan(value = "hello.model")
@RunWith(SpringRunner.class)
public class ApiControllerTests {

    @Autowired
    private ApiController controller;

    @Test
    public void contextLoads() throws Exception {
        assertThat(controller).isNotNull();
    }

    @Test
    public void addEnergyReadingTurbineNotFound() {
        String result = controller.addNewEnergyReading("NotFindable", 5.f, new Timestamp(System.currentTimeMillis()));
        Assert.assertEquals("WindTurbine with name NotFindable could not be found", result);
    }
}
