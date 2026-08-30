package org.openapitools.server.api.model

import org.openapitools.server.api.model.IneligibleProductTagErrorItem
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class IneligibleProductTagsErrorDetails(
    /** List of product tags that failed eligibility check. */
    val productTags: kotlin.collections.List<IneligibleProductTagErrorItem>
)
