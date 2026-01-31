package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.CatalogsCreativeAssetsProductGroupFilters

/**
 * 
 * @param catalogUnderscoreid Catalog id pertaining to the creative assets product group.
 * @param catalogUnderscoretype 
 * @param createdUnderscoreat Unix timestamp in seconds of when catalog product group was created.
 * @param description 
 * @param filters 
 * @param id ID of the creative assets product group.
 * @param name Name of creative assets product group
 * @param updatedUnderscoreat Unix timestamp in seconds of last time catalog product group was updated.
 */
case class CatalogsCreativeAssetsProductGroup(catalogUnderscoreid: String,
                catalogUnderscoretype: String,
                createdUnderscoreat: Option[Int],
                description: Option[String],
                filters: CatalogsCreativeAssetsProductGroupFilters,
                id: String,
                name: Option[String],
                updatedUnderscoreat: Option[Int]
                )

object CatalogsCreativeAssetsProductGroup {
    /**
     * Creates the codec for converting CatalogsCreativeAssetsProductGroup from and to JSON.
     */
    implicit val decoder: Decoder[CatalogsCreativeAssetsProductGroup] = deriveDecoder
    implicit val encoder: ObjectEncoder[CatalogsCreativeAssetsProductGroup] = deriveEncoder
}
