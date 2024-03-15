package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.CatalogsHotelProductGroupFilters
import org.openapitools.models.CatalogsProductGroupUpdateRequest
import org.openapitools.models.CatalogsVerticalProductGroupUpdateRequest

/**
 * 
 * @param name 
 * @param description 
 * @param isUnderscorefeatured boolean indicator of whether the product group is being featured or not
 * @param filters 
 * @param catalogUnderscoretype 
 */
case class CatalogsProductGroupsUpdateRequest(name: Option[String],
                description: Option[String],
                isUnderscorefeatured: Option[Boolean],
                filters: Option[CatalogsHotelProductGroupFilters],
                catalogUnderscoretype: Option[String]
                )

object CatalogsProductGroupsUpdateRequest {
    /**
     * Creates the codec for converting CatalogsProductGroupsUpdateRequest from and to JSON.
     */
    implicit val decoder: Decoder[CatalogsProductGroupsUpdateRequest] = deriveDecoder
    implicit val encoder: ObjectEncoder[CatalogsProductGroupsUpdateRequest] = deriveEncoder
}
