package com.shalahuddin.web.signup;

import static org.hamcrest.Matchers.allOf;
import static org.hamcrest.Matchers.containsString;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.model;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;

import org.junit.Test;

import com.shalahuddin.web.config.WebSecurityConfigurationAware;

public class SignupControllerTest extends WebSecurityConfigurationAware {
	@Test
	public void displaysSignupForm() throws Exception {
		mockMvc.perform(get("/signup"))
		.andExpect(model().attributeExists("signupForm"))
		.andExpect(view().name("signup/signup"))
		.andExpect(content().string(
				allOf(
						containsString("<title>Sign Up</title>"),
						containsString("<legend>Please Sign Up</legend>")
						))
				);
	}
}