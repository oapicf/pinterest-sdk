package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.CatalogsRetailBatchRequestItemsInner
import org.openapitools.models.Country
import scala.collection.immutable.Seq

/**
 * A request object that can have multiple operations on a single retail batch
 * @param catalogUnderscoreid Catalog id pertaining to the retail item. If not provided, default to oldest retail catalog
 * @param catalogUnderscoretype 
 * @param country 
 * @param items Array with catalogs item operations
 * @param language We recommend using the CatalogsLocale values.
 */
case class CatalogsRetailBatchRequest(catalogUnderscoreid: Option[String],
                catalogUnderscoretype: String,
                country: Country,
                items: Seq[CatalogsRetailBatchRequestItemsInner],
                language: String
                )

object CatalogsRetailBatchRequest {
    /**
     * Creates the codec for converting CatalogsRetailBatchRequest from and to JSON.
     */
    implicit val decoder: Decoder[CatalogsRetailBatchRequest] = deriveDecoder
    implicit val encoder: ObjectEncoder[CatalogsRetailBatchRequest] = deriveEncoder
}
