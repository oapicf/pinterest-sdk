package org.openapitools.server.api.model

import org.openapitools.server.api.model.BusinessRoleForMembers
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class DeleteBusinessMembershipMember(
    val businessRole: BusinessRoleForMembers,
    /** Unique identifier of the member */
    val memberId: kotlin.String
)
