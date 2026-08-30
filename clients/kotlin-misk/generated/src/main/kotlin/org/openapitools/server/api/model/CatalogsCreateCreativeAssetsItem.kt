package org.openapitools.server.api.model

import org.openapitools.server.api.model.CatalogsCreativeAssetsAttributes
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class CatalogsCreateCreativeAssetsItem(
    val attributes: CatalogsCreativeAssetsAttributes,
    /** The catalog creative assets id in the merchant namespace */
    val creativeAssetsId: kotlin.String,
    val operation: kotlin.String
)
