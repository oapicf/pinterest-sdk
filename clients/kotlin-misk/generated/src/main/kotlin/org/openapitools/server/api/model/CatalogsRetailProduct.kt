package org.openapitools.server.api.model

import org.openapitools.server.api.model.CatalogsRetailProductMetadata
import org.openapitools.server.api.model.Pin
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class CatalogsRetailProduct(
    val catalogType: kotlin.String,
    val metadata: CatalogsRetailProductMetadata,
    val pin: Pin
)
