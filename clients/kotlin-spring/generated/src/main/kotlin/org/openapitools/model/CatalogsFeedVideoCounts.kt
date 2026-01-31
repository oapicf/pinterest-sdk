package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonProperty
import javax.validation.constraints.DecimalMax
import javax.validation.constraints.DecimalMin
import javax.validation.constraints.Email
import javax.validation.constraints.Max
import javax.validation.constraints.Min
import javax.validation.constraints.NotNull
import javax.validation.constraints.Pattern
import javax.validation.constraints.Size
import javax.validation.Valid
import io.swagger.v3.oas.annotations.media.Schema

/**
 * Counts of total, ingested, and not ingested videos in the feed file. The counts may not appear early in the process.
 * @param ingestedVideos The number of videos successfully ingested from the feed file.
 * @param notIngestedVideos The number of videos that were not ingested from the feed file.
 * @param totalVideos The number of videos in the feed file.
 */
data class CatalogsFeedVideoCounts(

    @Schema(example = "null", description = "The number of videos successfully ingested from the feed file.")
    @get:JsonProperty("ingested_videos") val ingestedVideos: kotlin.Int? = null,

    @Schema(example = "null", description = "The number of videos that were not ingested from the feed file.")
    @get:JsonProperty("not_ingested_videos") val notIngestedVideos: kotlin.Int? = null,

    @Schema(example = "null", description = "The number of videos in the feed file.")
    @get:JsonProperty("total_videos") val totalVideos: kotlin.Int? = null
) {

}

