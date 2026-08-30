package org.openapitools.server.api.model

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class BoardSectionUpdateWithRequiredBody(
    val name: kotlin.String,
    val id: kotlin.String? = null
)
