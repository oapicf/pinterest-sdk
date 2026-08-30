package org.openapitools.server.api.model

import org.openapitools.server.api.model.AdGroupsCreate200ResponseItemsInner
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class AdGroupsCreate200Response(
    val items: kotlin.collections.List<AdGroupsCreate200ResponseItemsInner>
)
