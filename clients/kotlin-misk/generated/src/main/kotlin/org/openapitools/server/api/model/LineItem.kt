package org.openapitools.server.api.model

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class LineItem(
    /** Product brand. For example, &#39;Parker&#39;. */
    val productBrand: kotlin.String? = null,
    /** Product category. For example, &#39;Shoes&#39;. */
    val productCategory: kotlin.String? = null,
    /** Product ID. For example, 1414. */
    val productId: kotlin.Int? = null,
    /** Product name. For example, &#39;Parker Boots&#39;. */
    val productName: kotlin.String? = null,
    /** Product price. For example, &#39;99.99&#39;. */
    val productPrice: kotlin.String? = null,
    /** Product quantity. For example, 2. */
    val productQuantity: kotlin.Int? = null,
    /** Product variant. For example, &#39;Red&#39;. */
    val productVariant: kotlin.String? = null,
    /** Product variant ID. For example, &#39;1414-34832&#39;. */
    val productVariantId: kotlin.String? = null
)
