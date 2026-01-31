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
 * @param size 
 * @param url 
 */
case class GetMMMReportResponseData(reportUnderscorestatus: Option[String],
                size: Option[BigDecimal],
                url: Option[String]
                )

object GetMMMReportResponseData {
    /**
     * Creates the codec for converting GetMMMReportResponseData from and to JSON.
     */
    implicit val decoder: Decoder[GetMMMReportResponseData] = deriveDecoder
    implicit val encoder: ObjectEncoder[GetMMMReportResponseData] = deriveEncoder
}
