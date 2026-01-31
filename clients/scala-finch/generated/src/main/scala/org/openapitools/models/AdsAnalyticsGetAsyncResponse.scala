package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.BigDecimal
import org.openapitools.models.BulkReportingJobStatus

/**
 * 
 * @param reportUnderscorestatus 
 * @param size 
 * @param url 
 */
case class AdsAnalyticsGetAsyncResponse(reportUnderscorestatus: Option[BulkReportingJobStatus],
                size: Option[BigDecimal],
                url: Option[String]
                )

object AdsAnalyticsGetAsyncResponse {
    /**
     * Creates the codec for converting AdsAnalyticsGetAsyncResponse from and to JSON.
     */
    implicit val decoder: Decoder[AdsAnalyticsGetAsyncResponse] = deriveDecoder
    implicit val encoder: ObjectEncoder[AdsAnalyticsGetAsyncResponse] = deriveEncoder
}
