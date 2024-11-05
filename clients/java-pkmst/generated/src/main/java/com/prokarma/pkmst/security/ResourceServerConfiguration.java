package com.prokarma.pkmst.security;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;
import org.springframework.security.oauth2.config.annotation.web.configuration.ResourceServerConfigurerAdapter;
import org.springframework.security.oauth2.config.annotation.web.configurers.ResourceServerSecurityConfigurer;
import org.springframework.security.oauth2.provider.error.OAuth2AccessDeniedHandler;
import org.springframework.http.HttpMethod;
/**
 * Configurer class for <code>@EnableResourceServer</code> classes. This class adjust the access
 * rules and paths that are protected by OAuth2 security. If more than one configures the same property, then the last
 * one wins. The configurers are sorted by Order before being applied.
 *
 * @author pkmst
 *
 */
@Configuration
@EnableResourceServer
public class ResourceServerConfiguration extends ResourceServerConfigurerAdapter {

    private static final String RESOURCE_ID = "my_rest_api";

    @Override
    public void configure(ResourceServerSecurityConfigurer resources) {
        resources.resourceId(RESOURCE_ID).stateless(false);
    }

    @Override
    public void configure(HttpSecurity http) throws Exception {
    //configure security for the http methods
        http.
        anonymous().disable()
        .requestMatchers().antMatchers(HttpMethod.GET, "/ad_accounts/**")
        .and().authorizeRequests()
        .antMatchers(HttpMethod.GET, "/ad_accounts/**").access("hasRole('ADMIN')")
        .and().exceptionHandling().accessDeniedHandler(new OAuth2AccessDeniedHandler());
        http.
        anonymous().disable()
        .requestMatchers().antMatchers(HttpMethod.GET, "/ad_groups/**")
        .and().authorizeRequests()
        .antMatchers(HttpMethod.GET, "/ad_groups/**").access("hasRole('ADMIN')")
        .and().exceptionHandling().accessDeniedHandler(new OAuth2AccessDeniedHandler());
        http.
        anonymous().disable()
        .requestMatchers().antMatchers(HttpMethod.GET, "/ads/**")
        .and().authorizeRequests()
        .antMatchers(HttpMethod.GET, "/ads/**").access("hasRole('ADMIN')")
        .and().exceptionHandling().accessDeniedHandler(new OAuth2AccessDeniedHandler());
        http.
        anonymous().disable()
        .requestMatchers().antMatchers(HttpMethod.GET, "/advanced_auction/**")
        .and().authorizeRequests()
        .antMatchers(HttpMethod.GET, "/advanced_auction/**").access("hasRole('ADMIN')")
        .and().exceptionHandling().accessDeniedHandler(new OAuth2AccessDeniedHandler());
        http.
        anonymous().disable()
        .requestMatchers().antMatchers(HttpMethod.GET, "/audience_insights/**")
        .and().authorizeRequests()
        .antMatchers(HttpMethod.GET, "/audience_insights/**").access("hasRole('ADMIN')")
        .and().exceptionHandling().accessDeniedHandler(new OAuth2AccessDeniedHandler());
        http.
        anonymous().disable()
        .requestMatchers().antMatchers(HttpMethod.GET, "/audience_sharing/**")
        .and().authorizeRequests()
        .antMatchers(HttpMethod.GET, "/audience_sharing/**").access("hasRole('ADMIN')")
        .and().exceptionHandling().accessDeniedHandler(new OAuth2AccessDeniedHandler());
        http.
        anonymous().disable()
        .requestMatchers().antMatchers(HttpMethod.GET, "/audiences/**")
        .and().authorizeRequests()
        .antMatchers(HttpMethod.GET, "/audiences/**").access("hasRole('ADMIN')")
        .and().exceptionHandling().accessDeniedHandler(new OAuth2AccessDeniedHandler());
        http.
        anonymous().disable()
        .requestMatchers().antMatchers(HttpMethod.GET, "/billing/**")
        .and().authorizeRequests()
        .antMatchers(HttpMethod.GET, "/billing/**").access("hasRole('ADMIN')")
        .and().exceptionHandling().accessDeniedHandler(new OAuth2AccessDeniedHandler());
        http.
        anonymous().disable()
        .requestMatchers().antMatchers(HttpMethod.GET, "/boards/**")
        .and().authorizeRequests()
        .antMatchers(HttpMethod.GET, "/boards/**").access("hasRole('ADMIN')")
        .and().exceptionHandling().accessDeniedHandler(new OAuth2AccessDeniedHandler());
        http.
        anonymous().disable()
        .requestMatchers().antMatchers(HttpMethod.GET, "/bulk/**")
        .and().authorizeRequests()
        .antMatchers(HttpMethod.GET, "/bulk/**").access("hasRole('ADMIN')")
        .and().exceptionHandling().accessDeniedHandler(new OAuth2AccessDeniedHandler());
        http.
        anonymous().disable()
        .requestMatchers().antMatchers(HttpMethod.GET, "/campaigns/**")
        .and().authorizeRequests()
        .antMatchers(HttpMethod.GET, "/campaigns/**").access("hasRole('ADMIN')")
        .and().exceptionHandling().accessDeniedHandler(new OAuth2AccessDeniedHandler());
        http.
        anonymous().disable()
        .requestMatchers().antMatchers(HttpMethod.GET, "/catalogs/**")
        .and().authorizeRequests()
        .antMatchers(HttpMethod.GET, "/catalogs/**").access("hasRole('ADMIN')")
        .and().exceptionHandling().accessDeniedHandler(new OAuth2AccessDeniedHandler());
        http.
        anonymous().disable()
        .requestMatchers().antMatchers(HttpMethod.GET, "/conversion_events/**")
        .and().authorizeRequests()
        .antMatchers(HttpMethod.GET, "/conversion_events/**").access("hasRole('ADMIN')")
        .and().exceptionHandling().accessDeniedHandler(new OAuth2AccessDeniedHandler());
        http.
        anonymous().disable()
        .requestMatchers().antMatchers(HttpMethod.GET, "/conversion_tags/**")
        .and().authorizeRequests()
        .antMatchers(HttpMethod.GET, "/conversion_tags/**").access("hasRole('ADMIN')")
        .and().exceptionHandling().accessDeniedHandler(new OAuth2AccessDeniedHandler());
        http.
        anonymous().disable()
        .requestMatchers().antMatchers(HttpMethod.GET, "/customer_lists/**")
        .and().authorizeRequests()
        .antMatchers(HttpMethod.GET, "/customer_lists/**").access("hasRole('ADMIN')")
        .and().exceptionHandling().accessDeniedHandler(new OAuth2AccessDeniedHandler());
        http.
        anonymous().disable()
        .requestMatchers().antMatchers(HttpMethod.GET, "/integrations/**")
        .and().authorizeRequests()
        .antMatchers(HttpMethod.GET, "/integrations/**").access("hasRole('ADMIN')")
        .and().exceptionHandling().accessDeniedHandler(new OAuth2AccessDeniedHandler());
        http.
        anonymous().disable()
        .requestMatchers().antMatchers(HttpMethod.GET, "/keywords/**")
        .and().authorizeRequests()
        .antMatchers(HttpMethod.GET, "/keywords/**").access("hasRole('ADMIN')")
        .and().exceptionHandling().accessDeniedHandler(new OAuth2AccessDeniedHandler());
        http.
        anonymous().disable()
        .requestMatchers().antMatchers(HttpMethod.GET, "/lead_ads/**")
        .and().authorizeRequests()
        .antMatchers(HttpMethod.GET, "/lead_ads/**").access("hasRole('ADMIN')")
        .and().exceptionHandling().accessDeniedHandler(new OAuth2AccessDeniedHandler());
        http.
        anonymous().disable()
        .requestMatchers().antMatchers(HttpMethod.GET, "/lead_forms/**")
        .and().authorizeRequests()
        .antMatchers(HttpMethod.GET, "/lead_forms/**").access("hasRole('ADMIN')")
        .and().exceptionHandling().accessDeniedHandler(new OAuth2AccessDeniedHandler());
        http.
        anonymous().disable()
        .requestMatchers().antMatchers(HttpMethod.GET, "/leads_export/**")
        .and().authorizeRequests()
        .antMatchers(HttpMethod.GET, "/leads_export/**").access("hasRole('ADMIN')")
        .and().exceptionHandling().accessDeniedHandler(new OAuth2AccessDeniedHandler());
        http.
        anonymous().disable()
        .requestMatchers().antMatchers(HttpMethod.GET, "/media/**")
        .and().authorizeRequests()
        .antMatchers(HttpMethod.GET, "/media/**").access("hasRole('ADMIN')")
        .and().exceptionHandling().accessDeniedHandler(new OAuth2AccessDeniedHandler());
        http.
        anonymous().disable()
        .requestMatchers().antMatchers(HttpMethod.GET, "/oauth/**")
        .and().authorizeRequests()
        .antMatchers(HttpMethod.GET, "/oauth/**").access("hasRole('ADMIN')")
        .and().exceptionHandling().accessDeniedHandler(new OAuth2AccessDeniedHandler());
        http.
        anonymous().disable()
        .requestMatchers().antMatchers(HttpMethod.GET, "/order_lines/**")
        .and().authorizeRequests()
        .antMatchers(HttpMethod.GET, "/order_lines/**").access("hasRole('ADMIN')")
        .and().exceptionHandling().accessDeniedHandler(new OAuth2AccessDeniedHandler());
        http.
        anonymous().disable()
        .requestMatchers().antMatchers(HttpMethod.GET, "/pins/**")
        .and().authorizeRequests()
        .antMatchers(HttpMethod.GET, "/pins/**").access("hasRole('ADMIN')")
        .and().exceptionHandling().accessDeniedHandler(new OAuth2AccessDeniedHandler());
        http.
        anonymous().disable()
        .requestMatchers().antMatchers(HttpMethod.GET, "/product_group_promotions/**")
        .and().authorizeRequests()
        .antMatchers(HttpMethod.GET, "/product_group_promotions/**").access("hasRole('ADMIN')")
        .and().exceptionHandling().accessDeniedHandler(new OAuth2AccessDeniedHandler());
        http.
        anonymous().disable()
        .requestMatchers().antMatchers(HttpMethod.GET, "/resources/**")
        .and().authorizeRequests()
        .antMatchers(HttpMethod.GET, "/resources/**").access("hasRole('ADMIN')")
        .and().exceptionHandling().accessDeniedHandler(new OAuth2AccessDeniedHandler());
        http.
        anonymous().disable()
        .requestMatchers().antMatchers(HttpMethod.GET, "/search/**")
        .and().authorizeRequests()
        .antMatchers(HttpMethod.GET, "/search/**").access("hasRole('ADMIN')")
        .and().exceptionHandling().accessDeniedHandler(new OAuth2AccessDeniedHandler());
        http.
        anonymous().disable()
        .requestMatchers().antMatchers(HttpMethod.GET, "/targeting_template/**")
        .and().authorizeRequests()
        .antMatchers(HttpMethod.GET, "/targeting_template/**").access("hasRole('ADMIN')")
        .and().exceptionHandling().accessDeniedHandler(new OAuth2AccessDeniedHandler());
        http.
        anonymous().disable()
        .requestMatchers().antMatchers(HttpMethod.GET, "/terms/**")
        .and().authorizeRequests()
        .antMatchers(HttpMethod.GET, "/terms/**").access("hasRole('ADMIN')")
        .and().exceptionHandling().accessDeniedHandler(new OAuth2AccessDeniedHandler());
        http.
        anonymous().disable()
        .requestMatchers().antMatchers(HttpMethod.GET, "/terms_of_service/**")
        .and().authorizeRequests()
        .antMatchers(HttpMethod.GET, "/terms_of_service/**").access("hasRole('ADMIN')")
        .and().exceptionHandling().accessDeniedHandler(new OAuth2AccessDeniedHandler());
        http.
        anonymous().disable()
        .requestMatchers().antMatchers(HttpMethod.GET, "/user_account/**")
        .and().authorizeRequests()
        .antMatchers(HttpMethod.GET, "/user_account/**").access("hasRole('ADMIN')")
        .and().exceptionHandling().accessDeniedHandler(new OAuth2AccessDeniedHandler());
    }

}
