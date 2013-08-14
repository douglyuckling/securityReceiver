package securityreceiver.config

import org.codehaus.jackson.JsonParser
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.ComponentScan
import org.springframework.context.annotation.Configuration
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer
import org.springframework.http.converter.HttpMessageConverter
import org.springframework.http.converter.json.MappingJacksonHttpMessageConverter
import org.springframework.web.servlet.ViewResolver
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport
import org.springframework.web.servlet.view.InternalResourceViewResolver

@Configuration
@ComponentScan('securityreceiver.web.controller')
class DispatcherServletConfig extends WebMvcConfigurationSupport {

    @Bean
    static PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer() {
        return new PropertySourcesPlaceholderConfigurer()
    }

    // Servlet configuration and servlet-scoped beans go here...

    @Override
    void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler('/extjs/**').addResourceLocations('/extjs/')
        registry.addResourceHandler('/**/*.js').addResourceLocations('/')
        registry.addResourceHandler('/**/*.png').addResourceLocations('/')
    }

    @Override
    protected void configureMessageConverters(List<HttpMessageConverter<?>> converters) {
        def jacksonConverter = new MappingJacksonHttpMessageConverter()
        jacksonConverter.objectMapper.configure(JsonParser.Feature.ALLOW_UNQUOTED_FIELD_NAMES, true);
        jacksonConverter.objectMapper.configure(JsonParser.Feature.ALLOW_SINGLE_QUOTES, true);
        converters.add(jacksonConverter)
        super.configureMessageConverters(converters)
    }

    @Bean
    ViewResolver viewResolver() {
        InternalResourceViewResolver viewResolver = new InternalResourceViewResolver()
        viewResolver.setPrefix('/WEB-INF/jsp/')
        viewResolver.setSuffix('.jsp')
        return viewResolver
    }

}
