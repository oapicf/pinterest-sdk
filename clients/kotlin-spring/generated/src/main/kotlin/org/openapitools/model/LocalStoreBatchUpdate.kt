package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonSetter
import com.fasterxml.jackson.annotation.JsonValue
import com.fasterxml.jackson.annotation.Nulls
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
data class LocalStoreBatchUpdate(

    @get:Pattern(regexp="^\\d+$")
    @Schema(example = "1234567890", required = true, description = "The ID of the local store.")
    @param:JsonProperty("id")
    @get:JsonProperty("id", required = true) val id: kotlin.String,

    @Schema(example = "123 Johnson St", description = "Primary address line of the store.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("address_primary")
    @get:JsonProperty("address_primary") val addressPrimary: kotlin.String? = null,

    @Schema(example = "Suite 100", description = "Secondary address line of the store.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("address_secondary")
    @get:JsonProperty("address_secondary") val addressSecondary: kotlin.String? = null,

    @Schema(example = "Sunnyvale", description = "City where the store is located.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("city")
    @get:JsonProperty("city") val city: kotlin.String? = null,

    @field:Valid
    @Schema(description = "Country code where the store is located.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("country")
    @get:JsonProperty("country") val country: Country? = null,

    @Schema(example = "-30.21", description = "Geographic latitude coordinate of the store.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("latitude")
    @get:JsonProperty("latitude") val latitude: kotlin.Float? = null,

    @Schema(example = "50.45", description = "Geographic longitude coordinate of the store.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("longitude")
    @get:JsonProperty("longitude") val longitude: kotlin.Float? = null,

    @Schema(example = "Sunnyvale Store", description = "The name of the local store.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("name")
    @get:JsonProperty("name") val name: kotlin.String? = null,

    @Schema(example = "94043", description = "Postal or ZIP code of the store.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("postal_code")
    @get:JsonProperty("postal_code") val postalCode: kotlin.String? = null,

    @Schema(example = "CA", description = "State or region code where the store is located.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("region")
    @get:JsonProperty("region") val region: kotlin.String? = null,

    @Schema(example = "store_1", description = "Merchant provided code for the local store. Unique within the merchant's catalog.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("store_code")
    @get:JsonProperty("store_code") val storeCode: kotlin.String? = null
) {

}

