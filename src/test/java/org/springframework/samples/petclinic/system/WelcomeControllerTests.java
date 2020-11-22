package org.springframework.samples.petclinic.system;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;

@WebMvcTest(WelcomeController.class)
public class WelcomeControllerTests {

	@Autowired
	private MockMvc mockMvc;

	@Test
	void Welcome() throws Exception {
		mockMvc.perform(get("/"));
	}
}
