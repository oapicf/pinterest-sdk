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
 * @param templateUnderscoreid Unique identifier of a template.
 * @param token 
 */
case class TemplateBasedReport(message: Option[String],
                reportUnderscorestatus: BulkReportingJobStatus,
                templateUnderscoreid: String,
                token: Option[String]
                )

object TemplateBasedReport {
    /**
     * Creates the codec for converting TemplateBasedReport from and to JSON.
     */
    implicit val decoder: Decoder[TemplateBasedReport] = deriveDecoder
    implicit val encoder: ObjectEncoder[TemplateBasedReport] = deriveEncoder
}
