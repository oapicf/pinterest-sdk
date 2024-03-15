package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.BatchOperation
import org.openapitools.models.Country
import org.openapitools.models.ItemCreateBatchRecord
import org.openapitools.models.Language
import scala.collection.immutable.Seq

/**
 * Request object to create catalogs items
 * @param country 
 * @param language 
 * @param operation 
 * @param items Array with catalogs items
 */
case class CatalogsItemsCreateBatchRequest(country: Country,
                language: Language,
                operation: BatchOperation,
                items: Seq[ItemCreateBatchRecord]
                )

object CatalogsItemsCreateBatchRequest {
    /**
     * Creates the codec for converting CatalogsItemsCreateBatchRequest from and to JSON.
     */
    implicit val decoder: Decoder[CatalogsItemsCreateBatchRequest] = deriveDecoder
    implicit val encoder: ObjectEncoder[CatalogsItemsCreateBatchRequest] = deriveEncoder
}
