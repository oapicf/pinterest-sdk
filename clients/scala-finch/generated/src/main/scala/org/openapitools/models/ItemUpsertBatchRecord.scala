package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ItemAttributesRequest

/**
 * Object describing an item batch record to upsert items
 * @param attributes 
 * @param itemUnderscoreid The catalog item id in the merchant namespace
 */
case class ItemUpsertBatchRecord(attributes: Option[ItemAttributesRequest],
                itemUnderscoreid: Option[String]
                )

object ItemUpsertBatchRecord {
    /**
     * Creates the codec for converting ItemUpsertBatchRecord from and to JSON.
     */
    implicit val decoder: Decoder[ItemUpsertBatchRecord] = deriveDecoder
    implicit val encoder: ObjectEncoder[ItemUpsertBatchRecord] = deriveEncoder
}
