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
 * @param countries A List of countries for filtering
 * @param columns Metric and entity columns
 * @param endUnderscoredate Metric report end date (UTC). Format: YYYY-MM-DD
 * @param granularity DAY - metrics are broken down daily.<br> WEEK - metrics are broken down weekly.
 * @param level Level of the report
 * @param reportUnderscorename Name of the Marketing Mix Modeling (MMM) report
 * @param startUnderscoredate Metric report start date (UTC). Format: YYYY-MM-DD
 * @param targetingUnderscoretypes List of targeting types
 */
case class CreateMMMReportRequest(countries: Option[Seq[TargetingAdvertiserCountry]],
                columns: Seq[MMMReportingColumn],
                endUnderscoredate: String,
                granularity: String,
                level: String,
                reportUnderscorename: String,
                startUnderscoredate: String,
                targetingUnderscoretypes: Seq[MMMReportingTargetingType]
                )

object CreateMMMReportRequest {
    /**
     * Creates the codec for converting CreateMMMReportRequest from and to JSON.
     */
    implicit val decoder: Decoder[CreateMMMReportRequest] = deriveDecoder
    implicit val encoder: ObjectEncoder[CreateMMMReportRequest] = deriveEncoder
}
