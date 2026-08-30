@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class CatalogsFeedVideoCounts(
    @field:JsonProperty("ingested_videos")
    val ingestedVideos: kotlin.Int? = null,

    @field:JsonProperty("not_ingested_videos")
    val notIngestedVideos: kotlin.Int? = null,

    @field:JsonProperty("total_videos")
    val totalVideos: kotlin.Int? = null,

)
