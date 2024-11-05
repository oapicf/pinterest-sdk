package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.CatalogsCreativeAssetsProductGroupFilters

/**
 * Request object for updating a creative assets product group.
 * @param catalogUnderscoretype 
 * @param name 
 * @param description 
 * @param filters 
 */
case class CatalogsCreativeAssetsProductGroupUpdateRequest(catalogUnderscoretype: Option[String],
                name: Option[String],
                description: Option[String],
                filters: Option[CatalogsCreativeAssetsProductGroupFilters]
                )

object CatalogsCreativeAssetsProductGroupUpdateRequest {
    /**
     * Creates the codec for converting CatalogsCreativeAssetsProductGroupUpdateRequest from and to JSON.
     */
    implicit val decoder: Decoder[CatalogsCreativeAssetsProductGroupUpdateRequest] = deriveDecoder
    implicit val encoder: ObjectEncoder[CatalogsCreativeAssetsProductGroupUpdateRequest] = deriveEncoder
}
