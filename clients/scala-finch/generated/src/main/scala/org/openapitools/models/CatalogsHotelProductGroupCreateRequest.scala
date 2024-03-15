package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.CatalogsHotelProductGroupFilters

/**
 * Request object for creating a hotel product group.
 * @param catalogUnderscoretype 
 * @param name 
 * @param description 
 * @param filters 
 * @param catalogUnderscoreid Catalog id pertaining to the hotel product group.
 */
case class CatalogsHotelProductGroupCreateRequest(catalogUnderscoretype: String,
                name: String,
                description: Option[String],
                filters: CatalogsHotelProductGroupFilters,
                catalogUnderscoreid: String
                )

object CatalogsHotelProductGroupCreateRequest {
    /**
     * Creates the codec for converting CatalogsHotelProductGroupCreateRequest from and to JSON.
     */
    implicit val decoder: Decoder[CatalogsHotelProductGroupCreateRequest] = deriveDecoder
    implicit val encoder: ObjectEncoder[CatalogsHotelProductGroupCreateRequest] = deriveEncoder
}
