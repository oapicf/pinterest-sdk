@file:Suppress(
    "RemoveRedundantQualifierName",
    "unused",
)

package org.openapitools.models

import com.fasterxml.jackson.annotation.JsonProperty

data class EventQualityScore(
    @field:JsonProperty("ingestion_source")
    val ingestionSource: IngestionSourceOptions,

    @field:JsonProperty("lookback_period")
    val lookbackPeriod: LookbackPeriodOptions,

    @field:JsonProperty("overall_status")
    val overallStatus: OverallStatusOptions,

    @field:JsonProperty("quality_components")
    val qualityComponents: QualityComponents,

    @field:JsonProperty("source_platform")
    val sourcePlatform: SourcePlatformOptions,

)
