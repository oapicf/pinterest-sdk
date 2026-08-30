@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class CustomerSegment(
    @field:JsonProperty("audience_ids")
    val audienceIds: kotlin.collections.List<kotlin.String>,

    @field:JsonProperty("name")
    val name: kotlin.String,

    @field:JsonProperty("ad_account_id")
    val adAccountId: kotlin.String? = null,

    @field:JsonProperty("created_time")
    val createdTime: kotlin.Int? = null,

    @field:JsonProperty("id")
    val id: kotlin.String? = null,

    @field:JsonProperty("status")
    val status: TargetingTemplateStatus? = null,

    @field:JsonProperty("updated_time")
    val updatedTime: kotlin.Int? = null,

)
