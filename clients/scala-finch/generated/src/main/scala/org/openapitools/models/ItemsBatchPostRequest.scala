package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.BatchOperation
import org.openapitools.models.CatalogsItemsBatchRequest
import org.openapitools.models.CatalogsType
import org.openapitools.models.CatalogsVerticalBatchRequest
import org.openapitools.models.Country
import org.openapitools.models.ItemDeleteBatchRecord
import org.openapitools.models.Language
import scala.collection.immutable.Seq

/**
 * 
 * @param catalogUnderscoretype 
 * @param country 
 * @param language 
 * @param items Array with catalogs items
 * @param catalogUnderscoreid Catalog id pertaining to the hotel item. If not provided, default to oldest hotel catalog
 * @param operation 
 */
case class ItemsBatchPostRequest(catalogUnderscoretype: CatalogsType,
                country: Country,
                language: Language,
                items: Seq[ItemDeleteBatchRecord],
                catalogUnderscoreid: Option[String],
                operation: BatchOperation
                )

object ItemsBatchPostRequest {
    /**
     * Creates the codec for converting ItemsBatchPostRequest from and to JSON.
     */
    implicit val decoder: Decoder[ItemsBatchPostRequest] = deriveDecoder
    implicit val encoder: ObjectEncoder[ItemsBatchPostRequest] = deriveEncoder
}
