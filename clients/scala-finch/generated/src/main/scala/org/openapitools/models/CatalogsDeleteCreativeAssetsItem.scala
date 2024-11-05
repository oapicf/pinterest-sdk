package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._

/**
 * A creative assets item to be deleted
 * @param creativeUnderscoreassetsUnderscoreid The catalog creative assets id in the merchant namespace
 * @param operation 
 */
case class CatalogsDeleteCreativeAssetsItem(creativeUnderscoreassetsUnderscoreid: String,
                operation: String
                )

object CatalogsDeleteCreativeAssetsItem {
    /**
     * Creates the codec for converting CatalogsDeleteCreativeAssetsItem from and to JSON.
     */
    implicit val decoder: Decoder[CatalogsDeleteCreativeAssetsItem] = deriveDecoder
    implicit val encoder: ObjectEncoder[CatalogsDeleteCreativeAssetsItem] = deriveEncoder
}
