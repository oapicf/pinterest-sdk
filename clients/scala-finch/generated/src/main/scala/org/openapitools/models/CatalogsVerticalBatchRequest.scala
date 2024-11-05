package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.CatalogsCreativeAssetsBatchItem
import org.openapitools.models.CatalogsCreativeAssetsBatchRequest
import org.openapitools.models.CatalogsHotelBatchRequest
import org.openapitools.models.CatalogsItemsRequestLanguage
import org.openapitools.models.CatalogsRetailBatchRequest
import org.openapitools.models.Country
import scala.collection.immutable.Seq

/**
 * A request object that can have multiple operations on a single batch
 * @param catalogUnderscoretype 
 * @param country 
 * @param language 
 * @param items Array with creative assets item operations
 * @param catalogUnderscoreid Catalog id pertaining to the creative assets item. If not provided, default to oldest creative assets catalog
 */
case class CatalogsVerticalBatchRequest(catalogUnderscoretype: String,
                country: Country,
                language: CatalogsItemsRequestLanguage,
                items: Seq[CatalogsCreativeAssetsBatchItem],
                catalogUnderscoreid: Option[String]
                )

object CatalogsVerticalBatchRequest {
    /**
     * Creates the codec for converting CatalogsVerticalBatchRequest from and to JSON.
     */
    implicit val decoder: Decoder[CatalogsVerticalBatchRequest] = deriveDecoder
    implicit val encoder: ObjectEncoder[CatalogsVerticalBatchRequest] = deriveEncoder
}
