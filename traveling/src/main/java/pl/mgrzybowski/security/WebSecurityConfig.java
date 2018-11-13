//package andrzej.dupa.security;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.http.HttpMethod;
//import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
//import org.springframework.security.crypto.password.PasswordEncoder;
//
//@Configuration
//@EnableWebSecurity
//public class WebSecurityConfig extends WebSecurityConfigurerAdapter {
//
//    @Override
//    protected void configure(HttpSecurity http) throws Exception {
//        http
//                .authorizeRequests()
//
//                .antMatchers("/resources/**").permitAll()
//                .antMatchers("/*.js").permitAll()
//
//                .antMatchers(HttpMethod.GET, "/", "/employees").permitAll()
//
//                .antMatchers(HttpMethod.POST, "/employee")
//                    .hasAnyRole("USER", "ADMIN")
//
//                .antMatchers(HttpMethod.DELETE, "/employee/**")
//                    .hasRole("ADMIN")
//
//                .anyRequest().authenticated()
//                .and()
//                .formLogin()
//                .loginPage("/login")
//                .permitAll()
//                .and()
//                .logout()
//                .permitAll();
//    }
//
//    @Override
//    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
//        auth.inMemoryAuthentication()
//                .withUser("admin")
//                .password("$2a$04$.PV0K5kGjfjCvOVqTdfJyO7k19FEXLVWd2YCRJtfdA8PnOHDyjMFK")
//                .roles("ADMIN")
//                .and()
//                .withUser("user")
//                .password("$2a$04$.PV0K5kGjfjCvOVqTdfJyO7k19FEXLVWd2YCRJtfdA8PnOHDyjMFK")
//                .roles("USER");
//    }
//
//    @Bean
//    public PasswordEncoder passwordEncoder(){
//        return new BCryptPasswordEncoder(4);
//    }
//}