package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonValue
import org.openapitools.model.TargetingSpecListOperation
import com.fasterxml.jackson.annotation.JsonIgnoreProperties
import com.fasterxml.jackson.annotation.JsonSubTypes
import com.fasterxml.jackson.annotation.JsonTypeInfo
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
 * 
 * @param &#x60;field&#x60; 
 * @param operation 
 * @param propertyValues 
 */
data class TargetingSpecOperationGeo(

    @Schema(required = true, description = "")
    @param:JsonProperty("field")
    @get:JsonProperty("field", required = true) override val `field`: TargetingSpecOperationGeo.`Field` = kotlin.String.GEO,

    @field:Valid
    @Schema(required = true, description = "")
    @param:JsonProperty("operation")
    @get:JsonProperty("operation", required = true) val operation: TargetingSpecListOperation,

    @Schema(required = true, description = "")
    @param:JsonProperty("values")
    @get:JsonProperty("values", required = true) val propertyValues: kotlin.collections.List<kotlin.String>
) : TargetingSpecOperations {

    /**
    * 
    * Values: GEO
    */
    enum class `Field`(@get:JsonValue val value: kotlin.String) {

        GEO("GEO");

        companion object {
            @JvmStatic
            @JsonCreator
            fun forValue(value: kotlin.String): `Field` {
                return values().firstOrNull{it -> it.value == value}
                    ?: throw IllegalArgumentException("Unexpected value '$value' for enum '&#x60;Field&#x60;'")
            }
        }
    }

}

