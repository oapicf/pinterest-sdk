package org.openapitools.model

import java.util.Objects
import com.fasterxml.jackson.annotation.JsonCreator
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonValue
import org.openapitools.model.IngestionSourceOptions
import org.openapitools.model.LookbackPeriodOptions
import org.openapitools.model.OverallStatusOptions
import org.openapitools.model.QualityComponents
import org.openapitools.model.SourcePlatformOptions
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
 * Schema for GET Conversion EQS response.
 * @param ingestionSource 
 * @param lookbackPeriod 
 * @param overallStatus 
 * @param qualityComponents 
 * @param sourcePlatform 
 */
data class EventQualityScore(

    @field:Valid
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("ingestion_source", required = true) val ingestionSource: IngestionSourceOptions,

    @field:Valid
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("lookback_period", required = true) val lookbackPeriod: LookbackPeriodOptions,

    @field:Valid
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("overall_status", required = true) val overallStatus: OverallStatusOptions,

    @field:Valid
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("quality_components", required = true) val qualityComponents: QualityComponents,

    @field:Valid
    @Schema(example = "null", required = true, description = "")
    @get:JsonProperty("source_platform", required = true) val sourcePlatform: SourcePlatformOptions
) {

}

