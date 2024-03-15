package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.CatalogsProductGroupFiltersRequest

/**
 * Request object for updating a product group.
 * @param name 
 * @param description 
 * @param isUnderscorefeatured boolean indicator of whether the product group is being featured or not
 * @param filters 
 */
case class CatalogsProductGroupUpdateRequest(name: Option[String],
                description: Option[String],
                isUnderscorefeatured: Option[Boolean],
                filters: Option[CatalogsProductGroupFiltersRequest]
                )

object CatalogsProductGroupUpdateRequest {
    /**
     * Creates the codec for converting CatalogsProductGroupUpdateRequest from and to JSON.
     */
    implicit val decoder: Decoder[CatalogsProductGroupUpdateRequest] = deriveDecoder
    implicit val encoder: ObjectEncoder[CatalogsProductGroupUpdateRequest] = deriveEncoder
}
