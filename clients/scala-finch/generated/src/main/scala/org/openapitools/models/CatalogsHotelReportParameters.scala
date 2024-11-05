package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.CatalogsHotelReportParametersReport

/**
 * Parameters for hotel report
 * @param catalogUnderscoretype 
 * @param report 
 */
case class CatalogsHotelReportParameters(catalogUnderscoretype: String,
                report: CatalogsHotelReportParametersReport
                )

object CatalogsHotelReportParameters {
    /**
     * Creates the codec for converting CatalogsHotelReportParameters from and to JSON.
     */
    implicit val decoder: Decoder[CatalogsHotelReportParameters] = deriveDecoder
    implicit val encoder: ObjectEncoder[CatalogsHotelReportParameters] = deriveEncoder
}
