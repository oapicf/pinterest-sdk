package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonValue
import org.openapitools.model.Country
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
 * @param id The ID of the local store.
 * @param addressPrimary Primary address line of the store.
 * @param addressSecondary Secondary address line of the store.
 * @param city City where the store is located.
 * @param country Country code where the store is located.
 * @param latitude Geographic latitude coordinate of the store.
 * @param longitude Geographic longitude coordinate of the store.
 * @param name The name of the local store.
 * @param postalCode Postal or ZIP code of the store.
 * @param region State or region code where the store is located.
 * @param storeCode Merchant provided code for the local store. Unique within the merchant's catalog.
 */
data class LocalStoreUpdate(

    @get:Pattern(regexp="^\\d+$")
    @Schema(example = "1234567890", required = true, description = "The ID of the local store.")
    @get:JsonProperty("id", required = true) val id: kotlin.String,

    @Schema(example = "123 Johnson St", description = "Primary address line of the store.")
    @get:JsonProperty("address_primary") val addressPrimary: kotlin.String? = null,

    @Schema(example = "Suite 100", description = "Secondary address line of the store.")
    @get:JsonProperty("address_secondary") val addressSecondary: kotlin.String? = null,

    @Schema(example = "Sunnyvale", description = "City where the store is located.")
    @get:JsonProperty("city") val city: kotlin.String? = null,

    @field:Valid
    @Schema(example = "null", description = "Country code where the store is located.")
    @get:JsonProperty("country") val country: Country? = null,

    @Schema(example = "-30.21", description = "Geographic latitude coordinate of the store.")
    @get:JsonProperty("latitude") val latitude: kotlin.Float? = null,

    @Schema(example = "50.45", description = "Geographic longitude coordinate of the store.")
    @get:JsonProperty("longitude") val longitude: kotlin.Float? = null,

    @Schema(example = "Sunnyvale Store", description = "The name of the local store.")
    @get:JsonProperty("name") val name: kotlin.String? = null,

    @Schema(example = "94043", description = "Postal or ZIP code of the store.")
    @get:JsonProperty("postal_code") val postalCode: kotlin.String? = null,

    @Schema(example = "CA", description = "State or region code where the store is located.")
    @get:JsonProperty("region") val region: kotlin.String? = null,

    @Schema(example = "store_1", description = "Merchant provided code for the local store. Unique within the merchant's catalog.")
    @get:JsonProperty("store_code") val storeCode: kotlin.String? = null
) {

}

