@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class LocalInventoryItemsBatchCreate(
    @field:JsonProperty("operations")
    val operations: kotlin.collections.List<LocalInventoryOperation>,

)
