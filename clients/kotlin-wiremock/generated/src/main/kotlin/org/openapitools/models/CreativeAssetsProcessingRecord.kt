@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class CreativeAssetsProcessingRecord(
    @field:JsonProperty("creative_assets_id")
    val creativeAssetsId: kotlin.String? = null,

    @field:JsonProperty("errors")
    val errors: kotlin.collections.List<ItemValidationEvent>? = null,

    @field:JsonProperty("status")
    val status: ItemProcessingStatus? = null,

    @field:JsonProperty("warnings")
    val warnings: kotlin.collections.List<ItemValidationEvent>? = null,

)
