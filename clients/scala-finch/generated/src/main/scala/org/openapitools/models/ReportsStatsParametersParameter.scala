package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.CatalogsHotelReportStatsParameters
import org.openapitools.models.CatalogsHotelReportStatsParametersReport
import org.openapitools.models.CatalogsRetailReportStatsParameters
import org.openapitools.models.CatalogsType

/**
 * Report stats parameters
 * @param catalogUnderscoretype 
 * @param report 
 */
case class ReportsStatsParametersParameter(catalogUnderscoretype: CatalogsType,
                report: CatalogsHotelReportStatsParametersReport
                )

object ReportsStatsParametersParameter {
    /**
     * Creates the codec for converting ReportsStatsParametersParameter from and to JSON.
     */
    implicit val decoder: Decoder[ReportsStatsParametersParameter] = deriveDecoder
    implicit val encoder: ObjectEncoder[ReportsStatsParametersParameter] = deriveEncoder
}
