package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.BulkUpsertRequestCreate
import org.openapitools.models.BulkUpsertRequestUpdate

/**
 * Two set of objects to be managed asyncronusly by bulk. One for creations, one for modifications.
 * @param create 
 * @param update 
 */
case class BulkUpsertRequest(create: Option[BulkUpsertRequestCreate],
                update: Option[BulkUpsertRequestUpdate]
                )

object BulkUpsertRequest {
    /**
     * Creates the codec for converting BulkUpsertRequest from and to JSON.
     */
    implicit val decoder: Decoder[BulkUpsertRequest] = deriveDecoder
    implicit val encoder: ObjectEncoder[BulkUpsertRequest] = deriveEncoder
}
