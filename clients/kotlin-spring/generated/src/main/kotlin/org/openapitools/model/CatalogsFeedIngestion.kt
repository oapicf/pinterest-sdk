package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonValue
import org.openapitools.model.CatalogsFeedProcessingStatus
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
 * 
 * @param createdAt Timestamp of the feed ingestion.
 * @param feedId Catalog Feed id pertaining to the feed ingestion.
 * @param id Unique identifier of a feed ingestion.
 * @param status Status of the feed ingestion.
 */
data class CatalogsFeedIngestion(

    @Schema(example = "2022-03-14T15:15:22Z", required = true, description = "Timestamp of the feed ingestion.")
    @param:JsonProperty("created_at")
    @get:JsonProperty("created_at", required = true) val createdAt: java.time.OffsetDateTime,

    @get:Pattern(regexp="^\\d+$")
    @Schema(example = "2680059592705", required = true, description = "Catalog Feed id pertaining to the feed ingestion.")
    @param:JsonProperty("feed_id")
    @get:JsonProperty("feed_id", required = true) val feedId: kotlin.String,

    @get:Pattern(regexp="^\\d+$")
    @Schema(example = "2680059592705", required = true, description = "Unique identifier of a feed ingestion.")
    @param:JsonProperty("id")
    @get:JsonProperty("id", required = true) val id: kotlin.String,

    @field:Valid
    @Schema(required = true, description = "Status of the feed ingestion.")
    @param:JsonProperty("status")
    @get:JsonProperty("status", required = true) val status: CatalogsFeedProcessingStatus
) {

}

