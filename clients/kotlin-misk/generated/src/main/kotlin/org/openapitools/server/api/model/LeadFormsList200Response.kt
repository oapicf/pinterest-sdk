package org.openapitools.server.api.model

import org.openapitools.server.api.model.LeadForm
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class LeadFormsList200Response(
    val items: kotlin.collections.List<LeadForm>,
    val bookmark: kotlin.String? = null
)
