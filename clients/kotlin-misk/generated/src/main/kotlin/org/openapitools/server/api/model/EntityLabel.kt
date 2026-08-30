package org.openapitools.server.api.model

import org.openapitools.server.api.model.EntityLabelStatus
import org.openapitools.server.api.model.LabelParentType
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class EntityLabel(
    /** Entity ID to apply label to. */
    val entityId: kotlin.String,
    /** Label ID. */
    val labelId: kotlin.String,
    val entityType: LabelParentType? = null,
    val status: EntityLabelStatus? = null
)
