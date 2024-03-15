package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.CatalogsProductGroupFilters
import org.openapitools.models.CatalogsProductGroupStatus
import org.openapitools.models.CatalogsProductGroupType

/**
 * 
 * @param catalogUnderscoretype 
 * @param id ID of the catalog product group.
 * @param name Name of catalog product group
 * @param description 
 * @param filters 
 * @param isUnderscorefeatured boolean indicator of whether the product group is being featured or not
 * @param _type 
 * @param status 
 * @param createdUnderscoreat Unix timestamp in seconds of when catalog product group was created.
 * @param updatedUnderscoreat Unix timestamp in seconds of last time catalog product group was updated.
 * @param feedUnderscoreid 
 */
case class CatalogsRetailProductGroup(catalogUnderscoretype: String,
                id: String,
                name: Option[String],
                description: Option[String],
                filters: CatalogsProductGroupFilters,
                isUnderscorefeatured: Option[Boolean],
                _type: Option[CatalogsProductGroupType],
                status: Option[CatalogsProductGroupStatus],
                createdUnderscoreat: Option[Int],
                updatedUnderscoreat: Option[Int],
                feedUnderscoreid: String
                )

object CatalogsRetailProductGroup {
    /**
     * Creates the codec for converting CatalogsRetailProductGroup from and to JSON.
     */
    implicit val decoder: Decoder[CatalogsRetailProductGroup] = deriveDecoder
    implicit val encoder: ObjectEncoder[CatalogsRetailProductGroup] = deriveEncoder
}
