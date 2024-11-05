package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.BatchOperation
import org.openapitools.models.CatalogsItemsCreateBatchRequest
import org.openapitools.models.CatalogsItemsDeleteBatchRequest
import org.openapitools.models.CatalogsItemsDeleteDiscontinuedBatchRequest
import org.openapitools.models.CatalogsItemsRequestLanguage
import org.openapitools.models.CatalogsItemsUpdateBatchRequest
import org.openapitools.models.CatalogsItemsUpsertBatchRequest
import org.openapitools.models.Country
import org.openapitools.models.ItemDeleteBatchRecord
import scala.collection.immutable.Seq

/**
 * Request object of catalogs items batch
 * @param country 
 * @param language 
 * @param operation 
 * @param items Array with catalogs items
 */
case class CatalogsItemsBatchRequest(country: Country,
                language: CatalogsItemsRequestLanguage,
                operation: BatchOperation,
                items: Seq[ItemDeleteBatchRecord]
                )

object CatalogsItemsBatchRequest {
    /**
     * Creates the codec for converting CatalogsItemsBatchRequest from and to JSON.
     */
    implicit val decoder: Decoder[CatalogsItemsBatchRequest] = deriveDecoder
    implicit val encoder: ObjectEncoder[CatalogsItemsBatchRequest] = deriveEncoder
}
