package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.CatalogsLocale
import org.openapitools.models.CatalogsProductGroupFilters
import org.openapitools.models.Country

/**
 * Request object to list products for a given retail catalog_id and product group filter.
 * @param catalogUnderscoretype Retail catalog based product group is available only for selected partners at the moment. If you are not eligible, please use feed based one.
 * @param catalogUnderscoreid Catalog id pertaining to the retail product group.
 * @param filters 
 * @param country 
 * @param locale 
 */
case class CatalogsRetailListProductsByCatalogBasedFilterRequest(catalogUnderscoretype: String,
                catalogUnderscoreid: String,
                filters: CatalogsProductGroupFilters,
                country: Country,
                locale: CatalogsLocale
                )

object CatalogsRetailListProductsByCatalogBasedFilterRequest {
    /**
     * Creates the codec for converting CatalogsRetailListProductsByCatalogBasedFilterRequest from and to JSON.
     */
    implicit val decoder: Decoder[CatalogsRetailListProductsByCatalogBasedFilterRequest] = deriveDecoder
    implicit val encoder: ObjectEncoder[CatalogsRetailListProductsByCatalogBasedFilterRequest] = deriveEncoder
}
