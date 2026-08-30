package org.openapitools.server.api.model

import org.openapitools.server.api.model.CatalogsHotelProductMetadata
import org.openapitools.server.api.model.Pin
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class CatalogsHotelProduct(
    val catalogType: kotlin.String,
    val metadata: CatalogsHotelProductMetadata,
    val pin: Pin
)
