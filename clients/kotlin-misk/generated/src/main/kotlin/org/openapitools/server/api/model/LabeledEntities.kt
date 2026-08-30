package org.openapitools.server.api.model

import org.openapitools.server.api.model.EntityLabel
import org.openapitools.server.api.model.EntityLabelError
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class LabeledEntities(
    val entitiesLabels: kotlin.collections.List<EntityLabel>? = null,
    /** Labels that were not successfully applied. */
    val errors: kotlin.collections.List<EntityLabelError>? = null
)
