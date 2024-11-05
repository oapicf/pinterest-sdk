package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.CatalogsHotelProductGroupFilters

/**
 * Request object to list products for a given hotel catalog_id and product group filter.
 * @param catalogUnderscoretype 
 * @param catalogUnderscoreid Catalog id pertaining to the hotel product group.
 * @param filters 
 */
case class CatalogsHotelListProductsByCatalogBasedFilterRequest(catalogUnderscoretype: String,
                catalogUnderscoreid: String,
                filters: CatalogsHotelProductGroupFilters
                )

object CatalogsHotelListProductsByCatalogBasedFilterRequest {
    /**
     * Creates the codec for converting CatalogsHotelListProductsByCatalogBasedFilterRequest from and to JSON.
     */
    implicit val decoder: Decoder[CatalogsHotelListProductsByCatalogBasedFilterRequest] = deriveDecoder
    implicit val encoder: ObjectEncoder[CatalogsHotelListProductsByCatalogBasedFilterRequest] = deriveEncoder
}
