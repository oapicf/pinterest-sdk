@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class CatalogsHotelItemsBatch(
    @field:JsonProperty("catalog_type")
    val catalogType: kotlin.String,

    @field:JsonProperty("batch_id")
    val batchId: kotlin.String? = null,

    @field:JsonProperty("completed_time")
    val completedTime: java.time.OffsetDateTime? = null,

    @field:JsonProperty("created_time")
    val createdTime: java.time.OffsetDateTime? = null,

    @field:JsonProperty("items")
    val items: kotlin.collections.List<HotelProcessingRecord>? = null,

    @field:JsonProperty("status")
    val status: BatchOperationStatus? = null,

)
