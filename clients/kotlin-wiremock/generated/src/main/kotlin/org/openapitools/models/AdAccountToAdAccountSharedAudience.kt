@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class AdAccountToAdAccountSharedAudience(
    @field:JsonProperty("audience_id")
    val audienceId: kotlin.String,

    @field:JsonProperty("recipient_account_ids")
    val recipientAccountIds: kotlin.collections.List<kotlin.String>,

    @field:JsonProperty("permissions")
    val permissions: kotlin.collections.List<Role>? = null,

)
