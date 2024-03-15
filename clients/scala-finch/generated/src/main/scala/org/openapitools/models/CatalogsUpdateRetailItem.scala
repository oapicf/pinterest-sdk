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
 * An item to be updated
 * @param itemUnderscoreid The catalog item id in the merchant namespace
 * @param operation 
 * @param attributes 
 * @param updateUnderscoremask The list of product attributes to be updated. Attributes specified in the update mask without a value specified in the body will be deleted from the product item.
 */
case class CatalogsUpdateRetailItem(itemUnderscoreid: String,
                operation: String,
                attributes: UpdatableItemAttributes,
                updateUnderscoremask: Option[Seq[UpdateMaskFieldType]]
                )

object CatalogsUpdateRetailItem {
    /**
     * Creates the codec for converting CatalogsUpdateRetailItem from and to JSON.
     */
    implicit val decoder: Decoder[CatalogsUpdateRetailItem] = deriveDecoder
    implicit val encoder: ObjectEncoder[CatalogsUpdateRetailItem] = deriveEncoder
}
