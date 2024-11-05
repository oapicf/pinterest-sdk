package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.BatchOperation
import org.openapitools.models.CatalogsItemsRequestLanguage
import org.openapitools.models.Country
import org.openapitools.models.ItemDeleteBatchRecord
import scala.collection.immutable.Seq

/**
 * Request object to delete catalogs items
 * @param country 
 * @param language 
 * @param operation 
 * @param items Array with catalogs items
 */
case class CatalogsItemsDeleteBatchRequest(country: Country,
                language: CatalogsItemsRequestLanguage,
                operation: BatchOperation,
                items: Seq[ItemDeleteBatchRecord]
                )

object CatalogsItemsDeleteBatchRequest {
    /**
     * Creates the codec for converting CatalogsItemsDeleteBatchRequest from and to JSON.
     */
    implicit val decoder: Decoder[CatalogsItemsDeleteBatchRequest] = deriveDecoder
    implicit val encoder: ObjectEncoder[CatalogsItemsDeleteBatchRequest] = deriveEncoder
}
