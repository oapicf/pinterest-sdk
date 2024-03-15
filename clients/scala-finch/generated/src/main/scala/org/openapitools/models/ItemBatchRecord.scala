package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ItemAttributes
import org.openapitools.models.ItemCreateBatchRecord
import org.openapitools.models.ItemDeleteBatchRecord
import org.openapitools.models.ItemDeleteDiscontinuedBatchRecord
import org.openapitools.models.ItemUpdateBatchRecord
import org.openapitools.models.ItemUpsertBatchRecord
import org.openapitools.models.UpdateMaskFieldType
import scala.collection.immutable.Seq

/**
 * Object describing an item batch record
 * @param itemUnderscoreid The catalog item id in the merchant namespace
 * @param attributes 
 * @param updateUnderscoremask The list of product attributes to be updated. Attributes specified in the update mask without a value specified in the body will be deleted from the product item.
 */
case class ItemBatchRecord(itemUnderscoreid: Option[String],
                attributes: Option[ItemAttributes],
                updateUnderscoremask: Option[Seq[UpdateMaskFieldType]]
                )

object ItemBatchRecord {
    /**
     * Creates the codec for converting ItemBatchRecord from and to JSON.
     */
    implicit val decoder: Decoder[ItemBatchRecord] = deriveDecoder
    implicit val encoder: ObjectEncoder[ItemBatchRecord] = deriveEncoder
}
