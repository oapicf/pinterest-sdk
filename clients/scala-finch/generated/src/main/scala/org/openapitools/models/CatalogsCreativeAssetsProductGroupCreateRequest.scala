package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.CatalogsCreativeAssetsProductGroupFilters

/**
 * Request object for creating a creative assets product group.
 * @param catalogUnderscoretype 
 * @param name 
 * @param description 
 * @param filters 
 * @param catalogUnderscoreid Catalog id pertaining to the creative assets product group.
 */
case class CatalogsCreativeAssetsProductGroupCreateRequest(catalogUnderscoretype: String,
                name: String,
                description: Option[String],
                filters: CatalogsCreativeAssetsProductGroupFilters,
                catalogUnderscoreid: String
                )

object CatalogsCreativeAssetsProductGroupCreateRequest {
    /**
     * Creates the codec for converting CatalogsCreativeAssetsProductGroupCreateRequest from and to JSON.
     */
    implicit val decoder: Decoder[CatalogsCreativeAssetsProductGroupCreateRequest] = deriveDecoder
    implicit val encoder: ObjectEncoder[CatalogsCreativeAssetsProductGroupCreateRequest] = deriveEncoder
}
