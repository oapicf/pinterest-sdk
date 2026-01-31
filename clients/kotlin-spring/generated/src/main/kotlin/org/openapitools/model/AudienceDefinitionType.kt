package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonValue
import javax.validation.constraints.DecimalMax
import javax.validation.constraints.DecimalMin
import javax.validation.constraints.Email
import javax.validation.constraints.Max
import javax.validation.constraints.Min
import javax.validation.constraints.NotNull
import javax.validation.constraints.Pattern
import javax.validation.constraints.Size
import javax.validation.Valid
import io.swagger.v3.oas.annotations.media.Schema

/**
 * Generated audience type to request.
 * @param scope 
 */
data class AudienceDefinitionType(

    @Schema(example = "null", description = "")
    @get:JsonProperty("scope") val scope: AudienceDefinitionType.Scope? = null
) {

    /**
    * 
    * Values: IMPRESSION_PLUS_ENGAGEMENT,ENGAGEMENT
    */
    enum class Scope(@get:JsonValue val value: kotlin.String) {

        IMPRESSION_PLUS_ENGAGEMENT("IMPRESSION_PLUS_ENGAGEMENT"),
        ENGAGEMENT("ENGAGEMENT");

        companion object {
            @JvmStatic
            @JsonCreator
            fun forValue(value: kotlin.String): Scope {
                return values().firstOrNull{it -> it.value == value}
                    ?: throw IllegalArgumentException("Unexpected value '$value' for enum 'AudienceDefinitionType'")
            }
        }
    }

}

