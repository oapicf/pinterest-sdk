package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ItemAttributesRequest

/**
 * Object describing an item batch record to create items
 * @param itemUnderscoreid The catalog item id in the merchant namespace
 * @param attributes 
 */
case class ItemCreateBatchRecord(itemUnderscoreid: Option[String],
                attributes: Option[ItemAttributesRequest]
                )

object ItemCreateBatchRecord {
    /**
     * Creates the codec for converting ItemCreateBatchRecord from and to JSON.
     */
    implicit val decoder: Decoder[ItemCreateBatchRecord] = deriveDecoder
    implicit val encoder: ObjectEncoder[ItemCreateBatchRecord] = deriveEncoder
}
