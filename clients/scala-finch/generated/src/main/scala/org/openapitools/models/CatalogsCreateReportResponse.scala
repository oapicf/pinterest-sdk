package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._

/**
 * 
 * @param token Token to be used to get the report
 */
case class CatalogsCreateReportResponse(token: Option[String]
                )

object CatalogsCreateReportResponse {
    /**
     * Creates the codec for converting CatalogsCreateReportResponse from and to JSON.
     */
    implicit val decoder: Decoder[CatalogsCreateReportResponse] = deriveDecoder
    implicit val encoder: ObjectEncoder[CatalogsCreateReportResponse] = deriveEncoder
}
