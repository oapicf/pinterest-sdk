@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class AdAccountsAudience(
    @field:JsonProperty("id")
    val id: kotlin.String,

    @field:JsonProperty("ad_account_id")
    val adAccountId: kotlin.String? = null,

    @field:JsonProperty("audience_type")
    val audienceType: AudienceType? = null,

    @field:JsonProperty("created_by_company_name")
    val createdByCompanyName: kotlin.String? = null,

    @field:JsonProperty("created_timestamp")
    val createdTimestamp: kotlin.Int? = null,

    @field:JsonProperty("description")
    val description: kotlin.String? = null,

    @field:JsonProperty("is_nca")
    val isNca: kotlin.Boolean? = null,

    @field:JsonProperty("name")
    val name: kotlin.String? = null,

    @field:JsonProperty("rule")
    val rule: AdAccountsAudienceRule? = null,

    @field:JsonProperty("size")
    val propertySize: kotlin.Int? = null,

    @field:JsonProperty("status")
    val status: AudienceStatus? = null,

    @field:JsonProperty("type")
    val type: kotlin.String? = null,

    @field:JsonProperty("updated_timestamp")
    val updatedTimestamp: kotlin.Int? = null,

)
