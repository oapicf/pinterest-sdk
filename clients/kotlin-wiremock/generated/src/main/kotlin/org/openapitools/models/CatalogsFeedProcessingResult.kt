@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class CatalogsFeedProcessingResult(
    @field:JsonProperty("created_at")
    val createdAt: java.time.OffsetDateTime,

    @field:JsonProperty("id")
    val id: kotlin.String,

    @field:JsonProperty("ingestion_details")
    val ingestionDetails: CatalogsFeedIngestionDetails,

    @field:JsonProperty("product_counts")
    val productCounts: CatalogsFeedProductCounts,

    @field:JsonProperty("status")
    val status: CatalogsFeedProcessingStatus,

    @field:JsonProperty("updated_at")
    val updatedAt: java.time.OffsetDateTime,

    @field:JsonProperty("validation_details")
    val validationDetails: CatalogsFeedValidationDetails,

    @field:JsonProperty("video_counts")
    val videoCounts: CatalogsFeedVideoCounts? = null,

)
