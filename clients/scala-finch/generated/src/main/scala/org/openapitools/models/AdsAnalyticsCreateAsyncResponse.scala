package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.BulkReportingJobStatus

/**
 * 
 * @param reportUnderscorestatus 
 * @param token 
 * @param message 
 */
case class AdsAnalyticsCreateAsyncResponse(reportUnderscorestatus: Option[BulkReportingJobStatus],
                token: Option[String],
                message: Option[String]
                )

object AdsAnalyticsCreateAsyncResponse {
    /**
     * Creates the codec for converting AdsAnalyticsCreateAsyncResponse from and to JSON.
     */
    implicit val decoder: Decoder[AdsAnalyticsCreateAsyncResponse] = deriveDecoder
    implicit val encoder: ObjectEncoder[AdsAnalyticsCreateAsyncResponse] = deriveEncoder
}
