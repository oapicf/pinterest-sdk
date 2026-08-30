package org.openapitools.server.api.model

import org.openapitools.server.api.model.TargetingTemplateStatus
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class CustomerSegment(
    /** Audience IDs included in the customer segment. */
    val audienceIds: kotlin.collections.List<kotlin.String>,
    /** Customer segment name. */
    val name: kotlin.String,
    /** The ID of the ad account that this customer segment belongs to. */
    val adAccountId: kotlin.String? = null,
    /** Customer segment created time. Unix timestamp in seconds. */
    val createdTime: kotlin.Int? = null,
    /** Customer segment ID. */
    val id: kotlin.String? = null,
    /** Indicates whether the customer segment is active or deleted. */
    val status: TargetingTemplateStatus? = null,
    /** Customer segment updated time. Unix timestamp in seconds. */
    val updatedTime: kotlin.Int? = null
)
