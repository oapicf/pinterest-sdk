package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.BatchOperation
import org.openapitools.models.Country
import org.openapitools.models.ItemUpdateBatchRecord
import scala.collection.immutable.Seq

/**
 * Request object to update catalogs items
 * @param country 
 * @param items Array with catalogs items
 * @param language We recommend using the CatalogsLocale values.
 * @param operation 
 */
case class CatalogsItemsUpdateBatchRequest(country: Country,
                items: Seq[ItemUpdateBatchRecord],
                language: String,
                operation: BatchOperation
                )

object CatalogsItemsUpdateBatchRequest {
    /**
     * Creates the codec for converting CatalogsItemsUpdateBatchRequest from and to JSON.
     */
    implicit val decoder: Decoder[CatalogsItemsUpdateBatchRequest] = deriveDecoder
    implicit val encoder: ObjectEncoder[CatalogsItemsUpdateBatchRequest] = deriveEncoder
}
