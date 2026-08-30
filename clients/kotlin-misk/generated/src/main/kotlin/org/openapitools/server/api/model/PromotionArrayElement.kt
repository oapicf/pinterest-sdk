package org.openapitools.server.api.model

import org.openapitools.server.api.model.Exception
import org.openapitools.server.api.model.Promotion
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class PromotionArrayElement(
    val `data`: Promotion? = null,
    val exception: Exception? = null
)
