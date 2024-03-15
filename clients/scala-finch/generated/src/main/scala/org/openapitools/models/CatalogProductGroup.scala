package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.Board
import org.openapitools.models.EntityStatus

/**
 * non-promoted catalog product group entity
 * @param id ID of the catalog product group.
 * @param merchantUnderscoreid Merchant ID pertaining to the owner of the catalog product group.
 * @param name Name of catalog product group
 * @param filters Object holding a list of filters
 * @param filterUnderscorev2 Object holding a list of filters
 * @param _type 
 * @param status 
 * @param feedUnderscoreprofileUnderscoreid id of the feed profile belonging to this catalog product group
 * @param createdUnderscoreat Unix timestamp in seconds of when catalog product group was created.
 * @param lastUnderscoreupdate Unix timestamp in seconds of last time catalog product group was updated.
 * @param productUnderscorecount Amount of products in the catalog product group
 * @param featuredUnderscoreposition index of the featured position of the catalog product group
 */
case class CatalogProductGroup(id: Option[String],
                merchantUnderscoreid: Option[String],
                name: Option[String],
                filters: Option[Object],
                filterUnderscorev2: Option[Object],
                _type: Option[Board],
                status: Option[EntityStatus],
                feedUnderscoreprofileUnderscoreid: Option[String],
                createdUnderscoreat: Option[Int],
                lastUnderscoreupdate: Option[Int],
                productUnderscorecount: Option[Int],
                featuredUnderscoreposition: Option[Int]
                )

object CatalogProductGroup {
    /**
     * Creates the codec for converting CatalogProductGroup from and to JSON.
     */
    implicit val decoder: Decoder[CatalogProductGroup] = deriveDecoder
    implicit val encoder: ObjectEncoder[CatalogProductGroup] = deriveEncoder
}
