package org.openapitools.server.api.model

import org.openapitools.server.api.model.OperationType
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class AdAccountToAdAccountSharedAudienceUpdateWithRequiredBody(
    /** Unique identifier of an audience */
    val audienceId: kotlin.String,
    val operationType: OperationType,
    /** Ad account IDs to share with or revoke from (request) / that received the audience (response). */
    val recipientAccountIds: kotlin.collections.List<kotlin.String>
)
