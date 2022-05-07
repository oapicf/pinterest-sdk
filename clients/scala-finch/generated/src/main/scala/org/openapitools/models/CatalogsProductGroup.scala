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
 * catalog product group entity
 * @param id ID of the catalog product group.
 * @param name Name of catalog product group
 * @param description 
 * @param filters 
 * @param _type 
 * @param status 
 * @param feedUnderscoreid id of the catalogs feed belonging to this catalog product group
 * @param createdUnderscoreat Unix timestamp in seconds of when catalog product group was created.
 * @param updatedUnderscoreat Unix timestamp in seconds of last time catalog product group was updated.
 */
case class CatalogsProductGroup(id: String,
                name: Option[String],
                description: Option[String],
                filters: CatalogsProductGroupFilters,
                _type: Option[CatalogsProductGroupType],
                status: Option[CatalogsProductGroupStatus],
                feedUnderscoreid: Option[String],
                createdUnderscoreat: Option[Int],
                updatedUnderscoreat: Option[Int]
                )

object CatalogsProductGroup {
    /**
     * Creates the codec for converting CatalogsProductGroup from and to JSON.
     */
    implicit val decoder: Decoder[CatalogsProductGroup] = deriveDecoder
    implicit val encoder: ObjectEncoder[CatalogsProductGroup] = deriveEncoder
}
