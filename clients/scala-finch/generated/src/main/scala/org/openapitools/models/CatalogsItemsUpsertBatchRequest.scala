package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.BatchOperation
import org.openapitools.models.Country
import org.openapitools.models.ItemUpsertBatchRecord
import org.openapitools.models.Language
import scala.collection.immutable.Seq

/**
 * Request object to upsert catalogs items
 * @param country 
 * @param language 
 * @param operation 
 * @param items Array with catalogs items
 */
case class CatalogsItemsUpsertBatchRequest(country: Country,
                language: Language,
                operation: BatchOperation,
                items: Seq[ItemUpsertBatchRecord]
                )

object CatalogsItemsUpsertBatchRequest {
    /**
     * Creates the codec for converting CatalogsItemsUpsertBatchRequest from and to JSON.
     */
    implicit val decoder: Decoder[CatalogsItemsUpsertBatchRequest] = deriveDecoder
    implicit val encoder: ObjectEncoder[CatalogsItemsUpsertBatchRequest] = deriveEncoder
}
