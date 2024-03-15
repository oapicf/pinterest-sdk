package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.BigDecimal
import org.openapitools.models.GetMMMReportResponseData

/**
 * 
 * @param code 
 * @param data 
 * @param message 
 * @param status 
 */
case class GetMMMReportResponse(code: Option[BigDecimal],
                data: Option[GetMMMReportResponseData],
                message: Option[String],
                status: Option[String]
                )

object GetMMMReportResponse {
    /**
     * Creates the codec for converting GetMMMReportResponse from and to JSON.
     */
    implicit val decoder: Decoder[GetMMMReportResponse] = deriveDecoder
    implicit val encoder: ObjectEncoder[GetMMMReportResponse] = deriveEncoder
}
