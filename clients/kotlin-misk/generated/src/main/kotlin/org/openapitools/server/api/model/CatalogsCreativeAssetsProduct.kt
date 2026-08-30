package org.openapitools.server.api.model

import org.openapitools.server.api.model.CatalogsCreativeAssetsProductMetadata
import org.openapitools.server.api.model.Pin
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class CatalogsCreativeAssetsProduct(
    val catalogType: kotlin.String,
    val metadata: CatalogsCreativeAssetsProductMetadata,
    val pin: Pin
)
