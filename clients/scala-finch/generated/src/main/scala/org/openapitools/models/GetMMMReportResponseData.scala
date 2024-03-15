package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.BigDecimal

/**
 * 
 * @param reportUnderscorestatus 
 * @param url 
 * @param size 
 */
case class GetMMMReportResponseData(reportUnderscorestatus: Option[String],
                url: Option[String],
                size: Option[BigDecimal]
                )

object GetMMMReportResponseData {
    /**
     * Creates the codec for converting GetMMMReportResponseData from and to JSON.
     */
    implicit val decoder: Decoder[GetMMMReportResponseData] = deriveDecoder
    implicit val encoder: ObjectEncoder[GetMMMReportResponseData] = deriveEncoder
}
