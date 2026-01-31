package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.CatalogsHotelProductGroupFilters
import org.openapitools.models.CatalogsHotelProductGroupType

/**
 * 
 * @param catalogUnderscoreid Catalog id pertaining to the hotel product group.
 * @param catalogUnderscoretype 
 * @param createdUnderscoreat Unix timestamp in seconds of when catalog product group was created.
 * @param description 
 * @param filters 
 * @param id ID of the hotel product group.
 * @param name Name of hotel product group
 * @param _type 
 * @param updatedUnderscoreat Unix timestamp in seconds of last time catalog product group was updated.
 */
case class CatalogsHotelProductGroup(catalogUnderscoreid: String,
                catalogUnderscoretype: String,
                createdUnderscoreat: Option[Int],
                description: Option[String],
                filters: CatalogsHotelProductGroupFilters,
                id: String,
                name: Option[String],
                _type: CatalogsHotelProductGroupType,
                updatedUnderscoreat: Option[Int]
                )

object CatalogsHotelProductGroup {
    /**
     * Creates the codec for converting CatalogsHotelProductGroup from and to JSON.
     */
    implicit val decoder: Decoder[CatalogsHotelProductGroup] = deriveDecoder
    implicit val encoder: ObjectEncoder[CatalogsHotelProductGroup] = deriveEncoder
}
