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
 * @param codeUnderscorelabel A human-friendly label for the event code (e.g, 'SPAM')
 * @param message Title message describing the diagnostic issue
 * @param occurrences Number of occurrences of the issue
 * @param ineligibleUnderscoreforUnderscoreads Indicates if issue makes items ineligible for ads distribution
 * @param ineligibleUnderscoreforUnderscoreorganic Indicates if issue makes items ineligible for organic distribution
 */
case class CatalogsReportDistributionStats(reportUnderscoretype: Option[String],
                catalogUnderscoreid: Option[String],
                code: Option[Int],
                codeUnderscorelabel: Option[String],
                message: Option[String],
                occurrences: Option[Int],
                ineligibleUnderscoreforUnderscoreads: Option[Boolean],
                ineligibleUnderscoreforUnderscoreorganic: Option[Boolean]
                )

object CatalogsReportDistributionStats {
    /**
     * Creates the codec for converting CatalogsReportDistributionStats from and to JSON.
     */
    implicit val decoder: Decoder[CatalogsReportDistributionStats] = deriveDecoder
    implicit val encoder: ObjectEncoder[CatalogsReportDistributionStats] = deriveEncoder
}
