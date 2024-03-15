package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.UpdatableItemAttributes
import org.openapitools.models.UpdateMaskFieldType
import scala.collection.immutable.Seq

/**
 * Object describing an item batch record to update items
 * @param itemUnderscoreid The catalog item id in the merchant namespace
 * @param attributes 
 * @param updateUnderscoremask The list of product attributes to be updated. Attributes specified in the update mask without a value specified in the body will be deleted from the product item.
 */
case class ItemUpdateBatchRecord(itemUnderscoreid: Option[String],
                attributes: Option[UpdatableItemAttributes],
                updateUnderscoremask: Option[Seq[UpdateMaskFieldType]]
                )

object ItemUpdateBatchRecord {
    /**
     * Creates the codec for converting ItemUpdateBatchRecord from and to JSON.
     */
    implicit val decoder: Decoder[ItemUpdateBatchRecord] = deriveDecoder
    implicit val encoder: ObjectEncoder[ItemUpdateBatchRecord] = deriveEncoder
}
