package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.CatalogsCreativeAssetsBatchItem
import org.openapitools.models.Country
import scala.collection.immutable.Seq

/**
 * Request object to update catalogs creative assets items
 * @param catalogUnderscoreid Catalog id pertaining to the creative assets item. If not provided, default to oldest creative assets catalog
 * @param catalogUnderscoretype 
 * @param country 
 * @param items Array with creative assets item operations
 * @param language We recommend using the CatalogsLocale values.
 */
case class CatalogsCreativeAssetsBatchRequest(catalogUnderscoreid: Option[String],
                catalogUnderscoretype: String,
                country: Country,
                items: Seq[CatalogsCreativeAssetsBatchItem],
                language: String
                )

object CatalogsCreativeAssetsBatchRequest {
    /**
     * Creates the codec for converting CatalogsCreativeAssetsBatchRequest from and to JSON.
     */
    implicit val decoder: Decoder[CatalogsCreativeAssetsBatchRequest] = deriveDecoder
    implicit val encoder: ObjectEncoder[CatalogsCreativeAssetsBatchRequest] = deriveEncoder
}
