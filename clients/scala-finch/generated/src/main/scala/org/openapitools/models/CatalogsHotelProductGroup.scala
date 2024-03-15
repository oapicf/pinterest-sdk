package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.CatalogsHotelProductGroupFilters

/**
 * 
 * @param catalogUnderscoretype 
 * @param id ID of the hotel product group.
 * @param name Name of hotel product group
 * @param description 
 * @param filters 
 * @param createdUnderscoreat Unix timestamp in seconds of when catalog product group was created.
 * @param updatedUnderscoreat Unix timestamp in seconds of last time catalog product group was updated.
 * @param catalogUnderscoreid 
 */
case class CatalogsHotelProductGroup(catalogUnderscoretype: String,
                id: String,
                name: Option[String],
                description: Option[String],
                filters: CatalogsHotelProductGroupFilters,
                createdUnderscoreat: Option[Int],
                updatedUnderscoreat: Option[Int],
                catalogUnderscoreid: String
                )

object CatalogsHotelProductGroup {
    /**
     * Creates the codec for converting CatalogsHotelProductGroup from and to JSON.
     */
    implicit val decoder: Decoder[CatalogsHotelProductGroup] = deriveDecoder
    implicit val encoder: ObjectEncoder[CatalogsHotelProductGroup] = deriveEncoder
}
