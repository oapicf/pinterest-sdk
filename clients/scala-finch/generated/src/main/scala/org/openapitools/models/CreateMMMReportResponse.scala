package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.BigDecimal
import org.openapitools.models.CreateMMMReportResponseData

/**
 * 
 * @param code 
 * @param data 
 */
case class CreateMMMReportResponse(code: Option[BigDecimal],
                data: Option[CreateMMMReportResponseData]
                )

object CreateMMMReportResponse {
    /**
     * Creates the codec for converting CreateMMMReportResponse from and to JSON.
     */
    implicit val decoder: Decoder[CreateMMMReportResponse] = deriveDecoder
    implicit val encoder: ObjectEncoder[CreateMMMReportResponse] = deriveEncoder
}
