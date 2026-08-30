package org.openapitools.server.api.model

import org.openapitools.server.api.model.OperationType
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class BusinessToBusinessSharedAudienceUpdateWithRequiredBody(
    /** Unique identifier of an audience */
    val audienceId: kotlin.String,
    val operationType: OperationType,
    /** Business IDs to share with or revoke from (request) / that received the audience (response). */
    val recipientBusinessIds: kotlin.collections.List<kotlin.String>
)
