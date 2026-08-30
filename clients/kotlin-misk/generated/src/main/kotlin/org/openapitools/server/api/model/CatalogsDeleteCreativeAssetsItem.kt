package org.openapitools.server.api.model

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class CatalogsDeleteCreativeAssetsItem(
    /** The catalog creative assets id in the merchant namespace */
    val creativeAssetsId: kotlin.String,
    val operation: kotlin.String
)
