package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.MMMReportingColumn
import org.openapitools.models.MMMReportingTargetingType
import org.openapitools.models.TargetingAdvertiserCountry
import scala.collection.immutable.Seq

/**
 * 
 * @param reportUnderscorename Name of the Marketing Mix Modeling (MMM) report
 * @param startUnderscoredate Metric report start date (UTC). Format: YYYY-MM-DD
 * @param endUnderscoredate Metric report end date (UTC). Format: YYYY-MM-DD
 * @param granularity DAY - metrics are broken down daily.<br> WEEK - metrics are broken down weekly.
 * @param level Level of the report
 * @param targetingUnderscoretypes List of targeting types
 * @param columns Metric and entity columns
 * @param countries A List of countries for filtering
 */
case class CreateMMMReportRequest(reportUnderscorename: String,
                startUnderscoredate: String,
                endUnderscoredate: String,
                granularity: String,
                level: String,
                targetingUnderscoretypes: Seq[MMMReportingTargetingType],
                columns: Seq[MMMReportingColumn],
                countries: Option[Seq[TargetingAdvertiserCountry]]
                )

object CreateMMMReportRequest {
    /**
     * Creates the codec for converting CreateMMMReportRequest from and to JSON.
     */
    implicit val decoder: Decoder[CreateMMMReportRequest] = deriveDecoder
    implicit val encoder: ObjectEncoder[CreateMMMReportRequest] = deriveEncoder
}
