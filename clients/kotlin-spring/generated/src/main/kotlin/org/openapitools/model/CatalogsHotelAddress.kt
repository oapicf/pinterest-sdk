package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonSetter
import com.fasterxml.jackson.annotation.Nulls
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
 * @param country Country where the hotel is located.
 * @param postalCode Required for countries with a postal code system. Postal or zip code of the hotel.
 * @param region State, county, province, where the hotel is located.
 */
data class CatalogsHotelAddress(

    @Schema(description = "Primary street address of hotel.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("addr1")
    @get:JsonProperty("addr1") val addr1: kotlin.String? = null,

    @Schema(description = "City where the hotel is located.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("city")
    @get:JsonProperty("city") val city: kotlin.String? = null,

    @Schema(description = "Country where the hotel is located.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("country")
    @get:JsonProperty("country") val country: kotlin.String? = null,

    @Schema(description = "Required for countries with a postal code system. Postal or zip code of the hotel.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("postal_code")
    @get:JsonProperty("postal_code") val postalCode: kotlin.String? = null,

    @Schema(description = "State, county, province, where the hotel is located.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("region")
    @get:JsonProperty("region") val region: kotlin.String? = null
) {

}

