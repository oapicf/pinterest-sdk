package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import org.openapitools.model.CatalogsHotelAddress
import org.openapitools.model.CatalogsHotelGuestRatings
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
 * @param name The hotel's name.
 * @param link Link to the product page
 * @param description Brief description of the hotel.
 * @param brand The brand to which this hotel belongs to.
 * @param latitude Latitude of the hotel.
 * @param longitude Longitude of the hotel.
 * @param neighborhood A list of neighborhoods where the hotel is located
 * @param address 
 * @param customLabel0 Custom grouping of hotels
 * @param customLabel1 Custom grouping of hotels
 * @param customLabel2 Custom grouping of hotels
 * @param customLabel3 Custom grouping of hotels
 * @param customLabel4 Custom grouping of hotels
 * @param category The type of property. The category can be any type of internal description desired.
 * @param basePrice Base price of the hotel room per night followed by the ISO currency code
 * @param salePrice Sale price of a hotel room per night. Used to advertise discounts off the regular price of the hotel.
 * @param guestRatings 
 */
data class CatalogsUpdatableHotelAttributes(

    @Schema(example = "null", description = "The hotel's name.")
    @get:JsonProperty("name") val name: kotlin.String? = null,

    @Schema(example = "null", description = "Link to the product page")
    @get:JsonProperty("link") val link: kotlin.String? = null,

    @Schema(example = "null", description = "Brief description of the hotel.")
    @get:JsonProperty("description") val description: kotlin.String? = null,

    @Schema(example = "null", description = "The brand to which this hotel belongs to.")
    @get:JsonProperty("brand") val brand: kotlin.String? = null,

    @Schema(example = "null", description = "Latitude of the hotel.")
    @get:JsonProperty("latitude") val latitude: java.math.BigDecimal? = null,

    @Schema(example = "null", description = "Longitude of the hotel.")
    @get:JsonProperty("longitude") val longitude: java.math.BigDecimal? = null,

    @Schema(example = "null", description = "A list of neighborhoods where the hotel is located")
    @get:JsonProperty("neighborhood") val neighborhood: kotlin.collections.List<kotlin.String>? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("address") val address: CatalogsHotelAddress? = null,

    @Schema(example = "null", description = "Custom grouping of hotels")
    @get:JsonProperty("custom_label_0") val customLabel0: kotlin.String? = null,

    @Schema(example = "null", description = "Custom grouping of hotels")
    @get:JsonProperty("custom_label_1") val customLabel1: kotlin.String? = null,

    @Schema(example = "null", description = "Custom grouping of hotels")
    @get:JsonProperty("custom_label_2") val customLabel2: kotlin.String? = null,

    @Schema(example = "null", description = "Custom grouping of hotels")
    @get:JsonProperty("custom_label_3") val customLabel3: kotlin.String? = null,

    @Schema(example = "null", description = "Custom grouping of hotels")
    @get:JsonProperty("custom_label_4") val customLabel4: kotlin.String? = null,

    @Schema(example = "null", description = "The type of property. The category can be any type of internal description desired.")
    @get:JsonProperty("category") val category: kotlin.String? = null,

    @Schema(example = "100 USD", description = "Base price of the hotel room per night followed by the ISO currency code")
    @get:JsonProperty("base_price") val basePrice: kotlin.String? = null,

    @Schema(example = "90 USD", description = "Sale price of a hotel room per night. Used to advertise discounts off the regular price of the hotel.")
    @get:JsonProperty("sale_price") val salePrice: kotlin.String? = null,

    @field:Valid
    @Schema(example = "null", description = "")
    @get:JsonProperty("guest_ratings") val guestRatings: CatalogsHotelGuestRatings? = null
    ) {

}

