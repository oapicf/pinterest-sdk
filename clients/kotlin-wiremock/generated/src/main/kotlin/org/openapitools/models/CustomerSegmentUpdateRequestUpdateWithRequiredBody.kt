@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class CustomerSegmentUpdateRequestUpdateWithRequiredBody(
    @field:JsonProperty("id")
    val id: kotlin.String,

    @field:JsonProperty("operation_type")
    val operationType: AudienceUpdateOperationType,

    @field:JsonProperty("audience_ids")
    val audienceIds: kotlin.collections.List<kotlin.String>? = null,

)
