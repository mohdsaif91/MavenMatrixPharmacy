//package com.BeeCee;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.authentication.AuthenticationProvider;
//import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
//import org.springframework.security.web.util.matcher.AntPathRequestMatcher;
//
//@Configuration
//@EnableWebSecurity
//public class BeeCeeSecurityConfig extends WebSecurityConfigurerAdapter {
//
//	@Autowired
//	private UserDetailsService uds;
//
////	@Bean // As we need object of the below overrided method
////	@Override
////	protected UserDetailsService userDetailsService() {
////		Collection<org.springframework.security.core.userdetails.UserDetails> users = new ArrayList<>();
////		users.add((org.springframework.security.core.userdetails.UserDetails) User.withDefaultPasswordEncoder()
////				.username("Kiran").password("kiran@12").roles("USER").build());
////		return new InMemoryUserDetailsManager(users);
////
////	}
//
//	// Accessing credentials from database
//	@Bean
//	public AuthenticationProvider authProvider() {
//		DaoAuthenticationProvider provider = new DaoAuthenticationProvider();
//		provider.setUserDetailsService(uds);
//		provider.setPasswordEncoder(new BCryptPasswordEncoder());
//		return provider;
//	}
//
////	@Override  //To override the above method to show own login page
////	protected void configure(HttpSecurity http) throws Exception {
////
////		http.
////        csrf().requireCsrfProtectionMatcher(new AllExceptUrlStartedWith("/SignUpPage"))          
////		.authorizeRequests().antMatchers("/login").permitAll()
////		.anyRequest().authenticated()
////		.and()
////		.formLogin()
////		.loginPage("/login").permitAll()
////		.and()
////		.logout().invalidateHttpSession(true)
////		.clearAuthentication(true)
////		.logoutRequestMatcher(new AntPathRequestMatcher("logout"))
////		.logoutSuccessUrl("/logout-success").permitAll();
////	}
//	
//	
//
//}
