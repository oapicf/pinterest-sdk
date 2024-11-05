package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.CatalogsHotelReportParametersReport

/**
 * Parameters for retail report
 * @param catalogUnderscoretype 
 * @param report 
 */
case class CatalogsRetailReportParameters(catalogUnderscoretype: String,
                report: CatalogsHotelReportParametersReport
                )

object CatalogsRetailReportParameters {
    /**
     * Creates the codec for converting CatalogsRetailReportParameters from and to JSON.
     */
    implicit val decoder: Decoder[CatalogsRetailReportParameters] = deriveDecoder
    implicit val encoder: ObjectEncoder[CatalogsRetailReportParameters] = deriveEncoder
}
