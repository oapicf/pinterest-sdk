package org.openapitools.server.api.model

import org.openapitools.server.api.model.NonNullableCatalogsCurrency
import org.openapitools.server.api.model.ProductAvailability
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class CatalogsRetailProductMetadata(
    val availability: ProductAvailability,
    val currency: NonNullableCatalogsCurrency,
    /** The parent ID of the product. */
    val itemGroupId: kotlin.String,
    /** The user-created unique ID that represents the product. */
    val itemId: kotlin.String,
    /** The price of the product. */
    val price: java.math.BigDecimal,
    /** The discounted price of the product. */
    val salePrice: java.math.BigDecimal
)
