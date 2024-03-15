package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._

/**
 * 
 * @param requestUnderscoreid ID of the bulk request.
 */
case class BulkDownloadResponse(requestUnderscoreid: Option[String]
                )

object BulkDownloadResponse {
    /**
     * Creates the codec for converting BulkDownloadResponse from and to JSON.
     */
    implicit val decoder: Decoder[BulkDownloadResponse] = deriveDecoder
    implicit val encoder: ObjectEncoder[BulkDownloadResponse] = deriveEncoder
}
