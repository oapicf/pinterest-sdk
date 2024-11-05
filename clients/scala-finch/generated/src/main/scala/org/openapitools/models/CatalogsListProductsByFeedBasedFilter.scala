package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.CatalogsProductGroupFilters

/**
 * Request object to list products for a given feed_id and product group filter.
 * @param feedUnderscoreid Catalog Feed id pertaining to the catalog product group filter.
 * @param filters 
 */
case class CatalogsListProductsByFeedBasedFilter(feedUnderscoreid: String,
                filters: CatalogsProductGroupFilters
                )

object CatalogsListProductsByFeedBasedFilter {
    /**
     * Creates the codec for converting CatalogsListProductsByFeedBasedFilter from and to JSON.
     */
    implicit val decoder: Decoder[CatalogsListProductsByFeedBasedFilter] = deriveDecoder
    implicit val encoder: ObjectEncoder[CatalogsListProductsByFeedBasedFilter] = deriveEncoder
}
