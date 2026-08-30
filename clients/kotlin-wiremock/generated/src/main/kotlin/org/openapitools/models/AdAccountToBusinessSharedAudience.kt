@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class AdAccountToBusinessSharedAudience(
    @field:JsonProperty("audience_id")
    val audienceId: kotlin.String,

    @field:JsonProperty("recipient_business_ids")
    val recipientBusinessIds: kotlin.collections.List<kotlin.String>,

    @field:JsonProperty("permissions")
    val permissions: kotlin.collections.List<Role>? = null,

)
