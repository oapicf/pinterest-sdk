package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.CatalogsListProductsByFilterRequestOneOf
import org.openapitools.models.CatalogsProductGroupFilters

/**
 * Request object to list products for a given product group filter.
 * @param feedUnderscoreid Catalog Feed id pertaining to the catalog product group filter.
 * @param filters 
 */
case class CatalogsListProductsByFilterRequest(feedUnderscoreid: String,
                filters: CatalogsProductGroupFilters
                )

object CatalogsListProductsByFilterRequest {
    /**
     * Creates the codec for converting CatalogsListProductsByFilterRequest from and to JSON.
     */
    implicit val decoder: Decoder[CatalogsListProductsByFilterRequest] = deriveDecoder
    implicit val encoder: ObjectEncoder[CatalogsListProductsByFilterRequest] = deriveEncoder
}
