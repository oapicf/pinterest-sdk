@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class DeleteMemberAccessResultsResponseArray(
    @field:JsonProperty("items")
    val items: kotlin.collections.List<DeleteMemberAccessResult>? = null,

)
