package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.CatalogsHotelReportStatsParametersReport

/**
 * Parameters for hotel report
 * @param catalogUnderscoretype 
 * @param report 
 */
case class CatalogsHotelReportStatsParameters(catalogUnderscoretype: String,
                report: CatalogsHotelReportStatsParametersReport
                )

object CatalogsHotelReportStatsParameters {
    /**
     * Creates the codec for converting CatalogsHotelReportStatsParameters from and to JSON.
     */
    implicit val decoder: Decoder[CatalogsHotelReportStatsParameters] = deriveDecoder
    implicit val encoder: ObjectEncoder[CatalogsHotelReportStatsParameters] = deriveEncoder
}
