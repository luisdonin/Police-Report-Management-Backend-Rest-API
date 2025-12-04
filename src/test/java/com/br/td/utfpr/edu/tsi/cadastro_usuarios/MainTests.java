// java
package com.br.td.utfpr.edu.tsi.cadastro_usuarios;

import org.junit.jupiter.api.Test;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class MainTests {

    @SpringBootConfiguration
    @EnableAutoConfiguration
    static class TestConfig {
        // minimal test configuration to satisfy SpringBootTest
    }

    @Test
    void contextLoads() {
    }

}
