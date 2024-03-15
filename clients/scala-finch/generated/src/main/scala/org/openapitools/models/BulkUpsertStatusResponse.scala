package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.BulkUpsertStatus

/**
 * ID of the bulk request.
 * @param status 
 * @param resultUnderscoreurl 
 */
case class BulkUpsertStatusResponse(status: Option[BulkUpsertStatus],
                resultUnderscoreurl: Option[String]
                )

object BulkUpsertStatusResponse {
    /**
     * Creates the codec for converting BulkUpsertStatusResponse from and to JSON.
     */
    implicit val decoder: Decoder[BulkUpsertStatusResponse] = deriveDecoder
    implicit val encoder: ObjectEncoder[BulkUpsertStatusResponse] = deriveEncoder
}
