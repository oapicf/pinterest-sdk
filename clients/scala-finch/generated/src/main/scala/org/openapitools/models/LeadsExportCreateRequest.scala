package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._

/**
 * 
 * @param startUnderscoredate Export leads collected on and after start date (UTC). Format: YYYY-MM-DD
 * @param endUnderscoredate Export leads collected on and before end date (UTC). Format: YYYY-MM-DD
 * @param adUnderscoreid ID for the ad collecting leads
 */
case class LeadsExportCreateRequest(startUnderscoredate: String,
                endUnderscoredate: String,
                adUnderscoreid: String
                )

object LeadsExportCreateRequest {
    /**
     * Creates the codec for converting LeadsExportCreateRequest from and to JSON.
     */
    implicit val decoder: Decoder[LeadsExportCreateRequest] = deriveDecoder
    implicit val encoder: ObjectEncoder[LeadsExportCreateRequest] = deriveEncoder
}
