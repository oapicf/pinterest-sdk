package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.CatalogsCreativeAssetsProductGroupFilters
import org.openapitools.models.CatalogsLocale
import org.openapitools.models.CatalogsProductGroupCreateRequest
import org.openapitools.models.CatalogsVerticalProductGroupCreateRequest
import org.openapitools.models.Country

/**
 * 
 * @param description 
 * @param feedUnderscoreid Catalog Feed id pertaining to the catalog product group.
 * @param filters 
 * @param isUnderscorefeatured boolean indicator of whether the product group is being featured or not
 * @param name 
 * @param catalogUnderscoreid Catalog id pertaining to the creative assets product group.
 * @param catalogUnderscoretype 
 * @param country 
 * @param locale 
 */
case class MultipleProductGroupsInner(description: Option[String],
                feedUnderscoreid: String,
                filters: CatalogsCreativeAssetsProductGroupFilters,
                isUnderscorefeatured: Option[Boolean],
                name: String,
                catalogUnderscoreid: String,
                catalogUnderscoretype: String,
                country: Option[Country],
                locale: Option[CatalogsLocale]
                )

object MultipleProductGroupsInner {
    /**
     * Creates the codec for converting MultipleProductGroupsInner from and to JSON.
     */
    implicit val decoder: Decoder[MultipleProductGroupsInner] = deriveDecoder
    implicit val encoder: ObjectEncoder[MultipleProductGroupsInner] = deriveEncoder
}
