
package com.knoxupc.knoxweb;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class KnoxWebApplicationTests {

    @Test
    public void contextLoads() {
    }

    private class tony {
        private final Logger LOGGER = LoggerFactory.getLogger(tony.class);

        public String name = "tony horse";

        public void selfPrint(String str) {
            LOGGER.info(str);
        }
    }
    @Test
    public void classTest() {
        tony to = new tony();
        Class t = tony.class;
        Class<tony> someTony = tony.class;

    }

}
