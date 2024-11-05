package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.CatalogsCreativeAssetsListProductsByCatalogBasedFilterRequest
import org.openapitools.models.CatalogsCreativeAssetsProductGroupFilters
import org.openapitools.models.CatalogsHotelListProductsByCatalogBasedFilterRequest
import org.openapitools.models.CatalogsLocale
import org.openapitools.models.CatalogsRetailListProductsByCatalogBasedFilterRequest
import org.openapitools.models.Country

/**
 * Request object to list products for a given catalog_id and product group filter.
 * @param catalogUnderscoretype 
 * @param catalogUnderscoreid Catalog id pertaining to the creative assets product group.
 * @param filters 
 * @param country 
 * @param locale 
 */
case class CatalogsVerticalsListProductsByCatalogBasedFilterRequest(catalogUnderscoretype: String,
                catalogUnderscoreid: String,
                filters: CatalogsCreativeAssetsProductGroupFilters,
                country: Country,
                locale: CatalogsLocale
                )

object CatalogsVerticalsListProductsByCatalogBasedFilterRequest {
    /**
     * Creates the codec for converting CatalogsVerticalsListProductsByCatalogBasedFilterRequest from and to JSON.
     */
    implicit val decoder: Decoder[CatalogsVerticalsListProductsByCatalogBasedFilterRequest] = deriveDecoder
    implicit val encoder: ObjectEncoder[CatalogsVerticalsListProductsByCatalogBasedFilterRequest] = deriveEncoder
}
