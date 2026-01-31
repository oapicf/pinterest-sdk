package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonValue
import org.openapitools.model.TargetingSpecShoppingRetargeting
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
data class TargetingSpecOperationShoppingRetargeting(

    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("field", required = true) val `field`: TargetingSpecOperationShoppingRetargeting.`Field`,

    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("operation", required = true) val operation: TargetingSpecOperationShoppingRetargeting.Operation,

    @field:Valid
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("values", required = true) val propertyValues: kotlin.collections.List<TargetingSpecShoppingRetargeting>?
) {

    /**
    * 
    * Values: SHOPPING_RETARGETING
    */
    enum class `Field`(@get:JsonValue val value: kotlin.String) {

        SHOPPING_RETARGETING("SHOPPING_RETARGETING");

        companion object {
            @JvmStatic
            @JsonCreator
            fun forValue(value: kotlin.String): `Field` {
                return values().firstOrNull{it -> it.value == value}
                    ?: throw IllegalArgumentException("Unexpected value '$value' for enum 'TargetingSpecOperationShoppingRetargeting'")
            }
        }
    }

    /**
    * 
    * Values: SET
    */
    enum class Operation(@get:JsonValue val value: kotlin.String) {

        SET("SET");

        companion object {
            @JvmStatic
            @JsonCreator
            fun forValue(value: kotlin.String): Operation {
                return values().firstOrNull{it -> it.value == value}
                    ?: throw IllegalArgumentException("Unexpected value '$value' for enum 'TargetingSpecOperationShoppingRetargeting'")
            }
        }
    }

}

