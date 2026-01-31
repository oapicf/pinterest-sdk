package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.CatalogsLocale
import org.openapitools.models.CatalogsProductGroupFiltersRequest
import org.openapitools.models.Country

/**
 * Request object for updating a retail product group.
 * @param catalogUnderscoretype Retail catalog based product group is available only for selected partners at the moment. If you are not eligible, please use feed based one.
 * @param country 
 * @param description 
 * @param filters 
 * @param locale 
 * @param name 
 */
case class CatalogsRetailProductGroupUpdateRequest(catalogUnderscoretype: Option[String],
                country: Option[Country],
                description: Option[String],
                filters: Option[CatalogsProductGroupFiltersRequest],
                locale: Option[CatalogsLocale],
                name: Option[String]
                )

object CatalogsRetailProductGroupUpdateRequest {
    /**
     * Creates the codec for converting CatalogsRetailProductGroupUpdateRequest from and to JSON.
     */
    implicit val decoder: Decoder[CatalogsRetailProductGroupUpdateRequest] = deriveDecoder
    implicit val encoder: ObjectEncoder[CatalogsRetailProductGroupUpdateRequest] = deriveEncoder
}
