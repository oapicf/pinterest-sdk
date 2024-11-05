package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonValue
import org.openapitools.model.CatalogsHotelAttributes
import org.openapitools.model.CatalogsType
import org.openapitools.model.Pin
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
 * Object describing a hotel record
 * @param catalogType 
 * @param hotelId The catalog hotel id in the merchant namespace
 * @param pins The pins mapped to the item
 * @param attributes 
 */
data class CatalogsHotelItemResponse(

    @field:Valid
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("catalog_type", required = true) val catalogType: CatalogsType,

    @Schema(example = "DS0294-M", description = "The catalog hotel id in the merchant namespace")
    @get:JsonProperty("hotel_id") val hotelId: kotlin.String? = null,

    @field:Valid
    @get:Size(max=11)
    @Schema(example = "null", description = "The pins mapped to the item")
    @get:JsonProperty("pins") val pins: kotlin.collections.List<Pin>? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("attributes") val attributes: CatalogsHotelAttributes? = null
    ) {

}

