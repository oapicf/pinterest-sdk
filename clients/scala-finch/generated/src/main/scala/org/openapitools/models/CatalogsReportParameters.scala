package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.CatalogsHotelReportParameters
import org.openapitools.models.CatalogsHotelReportParametersReport
import org.openapitools.models.CatalogsRetailReportParameters
import org.openapitools.models.CatalogsType

/**
 * Report parameters
 * @param catalogUnderscoretype 
 * @param report 
 */
case class CatalogsReportParameters(catalogUnderscoretype: CatalogsType,
                report: CatalogsHotelReportParametersReport
                )

object CatalogsReportParameters {
    /**
     * Creates the codec for converting CatalogsReportParameters from and to JSON.
     */
    implicit val decoder: Decoder[CatalogsReportParameters] = deriveDecoder
    implicit val encoder: ObjectEncoder[CatalogsReportParameters] = deriveEncoder
}
