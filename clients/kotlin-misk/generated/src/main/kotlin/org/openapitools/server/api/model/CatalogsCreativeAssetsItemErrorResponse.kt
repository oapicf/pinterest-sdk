package org.openapitools.server.api.model

import org.openapitools.server.api.model.ItemValidationEvent
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class CatalogsCreativeAssetsItemErrorResponse(
    val catalogType: kotlin.String,
    /** Array with the errors for the item id requested */
    val errors: kotlin.collections.List<ItemValidationEvent>,
    /** Discriminator literal identifying this leaf inside an &#x60;ItemResponse&#x60; payload. */
    val itemResponseKind: kotlin.String,
    /** The catalog creative assets id in the merchant namespace */
    val creativeAssetsId: kotlin.String? = null
)
