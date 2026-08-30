package org.openapitools.server.api.model

import org.openapitools.server.api.model.BusinessMembershipMember
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class UpdateBusinessMembershipsResponse(
    /** List of members with updated business access role. */
    val items: kotlin.collections.List<BusinessMembershipMember>? = null
)
