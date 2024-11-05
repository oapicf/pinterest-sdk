package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._

/**
 * 
 * @param reportUnderscoretype 
 * @param catalogUnderscoreid ID of the catalog entity.
 * @param code The event code that a diagnostics aggregated number references
 * @param codeUnderscorelabel A human-friendly label for the event code (e.g, 'AVAILABILITY_INVALID')
 * @param message Title message describing the diagnostic issue
 * @param occurrences Number of occurrences of the issue
 * @param severity An ERROR means that items have been dropped, while a WARN denotes that items have been ingested despite an issue
 */
case class CatalogsReportFeedIngestionStats(reportUnderscoretype: Option[String],
                catalogUnderscoreid: Option[String],
                code: Option[Int],
                codeUnderscorelabel: Option[String],
                message: Option[String],
                occurrences: Option[Int],
                severity: Option[String]
                )

object CatalogsReportFeedIngestionStats {
    /**
     * Creates the codec for converting CatalogsReportFeedIngestionStats from and to JSON.
     */
    implicit val decoder: Decoder[CatalogsReportFeedIngestionStats] = deriveDecoder
    implicit val encoder: ObjectEncoder[CatalogsReportFeedIngestionStats] = deriveEncoder
}
