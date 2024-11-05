package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonValue
import org.openapitools.model.CatalogsFeedIngestionDetails
import org.openapitools.model.CatalogsFeedProcessingStatus
import org.openapitools.model.CatalogsFeedProductCounts
import org.openapitools.model.CatalogsFeedValidationDetails
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
 * @param id 
 * @param updatedAt 
 * @param ingestionDetails 
 * @param status 
 * @param productCounts 
 * @param validationDetails 
 */
data class CatalogsFeedProcessingResult(

    @Schema(example = "2022-03-14T15:15:22Z", required = true, description = "")
    @get:JsonProperty("created_at", required = true) val createdAt: java.time.OffsetDateTime,

    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("id", required = true) val id: kotlin.String,

    @Schema(example = "2022-03-14T15:16:34Z", required = true, description = "")
    @get:JsonProperty("updated_at", required = true) val updatedAt: java.time.OffsetDateTime,

    @field:Valid
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("ingestion_details", required = true) val ingestionDetails: CatalogsFeedIngestionDetails,

    @field:Valid
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("status", required = true) val status: CatalogsFeedProcessingStatus,

    @field:Valid
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("product_counts", required = true) val productCounts: CatalogsFeedProductCounts?,

    @field:Valid
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("validation_details", required = true) val validationDetails: CatalogsFeedValidationDetails
    ) {

}

