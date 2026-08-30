@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class DeleteBusinessMembership200Response(
    @field:JsonProperty("deleted_members")
    val deletedMembers: kotlin.collections.List<kotlin.String>? = null,

)
