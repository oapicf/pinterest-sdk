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
 * Request object for creating a product group.
 * @param catalogUnderscoreid Catalog id pertaining to the retail product group.
 * @param catalogUnderscoretype Retail catalog based product group is available only for selected partners at the moment. If you are not eligible, please use feed based one.
 * @param country 
 * @param description 
 * @param filters 
 * @param locale 
 * @param name 
 */
case class CatalogsRetailProductGroupCreateRequest(catalogUnderscoreid: String,
                catalogUnderscoretype: String,
                country: Option[Country],
                description: Option[String],
                filters: CatalogsProductGroupFiltersRequest,
                locale: Option[CatalogsLocale],
                name: String
                )

object CatalogsRetailProductGroupCreateRequest {
    /**
     * Creates the codec for converting CatalogsRetailProductGroupCreateRequest from and to JSON.
     */
    implicit val decoder: Decoder[CatalogsRetailProductGroupCreateRequest] = deriveDecoder
    implicit val encoder: ObjectEncoder[CatalogsRetailProductGroupCreateRequest] = deriveEncoder
}
