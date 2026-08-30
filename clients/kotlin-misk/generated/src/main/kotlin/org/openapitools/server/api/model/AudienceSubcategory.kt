package org.openapitools.server.api.model

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class AudienceSubcategory(
    val id: kotlin.String? = null,
    val index: java.math.BigDecimal? = null,
    val key: kotlin.String? = null,
    val name: kotlin.String? = null,
    val ratio: java.math.BigDecimal? = null
)
