@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class DeleteBusinessMembershipBody(
    @field:JsonProperty("members")
    val members: kotlin.collections.List<DeleteBusinessMembershipMember>,

)
