package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.CatalogsCreateCreativeAssetsItem
import org.openapitools.models.CatalogsDeleteCreativeAssetsItem
import org.openapitools.models.CatalogsUpdatableCreativeAssetsAttributes
import org.openapitools.models.CatalogsUpdateCreativeAssetsItem
import org.openapitools.models.CatalogsUpsertCreativeAssetsItem

/**
 * Creative assets batch item
 * @param creativeUnderscoreassetsUnderscoreid The catalog creative assets id in the merchant namespace
 * @param operation 
 * @param attributes 
 */
case class CatalogsCreativeAssetsBatchItem(creativeUnderscoreassetsUnderscoreid: String,
                operation: String,
                attributes: CatalogsUpdatableCreativeAssetsAttributes
                )

object CatalogsCreativeAssetsBatchItem {
    /**
     * Creates the codec for converting CatalogsCreativeAssetsBatchItem from and to JSON.
     */
    implicit val decoder: Decoder[CatalogsCreativeAssetsBatchItem] = deriveDecoder
    implicit val encoder: ObjectEncoder[CatalogsCreativeAssetsBatchItem] = deriveEncoder
}
