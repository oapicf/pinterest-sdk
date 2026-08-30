package org.openapitools.server.api.model

import org.openapitools.server.api.model.AdAccount
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class AdAccountsList200Response(
    val items: kotlin.collections.List<AdAccount>,
    val bookmark: kotlin.String? = null
)
