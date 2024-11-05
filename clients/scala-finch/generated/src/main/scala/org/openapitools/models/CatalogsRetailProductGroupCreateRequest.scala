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
 * @param catalogUnderscoretype Retail catalog based product group is available only for selected partners at the moment. If you are not eligible, please use feed based one.
 * @param name 
 * @param description 
 * @param filters 
 * @param catalogUnderscoreid Catalog id pertaining to the retail product group.
 * @param country 
 * @param locale 
 */
case class CatalogsRetailProductGroupCreateRequest(catalogUnderscoretype: String,
                name: String,
                description: Option[String],
                filters: CatalogsProductGroupFiltersRequest,
                catalogUnderscoreid: String,
                country: Country,
                locale: CatalogsLocale
                )

object CatalogsRetailProductGroupCreateRequest {
    /**
     * Creates the codec for converting CatalogsRetailProductGroupCreateRequest from and to JSON.
     */
    implicit val decoder: Decoder[CatalogsRetailProductGroupCreateRequest] = deriveDecoder
    implicit val encoder: ObjectEncoder[CatalogsRetailProductGroupCreateRequest] = deriveEncoder
}
