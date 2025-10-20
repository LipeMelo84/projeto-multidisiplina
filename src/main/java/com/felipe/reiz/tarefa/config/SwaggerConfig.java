package com.felipe.reiz.tarefa.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SwaggerConfig {

    @Bean
    public OpenAPI customOpenAPI() {
        return new OpenAPI()
            .info(new Info()
                .title("API - Sistema de Agendamento Médico")
                .version("1.0.0")
                .description("Documentação gerada automaticamente pelo Swagger OpenAPI para o projeto da clínica médica."));
    }
}
