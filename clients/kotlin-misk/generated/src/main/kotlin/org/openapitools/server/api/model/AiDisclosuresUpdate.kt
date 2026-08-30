package org.openapitools.server.api.model

import org.openapitools.server.api.model.AiDisclosureItem
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class AiDisclosuresUpdate(
    /** List of AI disclosure declarations the creator has made about this Pin. */
    val propertyValues: kotlin.collections.List<AiDisclosureItem>? = null
)
