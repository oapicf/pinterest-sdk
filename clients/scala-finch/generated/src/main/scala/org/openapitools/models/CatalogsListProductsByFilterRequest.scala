package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.CatalogsCreativeAssetsProductGroupFilters
import org.openapitools.models.CatalogsListProductsByFeedBasedFilter
import org.openapitools.models.CatalogsLocale
import org.openapitools.models.CatalogsVerticalsListProductsByCatalogBasedFilterRequest
import org.openapitools.models.Country

/**
 * Request object to list products for a given product group filter.
 * @param feedUnderscoreid Catalog Feed id pertaining to the catalog product group filter.
 * @param filters 
 * @param catalogUnderscoretype 
 * @param catalogUnderscoreid Catalog id pertaining to the creative assets product group.
 * @param country 
 * @param locale 
 */
case class CatalogsListProductsByFilterRequest(feedUnderscoreid: String,
                filters: CatalogsCreativeAssetsProductGroupFilters,
                catalogUnderscoretype: String,
                catalogUnderscoreid: String,
                country: Country,
                locale: CatalogsLocale
                )

object CatalogsListProductsByFilterRequest {
    /**
     * Creates the codec for converting CatalogsListProductsByFilterRequest from and to JSON.
     */
    implicit val decoder: Decoder[CatalogsListProductsByFilterRequest] = deriveDecoder
    implicit val encoder: ObjectEncoder[CatalogsListProductsByFilterRequest] = deriveEncoder
}
