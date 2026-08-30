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
 * Store metadata for a specific store location
 * @param storeCode Merchant provided store code
 * @param storeId Internal store code
 * @param geohash Geohash of the store location
 * @param latitude Geographic latitude coordinate of the store
 * @param longitude Geographic longitude coordinate of the store
 * @param storeName Store name
 */
data class StoreMetadata(

    @Schema(example = "store_1", required = true, description = "Merchant provided store code")
    @param:JsonProperty("store_code")
    @get:JsonProperty("store_code", required = true) val storeCode: kotlin.String,

    @Schema(example = "9070947806573", required = true, description = "Internal store code")
    @param:JsonProperty("store_id")
    @get:JsonProperty("store_id", required = true) val storeId: kotlin.String,

    @Schema(example = "9q", description = "Geohash of the store location")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("geohash")
    @get:JsonProperty("geohash") val geohash: kotlin.String? = null,

    @Schema(example = "37.37695098", description = "Geographic latitude coordinate of the store")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("latitude")
    @get:JsonProperty("latitude") val latitude: kotlin.Double? = null,

    @Schema(example = "-122.032913", description = "Geographic longitude coordinate of the store")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("longitude")
    @get:JsonProperty("longitude") val longitude: kotlin.Double? = null,

    @Schema(example = "Store 1 Sunnyvale", description = "Store name")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("store_name")
    @get:JsonProperty("store_name") val storeName: kotlin.String? = null
) {

}

