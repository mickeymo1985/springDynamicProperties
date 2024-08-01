package my

import org.springframework.beans.factory.annotation.Value
import org.springframework.stereotype.Component

@Component
class AppPropertyComponent {

    @Value("\${app.property}")
    lateinit var appProperty: String
}
