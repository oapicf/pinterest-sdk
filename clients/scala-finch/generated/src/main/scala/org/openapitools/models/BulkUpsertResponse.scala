package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._

/**
 * ID of the bulk request.
 * @param requestUnderscoreid 
 */
case class BulkUpsertResponse(requestUnderscoreid: Option[String]
                )

object BulkUpsertResponse {
    /**
     * Creates the codec for converting BulkUpsertResponse from and to JSON.
     */
    implicit val decoder: Decoder[BulkUpsertResponse] = deriveDecoder
    implicit val encoder: ObjectEncoder[BulkUpsertResponse] = deriveEncoder
}
