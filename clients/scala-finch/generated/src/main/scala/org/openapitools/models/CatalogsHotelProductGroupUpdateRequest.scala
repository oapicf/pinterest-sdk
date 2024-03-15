package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.CatalogsHotelProductGroupFilters

/**
 * Request object for updating a hotel product group.
 * @param catalogUnderscoretype 
 * @param name 
 * @param description 
 * @param filters 
 */
case class CatalogsHotelProductGroupUpdateRequest(catalogUnderscoretype: Option[String],
                name: Option[String],
                description: Option[String],
                filters: Option[CatalogsHotelProductGroupFilters]
                )

object CatalogsHotelProductGroupUpdateRequest {
    /**
     * Creates the codec for converting CatalogsHotelProductGroupUpdateRequest from and to JSON.
     */
    implicit val decoder: Decoder[CatalogsHotelProductGroupUpdateRequest] = deriveDecoder
    implicit val encoder: ObjectEncoder[CatalogsHotelProductGroupUpdateRequest] = deriveEncoder
}
