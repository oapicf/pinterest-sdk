package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.DataOutputFormat
import org.openapitools.models.MetricsReportingLevel
import org.openapitools.models.ReportingColumnAsync
import scala.collection.immutable.Seq

/**
 * 
 * @param columns Metric and entity columns
 * @param level Level of the report
 * @param reportUnderscoreformat Specification for formatting report data
 */
case class AdsAnalyticsCreateAsyncRequestAllOf1(columns: Seq[ReportingColumnAsync],
                level: MetricsReportingLevel,
                reportUnderscoreformat: Option[DataOutputFormat]
                )

object AdsAnalyticsCreateAsyncRequestAllOf1 {
    /**
     * Creates the codec for converting AdsAnalyticsCreateAsyncRequestAllOf1 from and to JSON.
     */
    implicit val decoder: Decoder[AdsAnalyticsCreateAsyncRequestAllOf1] = deriveDecoder
    implicit val encoder: ObjectEncoder[AdsAnalyticsCreateAsyncRequestAllOf1] = deriveEncoder
}
