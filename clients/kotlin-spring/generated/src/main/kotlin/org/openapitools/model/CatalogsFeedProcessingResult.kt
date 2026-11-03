package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonValue
import org.openapitools.model.CatalogsFeedIngestionDetails
import org.openapitools.model.CatalogsFeedProcessingStatus
import org.openapitools.model.CatalogsFeedProductCounts
import org.openapitools.model.CatalogsFeedValidationDetails
import org.openapitools.model.CatalogsFeedVideoCounts
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
 * @param createdAt 
 * @param id ID of the feed processing result.
 * @param ingestionDetails 
 * @param productCounts 
 * @param status 
 * @param updatedAt 
 * @param validationDetails 
 * @param videoCounts 
 */
data class CatalogsFeedProcessingResult(

    @Schema(example = "2022-03-14T15:15:22Z", required = true, readOnly = true, description = "")
    @param:JsonProperty("created_at", required = true)
    @get:JsonProperty("created_at", required = true) val createdAt: java.time.OffsetDateTime,

    @get:Pattern(regexp="^\\d+$")
    @Schema(example = "864344156814050986", required = true, description = "ID of the feed processing result.")
    @param:JsonProperty("id", required = true)
    @get:JsonProperty("id", required = true) val id: kotlin.String,

    @field:Valid
    @Schema(required = true, description = "")
    @param:JsonProperty("ingestion_details", required = true)
    @get:JsonProperty("ingestion_details", required = true) val ingestionDetails: CatalogsFeedIngestionDetails,

    @field:Valid
    @Schema(required = true, description = "")
    @param:JsonProperty("product_counts", required = true)
    @get:JsonProperty("product_counts", required = true) val productCounts: CatalogsFeedProductCounts?,

    @field:Valid
    @Schema(required = true, description = "")
    @param:JsonProperty("status", required = true)
    @get:JsonProperty("status", required = true) val status: CatalogsFeedProcessingStatus,

    @Schema(example = "2022-03-14T15:16:34Z", required = true, readOnly = true, description = "")
    @param:JsonProperty("updated_at", required = true)
    @get:JsonProperty("updated_at", required = true) val updatedAt: java.time.OffsetDateTime,

    @field:Valid
    @Schema(required = true, description = "")
    @param:JsonProperty("validation_details", required = true)
    @get:JsonProperty("validation_details", required = true) val validationDetails: CatalogsFeedValidationDetails,

    @field:Valid
    @Schema(description = "")
    @param:JsonProperty("video_counts")
    @get:JsonProperty("video_counts") val videoCounts: CatalogsFeedVideoCounts? = null
) {

}

