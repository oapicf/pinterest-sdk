@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class BusinessToBusinessSharedAudienceUpdateWithRequiredBody(
    @field:JsonProperty("audience_id")
    val audienceId: kotlin.String,

    @field:JsonProperty("operation_type")
    val operationType: OperationType,

    @field:JsonProperty("recipient_business_ids")
    val recipientBusinessIds: kotlin.collections.List<kotlin.String>,

)
