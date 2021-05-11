package br.uniso.securityapi.security;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;

@Configuration
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    protected void configure(AuthenticationManagerBuilder auth) throws Exception{
        auth.inMemoryAuthentication().withUser("admin")
                .password("{noop}admin").roles("USER");
    }

    protected void configure(HttpSecurity http) throws Exception{
        http.csrf().disable().authorizeRequests()
                .antMatchers("/alunos").authenticated()
                .antMatchers("/profes").permitAll()
                 .and().httpBasic().and().sessionManagement().
                sessionCreationPolicy(SessionCreationPolicy.STATELESS).
                and().logout().deleteCookies("JSESSIONID");


    }
}
