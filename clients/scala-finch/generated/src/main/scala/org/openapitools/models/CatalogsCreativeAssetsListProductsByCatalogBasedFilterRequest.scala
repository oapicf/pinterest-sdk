package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.CatalogsCreativeAssetsProductGroupFilters

/**
 * Request object to list products for a given creative assets catalog_id and product group filter.
 * @param catalogUnderscoretype 
 * @param catalogUnderscoreid Catalog id pertaining to the creative assets product group.
 * @param filters 
 */
case class CatalogsCreativeAssetsListProductsByCatalogBasedFilterRequest(catalogUnderscoretype: String,
                catalogUnderscoreid: String,
                filters: CatalogsCreativeAssetsProductGroupFilters
                )

object CatalogsCreativeAssetsListProductsByCatalogBasedFilterRequest {
    /**
     * Creates the codec for converting CatalogsCreativeAssetsListProductsByCatalogBasedFilterRequest from and to JSON.
     */
    implicit val decoder: Decoder[CatalogsCreativeAssetsListProductsByCatalogBasedFilterRequest] = deriveDecoder
    implicit val encoder: ObjectEncoder[CatalogsCreativeAssetsListProductsByCatalogBasedFilterRequest] = deriveEncoder
}
