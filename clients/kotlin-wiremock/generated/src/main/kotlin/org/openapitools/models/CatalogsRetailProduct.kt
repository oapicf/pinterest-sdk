@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class CatalogsRetailProduct(
    @field:JsonProperty("catalog_type")
    val catalogType: kotlin.String,

    @field:JsonProperty("metadata")
    val metadata: CatalogsRetailProductMetadata,

    @field:JsonProperty("pin")
    val pin: Pin,

)
