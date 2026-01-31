package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.IngestionSourceOptions
import org.openapitools.models.LookbackPeriodOptions
import org.openapitools.models.OverallStatusOptions
import org.openapitools.models.QualityComponents
import org.openapitools.models.SourcePlatformOptions

/**
 * Schema for GET Conversion EQS response.
 * @param ingestionUnderscoresource 
 * @param lookbackUnderscoreperiod 
 * @param overallUnderscorestatus 
 * @param qualityUnderscorecomponents 
 * @param sourceUnderscoreplatform 
 */
case class EventQualityScore(ingestionUnderscoresource: IngestionSourceOptions,
                lookbackUnderscoreperiod: LookbackPeriodOptions,
                overallUnderscorestatus: OverallStatusOptions,
                qualityUnderscorecomponents: QualityComponents,
                sourceUnderscoreplatform: SourcePlatformOptions
                )

object EventQualityScore {
    /**
     * Creates the codec for converting EventQualityScore from and to JSON.
     */
    implicit val decoder: Decoder[EventQualityScore] = deriveDecoder
    implicit val encoder: ObjectEncoder[EventQualityScore] = deriveEncoder
}
