package org.openapitools.server.api.model

import org.openapitools.server.api.model.Keyword
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class KeywordError(
    val `data`: Keyword? = null,
    val errorMessages: kotlin.collections.List<kotlin.String>? = null
)
