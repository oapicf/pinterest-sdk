package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.BatchOperation
import org.openapitools.models.Country
import org.openapitools.models.ItemDeleteBatchRecord
import scala.collection.immutable.Seq

/**
 * Request object to delete catalogs items
 * @param country 
 * @param items Array with catalogs items
 * @param language We recommend using the CatalogsLocale values.
 * @param operation 
 */
case class CatalogsItemsDeleteBatchRequest(country: Country,
                items: Seq[ItemDeleteBatchRecord],
                language: String,
                operation: BatchOperation
                )

object CatalogsItemsDeleteBatchRequest {
    /**
     * Creates the codec for converting CatalogsItemsDeleteBatchRequest from and to JSON.
     */
    implicit val decoder: Decoder[CatalogsItemsDeleteBatchRequest] = deriveDecoder
    implicit val encoder: ObjectEncoder[CatalogsItemsDeleteBatchRequest] = deriveEncoder
}
