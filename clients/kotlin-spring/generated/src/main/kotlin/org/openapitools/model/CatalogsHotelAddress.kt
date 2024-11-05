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
 * 
 * @param addr1 Primary street address of hotel.
 * @param city City where the hotel is located.
 * @param region State, county, province, where the hotel is located.
 * @param country Country where the hotel is located.
 * @param postalCode Required for countries with a postal code system. Postal or zip code of the hotel.
 */
data class CatalogsHotelAddress(

    @Schema(example = "null", description = "Primary street address of hotel.")
    @get:JsonProperty("addr1") val addr1: kotlin.String? = null,

    @Schema(example = "null", description = "City where the hotel is located.")
    @get:JsonProperty("city") val city: kotlin.String? = null,

    @Schema(example = "null", description = "State, county, province, where the hotel is located.")
    @get:JsonProperty("region") val region: kotlin.String? = null,

    @Schema(example = "null", description = "Country where the hotel is located.")
    @get:JsonProperty("country") val country: kotlin.String? = null,

    @Schema(example = "null", description = "Required for countries with a postal code system. Postal or zip code of the hotel.")
    @get:JsonProperty("postal_code") val postalCode: kotlin.String? = null
    ) {

}

