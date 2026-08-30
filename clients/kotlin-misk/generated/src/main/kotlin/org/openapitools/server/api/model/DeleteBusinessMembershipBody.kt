package org.openapitools.server.api.model

import org.openapitools.server.api.model.DeleteBusinessMembershipMember
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class DeleteBusinessMembershipBody(
    val members: kotlin.collections.List<DeleteBusinessMembershipMember>
)
