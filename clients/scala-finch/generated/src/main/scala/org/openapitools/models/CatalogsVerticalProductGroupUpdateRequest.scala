package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.CatalogsHotelProductGroupFilters
import org.openapitools.models.CatalogsHotelProductGroupUpdateRequest

/**
 * Request object for updating a hotel product group.
 * @param catalogUnderscoretype 
 * @param name 
 * @param description 
 * @param filters 
 */
case class CatalogsVerticalProductGroupUpdateRequest(catalogUnderscoretype: Option[String],
                name: Option[String],
                description: Option[String],
                filters: Option[CatalogsHotelProductGroupFilters]
                )

object CatalogsVerticalProductGroupUpdateRequest {
    /**
     * Creates the codec for converting CatalogsVerticalProductGroupUpdateRequest from and to JSON.
     */
    implicit val decoder: Decoder[CatalogsVerticalProductGroupUpdateRequest] = deriveDecoder
    implicit val encoder: ObjectEncoder[CatalogsVerticalProductGroupUpdateRequest] = deriveEncoder
}
