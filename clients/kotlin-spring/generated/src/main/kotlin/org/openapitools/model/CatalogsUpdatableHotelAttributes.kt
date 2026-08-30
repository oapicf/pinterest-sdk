package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonSetter
import com.fasterxml.jackson.annotation.Nulls
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
 * @param address Hotel address
 * @param basePrice Base price of the hotel room per night followed by the ISO currency code
 * @param brand The brand to which this hotel belongs to.
 * @param category The type of property. The category can be any type of internal description desired.
 * @param customLabel0 Custom grouping of hotels
 * @param customLabel1 Custom grouping of hotels
 * @param customLabel2 Custom grouping of hotels
 * @param customLabel3 Custom grouping of hotels
 * @param customLabel4 Custom grouping of hotels
 * @param description Brief description of the hotel.
 * @param guestRatings If specified, you must provide all properties
 * @param latitude Latitude of the hotel.
 * @param link Link to the product page
 * @param longitude Longitude of the hotel.
 * @param name The hotel's name.
 * @param neighborhood A list of neighborhoods where the hotel is located
 * @param salePrice Sale price of a hotel room per night. Used to advertise discounts off the regular price of the hotel.
 */
data class CatalogsUpdatableHotelAttributes(

    @field:Valid
    @Schema(description = "Hotel address")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("address")
    @get:JsonProperty("address") val address: CatalogsHotelAddress? = null,

    @Schema(example = "100 USD", description = "Base price of the hotel room per night followed by the ISO currency code")
    @param:JsonProperty("base_price")
    @get:JsonProperty("base_price") val basePrice: kotlin.String? = null,

    @Schema(description = "The brand to which this hotel belongs to.")
    @param:JsonProperty("brand")
    @get:JsonProperty("brand") val brand: kotlin.String? = null,

    @Schema(description = "The type of property. The category can be any type of internal description desired.")
    @param:JsonProperty("category")
    @get:JsonProperty("category") val category: kotlin.String? = null,

    @Schema(description = "Custom grouping of hotels")
    @param:JsonProperty("custom_label_0")
    @get:JsonProperty("custom_label_0") val customLabel0: kotlin.String? = null,

    @Schema(description = "Custom grouping of hotels")
    @param:JsonProperty("custom_label_1")
    @get:JsonProperty("custom_label_1") val customLabel1: kotlin.String? = null,

    @Schema(description = "Custom grouping of hotels")
    @param:JsonProperty("custom_label_2")
    @get:JsonProperty("custom_label_2") val customLabel2: kotlin.String? = null,

    @Schema(description = "Custom grouping of hotels")
    @param:JsonProperty("custom_label_3")
    @get:JsonProperty("custom_label_3") val customLabel3: kotlin.String? = null,

    @Schema(description = "Custom grouping of hotels")
    @param:JsonProperty("custom_label_4")
    @get:JsonProperty("custom_label_4") val customLabel4: kotlin.String? = null,

    @Schema(description = "Brief description of the hotel.")
    @param:JsonProperty("description")
    @get:JsonProperty("description") val description: kotlin.String? = null,

    @field:Valid
    @Schema(description = "If specified, you must provide all properties")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("guest_ratings")
    @get:JsonProperty("guest_ratings") val guestRatings: CatalogsHotelGuestRatings? = null,

    @Schema(description = "Latitude of the hotel.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("latitude")
    @get:JsonProperty("latitude") val latitude: java.math.BigDecimal? = null,

    @Schema(description = "Link to the product page")
    @param:JsonProperty("link")
    @get:JsonProperty("link") val link: kotlin.String? = null,

    @Schema(description = "Longitude of the hotel.")
    @param:JsonProperty("longitude")
    @get:JsonProperty("longitude") val longitude: java.math.BigDecimal? = null,

    @Schema(description = "The hotel's name.")
    @param:JsonProperty("name")
    @get:JsonProperty("name") val name: kotlin.String? = null,

    @Schema(description = "A list of neighborhoods where the hotel is located")
    @param:JsonProperty("neighborhood")
    @get:JsonProperty("neighborhood") val neighborhood: kotlin.collections.List<kotlin.String>? = null,

    @Schema(example = "90 USD", description = "Sale price of a hotel room per night. Used to advertise discounts off the regular price of the hotel.")
    @param:JsonProperty("sale_price")
    @get:JsonProperty("sale_price") val salePrice: kotlin.String? = null
) {

}

