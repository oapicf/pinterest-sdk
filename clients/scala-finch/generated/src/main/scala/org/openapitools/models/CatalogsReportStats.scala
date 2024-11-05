package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.CatalogsReportDistributionStats
import org.openapitools.models.CatalogsReportFeedIngestionStats

/**
 * Diagnostics aggregated numbers
 * @param reportUnderscoretype 
 * @param catalogUnderscoreid ID of the catalog entity.
 * @param code The event code that a diagnostics aggregated number references
 * @param codeUnderscorelabel A human-friendly label for the event code (e.g, 'SPAM')
 * @param message Title message describing the diagnostic issue
 * @param occurrences Number of occurrences of the issue
 * @param severity An ERROR means that items have been dropped, while a WARN denotes that items have been ingested despite an issue
 * @param ineligibleUnderscoreforUnderscoreads Indicates if issue makes items ineligible for ads distribution
 * @param ineligibleUnderscoreforUnderscoreorganic Indicates if issue makes items ineligible for organic distribution
 */
case class CatalogsReportStats(reportUnderscoretype: String,
                catalogUnderscoreid: Option[String],
                code: Option[Int],
                codeUnderscorelabel: Option[String],
                message: Option[String],
                occurrences: Option[Int],
                severity: Option[String],
                ineligibleUnderscoreforUnderscoreads: Option[Boolean],
                ineligibleUnderscoreforUnderscoreorganic: Option[Boolean]
                )

object CatalogsReportStats {
    /**
     * Creates the codec for converting CatalogsReportStats from and to JSON.
     */
    implicit val decoder: Decoder[CatalogsReportStats] = deriveDecoder
    implicit val encoder: ObjectEncoder[CatalogsReportStats] = deriveEncoder
}
