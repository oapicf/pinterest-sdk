package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.CatalogsHotelReportStatsParametersReport

/**
 * Parameters for retail report
 * @param catalogUnderscoretype 
 * @param report 
 */
case class CatalogsRetailReportStatsParameters(catalogUnderscoretype: String,
                report: CatalogsHotelReportStatsParametersReport
                )

object CatalogsRetailReportStatsParameters {
    /**
     * Creates the codec for converting CatalogsRetailReportStatsParameters from and to JSON.
     */
    implicit val decoder: Decoder[CatalogsRetailReportStatsParameters] = deriveDecoder
    implicit val encoder: ObjectEncoder[CatalogsRetailReportStatsParameters] = deriveEncoder
}
