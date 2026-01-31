package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import java.time.ZonedDateTime
import org.openapitools.models.BatchOperationStatus
import org.openapitools.models.CatalogsType
import org.openapitools.models.ItemProcessingRecord
import scala.collection.immutable.Seq

/**
 * Object describing the catalogs retail items batch
 * @param batchUnderscoreid Id of the catalogs items batch
 * @param catalogUnderscoretype 
 * @param completedUnderscoretime Date and time (UTC) of the batch completion: YYYY-MM-DD'T'hh:mm:ss
 * @param createdUnderscoretime Date and time (UTC) of the batch creation: YYYY-MM-DD'T'hh:mm:ss. If null, batch creation was skipped due to a recent duplicate ingestion.
 * @param items Array with the catalogs items processing records part of the catalogs items batch
 * @param status 
 */
case class CatalogsRetailItemsBatch(batchUnderscoreid: Option[String],
                catalogUnderscoretype: CatalogsType,
                completedUnderscoretime: Option[ZonedDateTime],
                createdUnderscoretime: ZonedDateTime,
                items: Option[Seq[ItemProcessingRecord]],
                status: Option[BatchOperationStatus]
                )

object CatalogsRetailItemsBatch {
    /**
     * Creates the codec for converting CatalogsRetailItemsBatch from and to JSON.
     */
    implicit val decoder: Decoder[CatalogsRetailItemsBatch] = deriveDecoder
    implicit val encoder: ObjectEncoder[CatalogsRetailItemsBatch] = deriveEncoder
}
