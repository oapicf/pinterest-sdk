package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.CatalogsCreativeAssetsProductGroup
import org.openapitools.models.CatalogsCreativeAssetsProductGroupFilters
import org.openapitools.models.CatalogsHotelProductGroup
import org.openapitools.models.CatalogsHotelProductGroupType
import org.openapitools.models.CatalogsProductGroupStatus
import org.openapitools.models.CatalogsRetailProductGroup

/**
 * 
 * @param catalogUnderscoreid Catalog id pertaining to the creative assets product group.
 * @param catalogUnderscoretype 
 * @param country 
 * @param createdUnderscoreat Unix timestamp in seconds of when catalog product group was created.
 * @param description 
 * @param feedUnderscoreid id of the catalogs feed belonging to this catalog product group
 * @param filters 
 * @param id ID of the creative assets product group.
 * @param isUnderscorefeatured boolean indicator of whether the product group is being featured or not
 * @param locale 
 * @param name Name of creative assets product group
 * @param status 
 * @param _type 
 * @param updatedUnderscoreat Unix timestamp in seconds of last time catalog product group was updated.
 */
case class CatalogsVerticalProductGroup(catalogUnderscoreid: String,
                catalogUnderscoretype: String,
                country: Option[String],
                createdUnderscoreat: Option[Int],
                description: Option[String],
                feedUnderscoreid: String,
                filters: CatalogsCreativeAssetsProductGroupFilters,
                id: String,
                isUnderscorefeatured: Option[Boolean],
                locale: Option[String],
                name: Option[String],
                status: Option[CatalogsProductGroupStatus],
                _type: CatalogsHotelProductGroupType,
                updatedUnderscoreat: Option[Int]
                )

object CatalogsVerticalProductGroup {
    /**
     * Creates the codec for converting CatalogsVerticalProductGroup from and to JSON.
     */
    implicit val decoder: Decoder[CatalogsVerticalProductGroup] = deriveDecoder
    implicit val encoder: ObjectEncoder[CatalogsVerticalProductGroup] = deriveEncoder
}
