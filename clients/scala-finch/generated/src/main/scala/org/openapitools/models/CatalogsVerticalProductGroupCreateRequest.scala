package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.CatalogsCreativeAssetsProductGroupCreateRequest
import org.openapitools.models.CatalogsCreativeAssetsProductGroupFilters
import org.openapitools.models.CatalogsHotelProductGroupCreateRequest
import org.openapitools.models.CatalogsLocale
import org.openapitools.models.CatalogsRetailProductGroupCreateRequest
import org.openapitools.models.Country

/**
 * Request object for creating a catalog based product group.
 * @param catalogUnderscoreid Catalog id pertaining to the creative assets product group.
 * @param catalogUnderscoretype 
 * @param country 
 * @param description 
 * @param filters 
 * @param locale 
 * @param name 
 */
case class CatalogsVerticalProductGroupCreateRequest(catalogUnderscoreid: String,
                catalogUnderscoretype: String,
                country: Option[Country],
                description: Option[String],
                filters: CatalogsCreativeAssetsProductGroupFilters,
                locale: Option[CatalogsLocale],
                name: String
                )

object CatalogsVerticalProductGroupCreateRequest {
    /**
     * Creates the codec for converting CatalogsVerticalProductGroupCreateRequest from and to JSON.
     */
    implicit val decoder: Decoder[CatalogsVerticalProductGroupCreateRequest] = deriveDecoder
    implicit val encoder: ObjectEncoder[CatalogsVerticalProductGroupCreateRequest] = deriveEncoder
}
