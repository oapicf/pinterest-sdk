package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.CreativeAssetsVisibilityType

/**
 * Creative assets product metadata entity
 * @param creativeUnderscoreassetsUnderscoreid The user-created unique ID that represents the creative assets item.
 * @param visibility 
 */
case class CatalogsCreativeAssetsProductMetadata(creativeUnderscoreassetsUnderscoreid: String,
                visibility: CreativeAssetsVisibilityType
                )

object CatalogsCreativeAssetsProductMetadata {
    /**
     * Creates the codec for converting CatalogsCreativeAssetsProductMetadata from and to JSON.
     */
    implicit val decoder: Decoder[CatalogsCreativeAssetsProductMetadata] = deriveDecoder
    implicit val encoder: ObjectEncoder[CatalogsCreativeAssetsProductMetadata] = deriveEncoder
}
