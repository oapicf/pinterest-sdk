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
 * @param status 
 */
case class CreateMMMReportResponseData(reportUnderscorestatus: Option[BulkReportingJobStatus],
                token: Option[String],
                message: Option[String],
                status: Option[String]
                )

object CreateMMMReportResponseData {
    /**
     * Creates the codec for converting CreateMMMReportResponseData from and to JSON.
     */
    implicit val decoder: Decoder[CreateMMMReportResponseData] = deriveDecoder
    implicit val encoder: ObjectEncoder[CreateMMMReportResponseData] = deriveEncoder
}
