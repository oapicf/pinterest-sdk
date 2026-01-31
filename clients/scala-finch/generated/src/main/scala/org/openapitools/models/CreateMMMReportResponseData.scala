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
 * @param status 
 * @param token 
 */
case class CreateMMMReportResponseData(message: Option[String],
                reportUnderscorestatus: Option[BulkReportingJobStatus],
                status: Option[String],
                token: Option[String]
                )

object CreateMMMReportResponseData {
    /**
     * Creates the codec for converting CreateMMMReportResponseData from and to JSON.
     */
    implicit val decoder: Decoder[CreateMMMReportResponseData] = deriveDecoder
    implicit val encoder: ObjectEncoder[CreateMMMReportResponseData] = deriveEncoder
}
