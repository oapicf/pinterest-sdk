package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import java.time.ZonedDateTime
import org.openapitools.models.BatchOperationStatus
import org.openapitools.models.CatalogsHotelItemsBatch
import org.openapitools.models.CatalogsRetailItemsBatch
import org.openapitools.models.CatalogsType
import org.openapitools.models.HotelProcessingRecord
import scala.collection.immutable.Seq

/**
 * Object describing the catalogs items batch
 * @param catalogUnderscoretype 
 * @param batchUnderscoreid Id of the catalogs items batch
 * @param createdUnderscoretime Time of the batch creation: YYYY-MM-DD'T'hh:mm:ssTZD
 * @param completedUnderscoretime Time of the batch completion: YYYY-MM-DD'T'hh:mm:ssTZD
 * @param status 
 * @param items Array with the catalogs items processing records part of the catalogs items batch
 */
case class CatalogsItemsBatch(catalogUnderscoretype: CatalogsType,
                batchUnderscoreid: Option[String],
                createdUnderscoretime: Option[ZonedDateTime],
                completedUnderscoretime: Option[ZonedDateTime],
                status: Option[BatchOperationStatus],
                items: Option[Seq[HotelProcessingRecord]]
                )

object CatalogsItemsBatch {
    /**
     * Creates the codec for converting CatalogsItemsBatch from and to JSON.
     */
    implicit val decoder: Decoder[CatalogsItemsBatch] = deriveDecoder
    implicit val encoder: ObjectEncoder[CatalogsItemsBatch] = deriveEncoder
}
