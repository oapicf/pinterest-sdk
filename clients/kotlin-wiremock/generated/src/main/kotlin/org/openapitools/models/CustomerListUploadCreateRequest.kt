@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class CustomerListUploadCreateRequest(
    @field:JsonProperty("operation")
    val operation: UserListOperationType,

    @field:JsonProperty("total_parts")
    val totalParts: kotlin.Int,

)
