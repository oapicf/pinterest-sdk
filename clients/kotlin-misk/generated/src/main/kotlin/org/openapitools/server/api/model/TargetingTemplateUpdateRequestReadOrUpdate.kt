package org.openapitools.server.api.model

import org.openapitools.server.api.model.AudienceUpdateOperationType
import org.openapitools.server.api.model.TargetingSpecOptimal
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class TargetingTemplateUpdateRequestReadOrUpdate(
    /** Targeting template ID */
    val id: kotlin.String,
    val operationType: AudienceUpdateOperationType,
    /** targeting profile attributes */
    val targetingAttributes: TargetingSpecOptimal? = null
)
