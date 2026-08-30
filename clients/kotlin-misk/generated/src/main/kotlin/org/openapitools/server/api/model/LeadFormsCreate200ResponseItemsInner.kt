package org.openapitools.server.api.model

import org.openapitools.server.api.model.LeadForm
import org.openapitools.server.api.model.PinterestLibBatchItemException
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class LeadFormsCreate200ResponseItemsInner(
    val `data`: LeadForm? = null,
    val exceptions: kotlin.collections.List<PinterestLibBatchItemException>? = null
)
