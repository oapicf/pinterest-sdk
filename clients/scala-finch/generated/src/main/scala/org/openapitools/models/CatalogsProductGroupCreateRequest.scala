package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.CatalogsProductGroupFilters

/**
 * Request object for creating a product group.
 * @param feedUnderscoreid Catalog Feed id pertaining to the catalog product group.
 * @param name 
 * @param description 
 * @param filters 
 */
case class CatalogsProductGroupCreateRequest(feedUnderscoreid: String,
                name: String,
                description: Option[String],
                filters: CatalogsProductGroupFilters
                )

object CatalogsProductGroupCreateRequest {
    /**
     * Creates the codec for converting CatalogsProductGroupCreateRequest from and to JSON.
     */
    implicit val decoder: Decoder[CatalogsProductGroupCreateRequest] = deriveDecoder
    implicit val encoder: ObjectEncoder[CatalogsProductGroupCreateRequest] = deriveEncoder
}
