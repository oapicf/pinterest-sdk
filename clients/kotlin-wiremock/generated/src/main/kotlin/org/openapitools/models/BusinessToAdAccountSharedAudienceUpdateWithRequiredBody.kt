@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class BusinessToAdAccountSharedAudienceUpdateWithRequiredBody(
    @field:JsonProperty("audience_id")
    val audienceId: kotlin.String,

    @field:JsonProperty("operation_type")
    val operationType: OperationType,

    @field:JsonProperty("recipient_account_ids")
    val recipientAccountIds: kotlin.collections.List<kotlin.String>,

)
