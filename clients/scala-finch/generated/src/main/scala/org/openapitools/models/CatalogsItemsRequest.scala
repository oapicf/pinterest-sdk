package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.CatalogsItemsPostFilters
import org.openapitools.models.CatalogsItemsRequestLanguage
import org.openapitools.models.Country

/**
 * Request object of catalogs items
 * @param country 
 * @param language 
 * @param filters 
 */
case class CatalogsItemsRequest(country: Country,
                language: CatalogsItemsRequestLanguage,
                filters: CatalogsItemsPostFilters
                )

object CatalogsItemsRequest {
    /**
     * Creates the codec for converting CatalogsItemsRequest from and to JSON.
     */
    implicit val decoder: Decoder[CatalogsItemsRequest] = deriveDecoder
    implicit val encoder: ObjectEncoder[CatalogsItemsRequest] = deriveEncoder
}
