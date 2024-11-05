package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
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
 * Hotel product metadata entity
 * @param hotelId The user-created unique ID that represents the hotel item.
 */
data class CatalogsHotelProductMetadata(

    @Schema(example = "123abc", required = true, description = "The user-created unique ID that represents the hotel item.")
    @get:JsonProperty("hotel_id", required = true) val hotelId: kotlin.String
    ) {

}

