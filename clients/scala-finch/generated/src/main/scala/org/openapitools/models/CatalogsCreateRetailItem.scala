package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ItemAttributes

/**
 * An item to be created
 * @param itemUnderscoreid The catalog item id in the merchant namespace
 * @param operation 
 * @param attributes 
 */
case class CatalogsCreateRetailItem(itemUnderscoreid: String,
                operation: String,
                attributes: ItemAttributes
                )

object CatalogsCreateRetailItem {
    /**
     * Creates the codec for converting CatalogsCreateRetailItem from and to JSON.
     */
    implicit val decoder: Decoder[CatalogsCreateRetailItem] = deriveDecoder
    implicit val encoder: ObjectEncoder[CatalogsCreateRetailItem] = deriveEncoder
}
