package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonValue
import org.openapitools.model.NonNullableCatalogsCurrency
import org.openapitools.model.NonNullableProductAvailabilityType
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
 * Retail product metadata entity
 * @param itemId The user-created unique ID that represents the product.
 * @param itemGroupId The parent ID of the product.
 * @param availability 
 * @param price The price of the product.
 * @param salePrice The discounted price of the product.
 * @param currency 
 */
data class CatalogsRetailProductMetadata(

    @Schema(example = "DS0294-L", required = true, description = "The user-created unique ID that represents the product.")
    @get:JsonProperty("item_id", required = true) val itemId: kotlin.String,

    @Schema(example = "DS0294", required = true, description = "The parent ID of the product.")
    @get:JsonProperty("item_group_id", required = true) val itemGroupId: kotlin.String?,

    @field:Valid
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("availability", required = true) val availability: NonNullableProductAvailabilityType,

    @Schema(example = "24.99", required = true, description = "The price of the product.")
    @get:JsonProperty("price", required = true) val price: java.math.BigDecimal,

    @Schema(example = "14.99", required = true, description = "The discounted price of the product.")
    @get:JsonProperty("sale_price", required = true) val salePrice: java.math.BigDecimal?,

    @field:Valid
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("currency", required = true) val currency: NonNullableCatalogsCurrency
    ) {

}

