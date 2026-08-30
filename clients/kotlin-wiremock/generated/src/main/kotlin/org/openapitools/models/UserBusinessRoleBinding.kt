@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class UserBusinessRoleBinding(
    @field:JsonProperty("assets_summary")
    val assetsSummary: BusinessMemberAssetsSummary? = null,

    @field:JsonProperty("business_roles")
    val businessRoles: kotlin.collections.List<kotlin.String>? = null,

    @field:JsonProperty("created_by_business")
    val createdByBusiness: BusinessAccessUserSummary? = null,

    @field:JsonProperty("created_by_user")
    val createdByUser: BusinessAccessUserSummary? = null,

    @field:JsonProperty("created_time")
    val createdTime: kotlin.Int? = null,

    @field:JsonProperty("id")
    val id: kotlin.String? = null,

    @field:JsonProperty("is_shared_partner")
    val isSharedPartner: kotlin.Boolean? = null,

    @field:JsonProperty("user")
    val user: BusinessAccessUserSummary? = null,

)
