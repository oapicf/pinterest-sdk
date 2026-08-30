package org.openapitools.server.api.model

import org.openapitools.server.api.model.AdGroup
import org.openapitools.server.api.model.PinterestLibBatchItemException
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class AdGroupsCreate200ResponseItemsInner(
    val `data`: AdGroup? = null,
    val exceptions: kotlin.collections.List<PinterestLibBatchItemException>? = null
)
