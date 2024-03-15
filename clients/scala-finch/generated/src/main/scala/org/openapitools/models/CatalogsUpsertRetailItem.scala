package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ItemAttributes

/**
 * An item to be upserted
 * @param itemUnderscoreid The catalog item id in the merchant namespace
 * @param operation 
 * @param attributes 
 */
case class CatalogsUpsertRetailItem(itemUnderscoreid: String,
                operation: String,
                attributes: ItemAttributes
                )

object CatalogsUpsertRetailItem {
    /**
     * Creates the codec for converting CatalogsUpsertRetailItem from and to JSON.
     */
    implicit val decoder: Decoder[CatalogsUpsertRetailItem] = deriveDecoder
    implicit val encoder: ObjectEncoder[CatalogsUpsertRetailItem] = deriveEncoder
}
