package org.openapitools.server.api.model

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class LabeledEntitiesCreate(
    /** Entity IDs to apply label to. */
    val entityIds: kotlin.collections.List<kotlin.String>
)
