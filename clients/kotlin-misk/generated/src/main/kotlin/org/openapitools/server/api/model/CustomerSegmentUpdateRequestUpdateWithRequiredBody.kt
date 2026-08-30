package org.openapitools.server.api.model

import org.openapitools.server.api.model.AudienceUpdateOperationType
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class CustomerSegmentUpdateRequestUpdateWithRequiredBody(
    /** Customer segment ID. */
    val id: kotlin.String,
    val operationType: AudienceUpdateOperationType,
    /** Audience IDs to update the customer segment to. Only applicable for UPDATE operations. */
    val audienceIds: kotlin.collections.List<kotlin.String>? = null
)
