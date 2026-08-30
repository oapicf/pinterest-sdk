@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class DeliveryMetricsResponseItemsItems(
    @field:JsonProperty("category")
    val category: kotlin.String? = null,

    @field:JsonProperty("definition")
    val definition: kotlin.String? = null,

    @field:JsonProperty("display_name")
    val displayName: kotlin.String? = null,

    @field:JsonProperty("name")
    val name: kotlin.String? = null,

)
