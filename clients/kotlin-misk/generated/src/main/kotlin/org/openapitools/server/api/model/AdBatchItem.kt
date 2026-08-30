package org.openapitools.server.api.model

import org.openapitools.server.api.model.Ad
import org.openapitools.server.api.model.PinterestLibError
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class AdBatchItem(
    val `data`: Ad? = null,
    val exceptions: PinterestLibError? = null
)
