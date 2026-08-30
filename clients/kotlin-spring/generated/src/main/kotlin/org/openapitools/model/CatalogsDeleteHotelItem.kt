package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonValue
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
 * A hotel item to be deleted
 * @param hotelId The catalog hotel id in the merchant namespace
 * @param operation 
 */
data class CatalogsDeleteHotelItem(

    @Schema(example = "DS0294-M", required = true, description = "The catalog hotel id in the merchant namespace")
    @param:JsonProperty("hotel_id")
    @get:JsonProperty("hotel_id", required = true) val hotelId: kotlin.String,

    @Schema(required = true, description = "")
    @param:JsonProperty("operation")
    @get:JsonProperty("operation", required = true) override val operation: CatalogsDeleteHotelItem.Operation = kotlin.String.DELETE
) : CatalogsHotelBatchItem {

    /**
    * 
    * Values: DELETE
    */
    enum class Operation(@get:JsonValue val value: kotlin.String) {

        DELETE("DELETE");

        companion object {
            @JvmStatic
            @JsonCreator
            fun forValue(value: kotlin.String): Operation {
                return values().firstOrNull{it -> it.value == value}
                    ?: throw IllegalArgumentException("Unexpected value '$value' for enum 'Operation'")
            }
        }
    }

}

