package org.openapitools.server.api.model

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class CatalogsFeedVideoCounts(
    /** The number of videos successfully ingested from the feed file. */
    val ingestedVideos: kotlin.Int? = null,
    /** The number of videos that were not ingested from the feed file. */
    val notIngestedVideos: kotlin.Int? = null,
    /** The number of videos in the feed file. */
    val totalVideos: kotlin.Int? = null
)
