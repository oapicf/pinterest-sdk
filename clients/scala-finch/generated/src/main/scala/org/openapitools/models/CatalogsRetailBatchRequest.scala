package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.CatalogsItemsRequestLanguage
import org.openapitools.models.CatalogsRetailBatchRequestItemsInner
import org.openapitools.models.Country
import scala.collection.immutable.Seq

/**
 * A request object that can have multiple operations on a single retail batch
 * @param catalogUnderscoretype 
 * @param country 
 * @param language 
 * @param items Array with catalogs item operations
 */
case class CatalogsRetailBatchRequest(catalogUnderscoretype: String,
                country: Country,
                language: CatalogsItemsRequestLanguage,
                items: Seq[CatalogsRetailBatchRequestItemsInner]
                )

object CatalogsRetailBatchRequest {
    /**
     * Creates the codec for converting CatalogsRetailBatchRequest from and to JSON.
     */
    implicit val decoder: Decoder[CatalogsRetailBatchRequest] = deriveDecoder
    implicit val encoder: ObjectEncoder[CatalogsRetailBatchRequest] = deriveEncoder
}
