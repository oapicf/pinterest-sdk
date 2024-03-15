package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.CatalogsProductGroupFiltersRequest

/**
 * Request object for creating a product group.
 * @param name 
 * @param description 
 * @param isUnderscorefeatured boolean indicator of whether the product group is being featured or not
 * @param filters 
 * @param feedUnderscoreid Catalog Feed id pertaining to the catalog product group.
 */
case class CatalogsProductGroupCreateRequest(name: String,
                description: Option[String],
                isUnderscorefeatured: Option[Boolean],
                filters: CatalogsProductGroupFiltersRequest,
                feedUnderscoreid: String
                )

object CatalogsProductGroupCreateRequest {
    /**
     * Creates the codec for converting CatalogsProductGroupCreateRequest from and to JSON.
     */
    implicit val decoder: Decoder[CatalogsProductGroupCreateRequest] = deriveDecoder
    implicit val encoder: ObjectEncoder[CatalogsProductGroupCreateRequest] = deriveEncoder
}
