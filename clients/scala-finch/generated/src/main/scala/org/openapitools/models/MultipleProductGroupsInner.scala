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
 * @param name 
 * @param description 
 * @param isUnderscorefeatured boolean indicator of whether the product group is being featured or not
 * @param filters 
 * @param feedUnderscoreid Catalog Feed id pertaining to the catalog product group.
 * @param catalogUnderscoretype 
 * @param catalogUnderscoreid Catalog id pertaining to the creative assets product group.
 * @param country 
 * @param locale 
 */
case class MultipleProductGroupsInner(name: String,
                description: Option[String],
                isUnderscorefeatured: Option[Boolean],
                filters: CatalogsCreativeAssetsProductGroupFilters,
                feedUnderscoreid: String,
                catalogUnderscoretype: String,
                catalogUnderscoreid: String,
                country: Country,
                locale: CatalogsLocale
                )

object MultipleProductGroupsInner {
    /**
     * Creates the codec for converting MultipleProductGroupsInner from and to JSON.
     */
    implicit val decoder: Decoder[MultipleProductGroupsInner] = deriveDecoder
    implicit val encoder: ObjectEncoder[MultipleProductGroupsInner] = deriveEncoder
}
