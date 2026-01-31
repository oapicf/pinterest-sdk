package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import java.time.ZonedDateTime
import org.openapitools.models.BatchOperationStatus
import org.openapitools.models.CatalogsType
import org.openapitools.models.HotelProcessingRecord
import scala.collection.immutable.Seq

/**
 * Object describing the catalogs hotel items batch
 * @param batchUnderscoreid Id of the catalogs items batch
 * @param catalogUnderscoretype 
 * @param completedUnderscoretime Date and time (UTC) of the batch completion: YYYY-MM-DD'T'hh:mm:ss
 * @param createdUnderscoretime Date and time (UTC) of the batch creation: YYYY-MM-DD'T'hh:mm:ss
 * @param items Array with the catalogs items processing records part of the catalogs items batch
 * @param status 
 */
case class CatalogsHotelItemsBatch(batchUnderscoreid: Option[String],
                catalogUnderscoretype: CatalogsType,
                completedUnderscoretime: Option[ZonedDateTime],
                createdUnderscoretime: Option[ZonedDateTime],
                items: Option[Seq[HotelProcessingRecord]],
                status: Option[BatchOperationStatus]
                )

object CatalogsHotelItemsBatch {
    /**
     * Creates the codec for converting CatalogsHotelItemsBatch from and to JSON.
     */
    implicit val decoder: Decoder[CatalogsHotelItemsBatch] = deriveDecoder
    implicit val encoder: ObjectEncoder[CatalogsHotelItemsBatch] = deriveEncoder
}
