package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._

/**
 * Object describing an item batch record to discontinue items
 * @param itemUnderscoreid The catalog item id in the merchant namespace
 */
case class ItemDeleteDiscontinuedBatchRecord(itemUnderscoreid: Option[String]
                )

object ItemDeleteDiscontinuedBatchRecord {
    /**
     * Creates the codec for converting ItemDeleteDiscontinuedBatchRecord from and to JSON.
     */
    implicit val decoder: Decoder[ItemDeleteDiscontinuedBatchRecord] = deriveDecoder
    implicit val encoder: ObjectEncoder[ItemDeleteDiscontinuedBatchRecord] = deriveEncoder
}
