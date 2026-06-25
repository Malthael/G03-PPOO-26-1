package com.example.tuto002.config;

//Clase de configuración



import io.swagger.v3.oas.models.ExternalDocumentation;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.servers.Server;

@Configuration
public class OpenApiConfig {
    @Bean
    public OpenAPI customOpenAPI() {
        return new OpenAPI()
        .info(new Info()
                .title("Configuración de Api :)")
                .version("1.1.13")
                .description("Aplicación de POO I")
                .contact(new Contact()
                        .name("Diego Burgos")
                        .email("daburgosr@ut.edu.co")
                )


        )
                //Info adicional
                .addServersItem(new Server()
                        .url("http://localhost:8080")
                        .description("Servidor Local de Desarrollo")
                )
                .externalDocs(new ExternalDocumentation()
                        .description("Wiki del Proyecto de POO I (Aún no lo he subido al github XD")
                        .url("https://github.com/Malthael/")
                );

    }
}
