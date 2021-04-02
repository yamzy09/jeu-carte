
package com.atexo.jeucarte;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;

@SpringBootTest
class JeuCarteApplicationTests {

    @Autowired
    private JeuCarteApplication controller;


	@Test
	void contextLoads() throws Exception {

            assertThat(controller).isNotNull();
        }
	}



