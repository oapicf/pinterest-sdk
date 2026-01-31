package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.BulkReportingJobStatus

/**
 * 
 * @param message 
 * @param reportUnderscorestatus 
 * @param token 
 */
case class AdsAnalyticsCreateAsyncResponse(message: Option[String],
                reportUnderscorestatus: Option[BulkReportingJobStatus],
                token: Option[String]
                )

object AdsAnalyticsCreateAsyncResponse {
    /**
     * Creates the codec for converting AdsAnalyticsCreateAsyncResponse from and to JSON.
     */
    implicit val decoder: Decoder[AdsAnalyticsCreateAsyncResponse] = deriveDecoder
    implicit val encoder: ObjectEncoder[AdsAnalyticsCreateAsyncResponse] = deriveEncoder
}
