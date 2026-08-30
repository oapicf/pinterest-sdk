package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonSetter
import com.fasterxml.jackson.annotation.Nulls
import org.openapitools.model.CartingRetailer
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
 * @param cartingProductId the internal Pinterest carting product id (different from industry product id)
 * @param displayPreferredRetailersOnly Whether to display only the preferred retailers for the carting product
 * @param displayProductPrice Whether to display the price for the carting product
 * @param preferredRetailers A sorted array of preferred retailers for the carting product
 * @param randomizePreferredRetailers Whether to randomize preferred retailers for the carting product
 */
data class CartingProduct(

    @get:Pattern(regexp="^\\d+$")
    @Schema(required = true, description = "the internal Pinterest carting product id (different from industry product id)")
    @param:JsonProperty("carting_product_id")
    @get:JsonProperty("carting_product_id", required = true) val cartingProductId: kotlin.String,

    @Schema(description = "Whether to display only the preferred retailers for the carting product")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("display_preferred_retailers_only")
    @get:JsonProperty("display_preferred_retailers_only") val displayPreferredRetailersOnly: kotlin.Boolean? = null,

    @Schema(description = "Whether to display the price for the carting product")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("display_product_price")
    @get:JsonProperty("display_product_price") val displayProductPrice: kotlin.Boolean? = null,

    @field:Valid
    @Schema(description = "A sorted array of preferred retailers for the carting product")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("preferred_retailers")
    @get:JsonProperty("preferred_retailers") val preferredRetailers: kotlin.collections.List<CartingRetailer>? = null,

    @Schema(description = "Whether to randomize preferred retailers for the carting product")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("randomize_preferred_retailers")
    @get:JsonProperty("randomize_preferred_retailers") val randomizePreferredRetailers: kotlin.Boolean? = null
) {

}

