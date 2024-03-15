package org.openapitools.model

import java.util.Objects
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
 * A hotel item to be deleted
 * @param hotelId The catalog hotel id in the merchant namespace
 * @param operation 
 */
data class CatalogsDeleteHotelItem(

    @Schema(example = "DS0294-M", required = true, description = "The catalog hotel id in the merchant namespace")
    @get:JsonProperty("hotel_id", required = true) val hotelId: kotlin.String,

    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("operation", required = true) val operation: CatalogsDeleteHotelItem.Operation
) {

    /**
    * 
    * Values: DELETE
    */
    enum class Operation(val value: kotlin.String) {

        @JsonProperty("DELETE") DELETE("DELETE")
    }

}

