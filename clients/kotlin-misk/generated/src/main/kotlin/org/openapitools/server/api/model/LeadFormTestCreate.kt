package org.openapitools.server.api.model

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class LeadFormTestCreate(
    /** Test lead answers. Should follow the creation order. */
    val answers: kotlin.collections.List<kotlin.String>
)
