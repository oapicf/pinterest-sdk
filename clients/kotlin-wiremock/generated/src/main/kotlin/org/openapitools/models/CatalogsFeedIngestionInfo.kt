@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class CatalogsFeedIngestionInfo(
    @field:JsonProperty("IN_STOCK")
    val IN_STOCK: kotlin.Int? = null,

    @field:JsonProperty("OUT_OF_STOCK")
    val OUT_OF_STOCK: kotlin.Int? = null,

    @field:JsonProperty("PREORDER")
    val PREORDER: kotlin.Int? = null,

)
