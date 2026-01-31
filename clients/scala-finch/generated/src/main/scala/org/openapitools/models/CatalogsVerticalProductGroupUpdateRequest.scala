package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.CatalogsCreativeAssetsProductGroupFilters
import org.openapitools.models.CatalogsCreativeAssetsProductGroupUpdateRequest
import org.openapitools.models.CatalogsHotelProductGroupUpdateRequest
import org.openapitools.models.CatalogsLocale
import org.openapitools.models.CatalogsRetailProductGroupUpdateRequest
import org.openapitools.models.Country

/**
 * Request object for updating a catalog based product group.
 * @param catalogUnderscoretype 
 * @param country 
 * @param description 
 * @param filters 
 * @param locale 
 * @param name 
 */
case class CatalogsVerticalProductGroupUpdateRequest(catalogUnderscoretype: Option[String],
                country: Option[Country],
                description: Option[String],
                filters: Option[CatalogsCreativeAssetsProductGroupFilters],
                locale: Option[CatalogsLocale],
                name: Option[String]
                )

object CatalogsVerticalProductGroupUpdateRequest {
    /**
     * Creates the codec for converting CatalogsVerticalProductGroupUpdateRequest from and to JSON.
     */
    implicit val decoder: Decoder[CatalogsVerticalProductGroupUpdateRequest] = deriveDecoder
    implicit val encoder: ObjectEncoder[CatalogsVerticalProductGroupUpdateRequest] = deriveEncoder
}
