package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.CatalogsCreativeAssetsAttributes

/**
 * A creative assets item to be upserted.
 * @param creativeUnderscoreassetsUnderscoreid The catalog creative assets id in the merchant namespace
 * @param operation 
 * @param attributes 
 */
case class CatalogsUpsertCreativeAssetsItem(creativeUnderscoreassetsUnderscoreid: String,
                operation: String,
                attributes: CatalogsCreativeAssetsAttributes
                )

object CatalogsUpsertCreativeAssetsItem {
    /**
     * Creates the codec for converting CatalogsUpsertCreativeAssetsItem from and to JSON.
     */
    implicit val decoder: Decoder[CatalogsUpsertCreativeAssetsItem] = deriveDecoder
    implicit val encoder: ObjectEncoder[CatalogsUpsertCreativeAssetsItem] = deriveEncoder
}
