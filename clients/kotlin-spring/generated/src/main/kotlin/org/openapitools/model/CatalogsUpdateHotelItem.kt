package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonValue
import org.openapitools.model.CatalogsUpdatableHotelAttributes
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
 * Object describing an hotel item batch record
 * @param hotelId The catalog hotel item id in the merchant namespace
 * @param operation 
 * @param attributes 
 */
data class CatalogsUpdateHotelItem(

    @Schema(example = "DS0294-M", required = true, description = "The catalog hotel item id in the merchant namespace")
    @get:JsonProperty("hotel_id", required = true) val hotelId: kotlin.String,

    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("operation", required = true) val operation: CatalogsUpdateHotelItem.Operation,

    @field:Valid
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("attributes", required = true) val attributes: CatalogsUpdatableHotelAttributes
    ) {

    /**
    * 
    * Values: UPDATE
    */
    enum class Operation(@get:JsonValue val value: kotlin.String) {

        UPDATE("UPDATE");

        companion object {
            @JvmStatic
            @JsonCreator
            fun forValue(value: kotlin.String): Operation {
                return values().first{it -> it.value == value}
            }
        }
    }

}

