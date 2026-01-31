package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.CatalogsCreateRetailItem
import org.openapitools.models.CatalogsDeleteRetailItem
import org.openapitools.models.CatalogsUpdateRetailItem
import org.openapitools.models.CatalogsUpsertRetailItem
import org.openapitools.models.ItemAttributesRequest
import org.openapitools.models.UpdateMaskFieldType
import scala.collection.immutable.Seq

/**
 * 
 * @param attributes 
 * @param itemUnderscoreid The catalog item id in the merchant namespace
 * @param operation 
 * @param updateUnderscoremask The list of product attributes to be updated. Attributes specified in the update mask without a value specified in the body will be deleted from the product item.
 * @param lastUnderscoreupdatedUnderscoretime The millisecond timestamp when the item was lastly modified by the merchant.
 */
case class CatalogsRetailBatchRequestItemsInner(attributes: ItemAttributesRequest,
                itemUnderscoreid: String,
                operation: String,
                updateUnderscoremask: Option[Seq[UpdateMaskFieldType]],
                lastUnderscoreupdatedUnderscoretime: Option[Long]
                )

object CatalogsRetailBatchRequestItemsInner {
    /**
     * Creates the codec for converting CatalogsRetailBatchRequestItemsInner from and to JSON.
     */
    implicit val decoder: Decoder[CatalogsRetailBatchRequestItemsInner] = deriveDecoder
    implicit val encoder: ObjectEncoder[CatalogsRetailBatchRequestItemsInner] = deriveEncoder
}
