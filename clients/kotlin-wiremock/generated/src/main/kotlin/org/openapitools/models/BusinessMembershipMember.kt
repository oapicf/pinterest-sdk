@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class BusinessMembershipMember(
    @field:JsonProperty("business_role")
    val businessRole: BusinessRoleForMembers,

    @field:JsonProperty("member_id")
    val memberId: kotlin.String,

)
