package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.CatalogsCreativeAssetsAttributes

/**
 * A creative assets item to be created.
 * @param creativeUnderscoreassetsUnderscoreid The catalog creative assets id in the merchant namespace
 * @param operation 
 * @param attributes 
 */
case class CatalogsCreateCreativeAssetsItem(creativeUnderscoreassetsUnderscoreid: String,
                operation: String,
                attributes: CatalogsCreativeAssetsAttributes
                )

object CatalogsCreateCreativeAssetsItem {
    /**
     * Creates the codec for converting CatalogsCreateCreativeAssetsItem from and to JSON.
     */
    implicit val decoder: Decoder[CatalogsCreateCreativeAssetsItem] = deriveDecoder
    implicit val encoder: ObjectEncoder[CatalogsCreateCreativeAssetsItem] = deriveEncoder
}
