package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.CatalogsReportDistributionIssueFilter
import org.openapitools.models.CatalogsReportFeedIngestionFilter

/**
 * 
 * @param reportUnderscoretype 
 * @param feedUnderscoreid ID of the feed entity.
 * @param processingUnderscoreresultUnderscoreid Unique identifier of a feed processing result. It can be acquired from the \"id\" field of the \"items\" array within the response of the [List processing results for a given feed](/docs/api/v5/#operation/feed_processing_results/list). If not provided, default to most recent completed processing result.
 * @param catalogUnderscoreid Unique identifier of a catalog. If not given, oldest catalog will be used
 */
case class CatalogsHotelReportStatsParametersReport(reportUnderscoretype: Option[String],
                feedUnderscoreid: String,
                processingUnderscoreresultUnderscoreid: Option[String],
                catalogUnderscoreid: Option[String]
                )

object CatalogsHotelReportStatsParametersReport {
    /**
     * Creates the codec for converting CatalogsHotelReportStatsParametersReport from and to JSON.
     */
    implicit val decoder: Decoder[CatalogsHotelReportStatsParametersReport] = deriveDecoder
    implicit val encoder: ObjectEncoder[CatalogsHotelReportStatsParametersReport] = deriveEncoder
}
