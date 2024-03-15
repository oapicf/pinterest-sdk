package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._

/**
 * An item to be deleted
 * @param itemUnderscoreid The catalog item id in the merchant namespace
 * @param operation 
 */
case class CatalogsDeleteRetailItem(itemUnderscoreid: String,
                operation: String
                )

object CatalogsDeleteRetailItem {
    /**
     * Creates the codec for converting CatalogsDeleteRetailItem from and to JSON.
     */
    implicit val decoder: Decoder[CatalogsDeleteRetailItem] = deriveDecoder
    implicit val encoder: ObjectEncoder[CatalogsDeleteRetailItem] = deriveEncoder
}
