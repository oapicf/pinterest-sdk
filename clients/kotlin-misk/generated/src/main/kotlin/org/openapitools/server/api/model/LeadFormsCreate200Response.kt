package org.openapitools.server.api.model

import org.openapitools.server.api.model.LeadFormsCreate200ResponseItemsInner
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class LeadFormsCreate200Response(
    val items: kotlin.collections.List<LeadFormsCreate200ResponseItemsInner>
)
