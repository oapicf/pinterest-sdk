package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ItemAttributes

/**
 * Object describing an item batch record
 * @param itemUnderscoreid The catalog item id in the merchant namespace
 * @param attributes 
 */
case class ItemBatchRecord(itemUnderscoreid: Option[String],
                attributes: Option[ItemAttributes]
                )

object ItemBatchRecord {
    /**
     * Creates the codec for converting ItemBatchRecord from and to JSON.
     */
    implicit val decoder: Decoder[ItemBatchRecord] = deriveDecoder
    implicit val encoder: ObjectEncoder[ItemBatchRecord] = deriveEncoder
}
