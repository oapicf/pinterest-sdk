package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonInclude
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonSetter
import com.fasterxml.jackson.annotation.Nulls
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

    @Schema(description = "The number of videos successfully ingested from the feed file.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("ingested_videos")
    @get:JsonProperty("ingested_videos") val ingestedVideos: kotlin.Int? = null,

    @Schema(description = "The number of videos that were not ingested from the feed file.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("not_ingested_videos")
    @get:JsonProperty("not_ingested_videos") val notIngestedVideos: kotlin.Int? = null,

    @Schema(description = "The number of videos in the feed file.")
    @field:JsonInclude(JsonInclude.Include.NON_NULL)
    @field:JsonSetter(nulls = Nulls.SKIP)
    @param:JsonProperty("total_videos")
    @get:JsonProperty("total_videos") val totalVideos: kotlin.Int? = null
) {

}

