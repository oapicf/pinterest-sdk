package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.CatalogsHotelBatchItem
import org.openapitools.models.CatalogsHotelBatchRequest
import org.openapitools.models.CatalogsRetailBatchRequest
import org.openapitools.models.CatalogsType
import org.openapitools.models.Country
import org.openapitools.models.Language
import scala.collection.immutable.Seq

/**
 * A request object that can have multiple operations on a single batch
 * @param catalogUnderscoretype 
 * @param country 
 * @param language 
 * @param items Array with catalogs item operations
 * @param catalogUnderscoreid Catalog id pertaining to the hotel item. If not provided, default to oldest hotel catalog
 */
case class CatalogsVerticalBatchRequest(catalogUnderscoretype: CatalogsType,
                country: Country,
                language: Language,
                items: Seq[CatalogsHotelBatchItem],
                catalogUnderscoreid: Option[String]
                )

object CatalogsVerticalBatchRequest {
    /**
     * Creates the codec for converting CatalogsVerticalBatchRequest from and to JSON.
     */
    implicit val decoder: Decoder[CatalogsVerticalBatchRequest] = deriveDecoder
    implicit val encoder: ObjectEncoder[CatalogsVerticalBatchRequest] = deriveEncoder
}
