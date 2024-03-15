package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.CatalogsHotelProductGroupFilters
import org.openapitools.models.CatalogsProductGroupCreateRequest
import org.openapitools.models.CatalogsVerticalProductGroupCreateRequest

/**
 * 
 * @param name 
 * @param description 
 * @param isUnderscorefeatured boolean indicator of whether the product group is being featured or not
 * @param filters 
 * @param feedUnderscoreid Catalog Feed id pertaining to the catalog product group.
 * @param catalogUnderscoretype 
 * @param catalogUnderscoreid Catalog id pertaining to the hotel product group.
 */
case class CatalogsProductGroupsCreateRequest(name: String,
                description: Option[String],
                isUnderscorefeatured: Option[Boolean],
                filters: CatalogsHotelProductGroupFilters,
                feedUnderscoreid: String,
                catalogUnderscoretype: String,
                catalogUnderscoreid: String
                )

object CatalogsProductGroupsCreateRequest {
    /**
     * Creates the codec for converting CatalogsProductGroupsCreateRequest from and to JSON.
     */
    implicit val decoder: Decoder[CatalogsProductGroupsCreateRequest] = deriveDecoder
    implicit val encoder: ObjectEncoder[CatalogsProductGroupsCreateRequest] = deriveEncoder
}
