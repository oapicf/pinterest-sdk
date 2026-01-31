package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.BatchOperation
import org.openapitools.models.Country
import org.openapitools.models.ItemDeleteDiscontinuedBatchRecord
import scala.collection.immutable.Seq

/**
 * Request object to discontinue catalogs items
 * @param country 
 * @param language We recommend using the CatalogsLocale values.
 * @param operation 
 * @param items Array with catalogs items
 */
case class CatalogsItemsDeleteDiscontinuedBatchRequest(country: Country,
                language: String,
                operation: BatchOperation,
                items: Seq[ItemDeleteDiscontinuedBatchRecord]
                )

object CatalogsItemsDeleteDiscontinuedBatchRequest {
    /**
     * Creates the codec for converting CatalogsItemsDeleteDiscontinuedBatchRequest from and to JSON.
     */
    implicit val decoder: Decoder[CatalogsItemsDeleteDiscontinuedBatchRequest] = deriveDecoder
    implicit val encoder: ObjectEncoder[CatalogsItemsDeleteDiscontinuedBatchRequest] = deriveEncoder
}
