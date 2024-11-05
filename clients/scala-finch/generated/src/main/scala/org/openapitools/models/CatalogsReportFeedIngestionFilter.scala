package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._

/**
 * 
 * @param reportUnderscoretype 
 * @param feedUnderscoreid ID of the feed entity.
 * @param processingUnderscoreresultUnderscoreid Unique identifier of a feed processing result. It can be acquired from the \"id\" field of the \"items\" array within the response of the [List processing results for a given feed](/docs/api/v5/#operation/feed_processing_results/list). If not provided, default to most recent completed processing result.
 */
case class CatalogsReportFeedIngestionFilter(reportUnderscoretype: String,
                feedUnderscoreid: String,
                processingUnderscoreresultUnderscoreid: Option[String]
                )

object CatalogsReportFeedIngestionFilter {
    /**
     * Creates the codec for converting CatalogsReportFeedIngestionFilter from and to JSON.
     */
    implicit val decoder: Decoder[CatalogsReportFeedIngestionFilter] = deriveDecoder
    implicit val encoder: ObjectEncoder[CatalogsReportFeedIngestionFilter] = deriveEncoder
}
