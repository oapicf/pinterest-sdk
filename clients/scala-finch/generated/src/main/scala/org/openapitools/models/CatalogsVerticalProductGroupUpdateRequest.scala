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
 * @param name 
 * @param description 
 * @param filters 
 * @param country 
 * @param locale 
 */
case class CatalogsVerticalProductGroupUpdateRequest(catalogUnderscoretype: Option[String],
                name: Option[String],
                description: Option[String],
                filters: Option[CatalogsCreativeAssetsProductGroupFilters],
                country: Option[Country],
                locale: Option[CatalogsLocale]
                )

object CatalogsVerticalProductGroupUpdateRequest {
    /**
     * Creates the codec for converting CatalogsVerticalProductGroupUpdateRequest from and to JSON.
     */
    implicit val decoder: Decoder[CatalogsVerticalProductGroupUpdateRequest] = deriveDecoder
    implicit val encoder: ObjectEncoder[CatalogsVerticalProductGroupUpdateRequest] = deriveEncoder
}
