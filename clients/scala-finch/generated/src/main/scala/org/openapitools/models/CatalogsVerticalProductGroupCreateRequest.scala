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
 * @param catalogUnderscoretype 
 * @param name 
 * @param description 
 * @param filters 
 * @param catalogUnderscoreid Catalog id pertaining to the creative assets product group.
 * @param country 
 * @param locale 
 */
case class CatalogsVerticalProductGroupCreateRequest(catalogUnderscoretype: String,
                name: String,
                description: Option[String],
                filters: CatalogsCreativeAssetsProductGroupFilters,
                catalogUnderscoreid: String,
                country: Country,
                locale: CatalogsLocale
                )

object CatalogsVerticalProductGroupCreateRequest {
    /**
     * Creates the codec for converting CatalogsVerticalProductGroupCreateRequest from and to JSON.
     */
    implicit val decoder: Decoder[CatalogsVerticalProductGroupCreateRequest] = deriveDecoder
    implicit val encoder: ObjectEncoder[CatalogsVerticalProductGroupCreateRequest] = deriveEncoder
}
