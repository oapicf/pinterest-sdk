package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.ItemAttributesRequest

/**
 * An item to be upserted
 * @param attributes 
 * @param itemUnderscoreid The catalog item id in the merchant namespace
 * @param operation 
 */
case class CatalogsUpsertRetailItem(attributes: ItemAttributesRequest,
                itemUnderscoreid: String,
                operation: String
                )

object CatalogsUpsertRetailItem {
    /**
     * Creates the codec for converting CatalogsUpsertRetailItem from and to JSON.
     */
    implicit val decoder: Decoder[CatalogsUpsertRetailItem] = deriveDecoder
    implicit val encoder: ObjectEncoder[CatalogsUpsertRetailItem] = deriveEncoder
}
