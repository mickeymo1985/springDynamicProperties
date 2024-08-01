// src/main/kotlin/com/example/demo/ConfigProperties.kt
package my

import org.springframework.beans.factory.annotation.Value
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class ConfigProperties {

    @Value("\${app.property}")
    lateinit var appProperty: String

    @Bean
    fun appPropertyBean(): String {
        return appProperty
    }
}
