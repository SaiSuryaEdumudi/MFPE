package com.cognizant;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;

  //Test class for AuditWebPortalApplication
@SpringBootTest
class AuditWebPortalApplicationTests {

	@Mock
	AuditWebPortalApplication webapplication;
	@Test
	void contextLoads() {
		assertNotNull(webapplication);
	}

}
