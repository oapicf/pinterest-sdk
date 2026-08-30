package org.openapitools.server.api.model

import org.openapitools.server.api.model.CatalogsUpdatableCreativeAssetsAttributes
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class CatalogsUpdateCreativeAssetsItem(
    val attributes: CatalogsUpdatableCreativeAssetsAttributes,
    /** The catalog creative assets item id in the merchant namespace */
    val creativeAssetsId: kotlin.String,
    val operation: kotlin.String
)
