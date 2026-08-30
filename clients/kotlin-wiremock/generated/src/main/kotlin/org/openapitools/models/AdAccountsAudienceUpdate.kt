@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class AdAccountsAudienceUpdate(
    @field:JsonProperty("ad_account_id")
    val adAccountId: kotlin.String? = null,

    @field:JsonProperty("audience_type")
    val audienceType: AudienceType? = null,

    @field:JsonProperty("description")
    val description: kotlin.String? = null,

    @field:JsonProperty("name")
    val name: kotlin.String? = null,

    @field:JsonProperty("operation_type")
    val operationType: AudienceUpdateOperationType? = null,

    @field:JsonProperty("rule")
    val rule: AdAccountsAudienceRule? = null,

)
