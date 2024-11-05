package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.CatalogsCreativeAssetsBatchItem
import org.openapitools.models.CatalogsItemsRequestLanguage
import org.openapitools.models.Country
import scala.collection.immutable.Seq

/**
 * Request object to update catalogs creative assets items
 * @param catalogUnderscoretype 
 * @param country 
 * @param language 
 * @param items Array with creative assets item operations
 * @param catalogUnderscoreid Catalog id pertaining to the creative assets item. If not provided, default to oldest creative assets catalog
 */
case class CatalogsCreativeAssetsBatchRequest(catalogUnderscoretype: String,
                country: Country,
                language: CatalogsItemsRequestLanguage,
                items: Seq[CatalogsCreativeAssetsBatchItem],
                catalogUnderscoreid: Option[String]
                )

object CatalogsCreativeAssetsBatchRequest {
    /**
     * Creates the codec for converting CatalogsCreativeAssetsBatchRequest from and to JSON.
     */
    implicit val decoder: Decoder[CatalogsCreativeAssetsBatchRequest] = deriveDecoder
    implicit val encoder: ObjectEncoder[CatalogsCreativeAssetsBatchRequest] = deriveEncoder
}
