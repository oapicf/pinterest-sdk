package org.openapitools.server.api.model

import org.openapitools.server.api.model.IngestionSourceOptions
import org.openapitools.server.api.model.LookbackPeriodOptions
import org.openapitools.server.api.model.OverallStatusOptions
import org.openapitools.server.api.model.QualityComponents
import org.openapitools.server.api.model.SourcePlatformOptions
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class EventQualityScore(
    val ingestionSource: IngestionSourceOptions,
    val lookbackPeriod: LookbackPeriodOptions,
    val overallStatus: OverallStatusOptions,
    val qualityComponents: QualityComponents,
    val sourcePlatform: SourcePlatformOptions
)
