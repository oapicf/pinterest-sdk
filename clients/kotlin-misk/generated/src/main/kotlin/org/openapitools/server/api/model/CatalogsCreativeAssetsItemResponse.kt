package org.openapitools.server.api.model

import org.openapitools.server.api.model.CatalogsCreativeAssetsAttributes
import org.openapitools.server.api.model.Pin
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class CatalogsCreativeAssetsItemResponse(
    val catalogType: kotlin.String,
    /** Discriminator literal identifying this leaf inside an &#x60;ItemResponse&#x60; payload. */
    val itemResponseKind: kotlin.String,
    val attributes: CatalogsCreativeAssetsAttributes? = null,
    /** The catalog creative assets id in the merchant namespace */
    val creativeAssetsId: kotlin.String? = null,
    /** The pins mapped to the item */
    val pins: kotlin.collections.List<Pin>? = null
)
