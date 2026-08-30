package org.openapitools.server.api.model

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class DeleteBusinessPartners(
    val deletedPartners: kotlin.collections.List<kotlin.String>? = null
)
