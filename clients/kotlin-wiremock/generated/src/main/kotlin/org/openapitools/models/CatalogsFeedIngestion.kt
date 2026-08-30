@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class CatalogsFeedIngestion(
    @field:JsonProperty("created_at")
    val createdAt: java.time.OffsetDateTime,

    @field:JsonProperty("feed_id")
    val feedId: kotlin.String,

    @field:JsonProperty("id")
    val id: kotlin.String,

    @field:JsonProperty("status")
    val status: CatalogsFeedProcessingStatus,

)
