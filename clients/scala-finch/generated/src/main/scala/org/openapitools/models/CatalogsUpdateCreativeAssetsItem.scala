package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.CatalogsUpdatableCreativeAssetsAttributes

/**
 * A creative assets item to be updated.
 * @param creativeUnderscoreassetsUnderscoreid The catalog creative assets item id in the merchant namespace
 * @param operation 
 * @param attributes 
 */
case class CatalogsUpdateCreativeAssetsItem(creativeUnderscoreassetsUnderscoreid: String,
                operation: String,
                attributes: CatalogsUpdatableCreativeAssetsAttributes
                )

object CatalogsUpdateCreativeAssetsItem {
    /**
     * Creates the codec for converting CatalogsUpdateCreativeAssetsItem from and to JSON.
     */
    implicit val decoder: Decoder[CatalogsUpdateCreativeAssetsItem] = deriveDecoder
    implicit val encoder: ObjectEncoder[CatalogsUpdateCreativeAssetsItem] = deriveEncoder
}
