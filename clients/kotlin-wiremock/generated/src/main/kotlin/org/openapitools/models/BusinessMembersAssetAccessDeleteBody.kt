@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class BusinessMembersAssetAccessDeleteBody(
    @field:JsonProperty("accesses")
    val accesses: kotlin.collections.List<DeleteMemberAssetAccessItem>,

)
