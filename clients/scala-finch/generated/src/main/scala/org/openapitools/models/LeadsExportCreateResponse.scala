package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._

/**
 * 
 * @param leadsUnderscoreexportUnderscoreid ID for the leads export job
 */
case class LeadsExportCreateResponse(leadsUnderscoreexportUnderscoreid: Option[String]
                )

object LeadsExportCreateResponse {
    /**
     * Creates the codec for converting LeadsExportCreateResponse from and to JSON.
     */
    implicit val decoder: Decoder[LeadsExportCreateResponse] = deriveDecoder
    implicit val encoder: ObjectEncoder[LeadsExportCreateResponse] = deriveEncoder
}
