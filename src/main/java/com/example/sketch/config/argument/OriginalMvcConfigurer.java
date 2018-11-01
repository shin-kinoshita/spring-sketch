package com.example.sketch.config.argument;

import com.example.sketch.request.argument.original.OriginalObjectArgumentResolver;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.method.support.HandlerMethodArgumentResolver;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.util.List;

/**
 * @author subaru
 */
@Configuration
public class OriginalMvcConfigurer implements WebMvcConfigurer {

    @Override
    public void addArgumentResolvers(List<HandlerMethodArgumentResolver> resolvers) {
        resolvers.add(new OriginalObjectArgumentResolver());
    }
}
