package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.CatalogsCreativeAssetsProductGroupFilters
import org.openapitools.models.CatalogsLocale
import org.openapitools.models.CatalogsProductGroupUpdateRequest
import org.openapitools.models.CatalogsVerticalProductGroupUpdateRequest
import org.openapitools.models.Country

/**
 * 
 * @param name 
 * @param description 
 * @param isUnderscorefeatured boolean indicator of whether the product group is being featured or not
 * @param filters 
 * @param catalogUnderscoretype 
 * @param country 
 * @param locale 
 */
case class CatalogsProductGroupsUpdateRequest(name: Option[String],
                description: Option[String],
                isUnderscorefeatured: Option[Boolean],
                filters: Option[CatalogsCreativeAssetsProductGroupFilters],
                catalogUnderscoretype: Option[String],
                country: Option[Country],
                locale: Option[CatalogsLocale]
                )

object CatalogsProductGroupsUpdateRequest {
    /**
     * Creates the codec for converting CatalogsProductGroupsUpdateRequest from and to JSON.
     */
    implicit val decoder: Decoder[CatalogsProductGroupsUpdateRequest] = deriveDecoder
    implicit val encoder: ObjectEncoder[CatalogsProductGroupsUpdateRequest] = deriveEncoder
}
