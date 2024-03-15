package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._

/**
 * Object describing an item batch record to delete items
 * @param itemUnderscoreid The catalog item id in the merchant namespace
 */
case class ItemDeleteBatchRecord(itemUnderscoreid: Option[String]
                )

object ItemDeleteBatchRecord {
    /**
     * Creates the codec for converting ItemDeleteBatchRecord from and to JSON.
     */
    implicit val decoder: Decoder[ItemDeleteBatchRecord] = deriveDecoder
    implicit val encoder: ObjectEncoder[ItemDeleteBatchRecord] = deriveEncoder
}
