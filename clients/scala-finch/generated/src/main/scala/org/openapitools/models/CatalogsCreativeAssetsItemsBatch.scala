package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import java.time.ZonedDateTime
import org.openapitools.models.BatchOperationStatus
import org.openapitools.models.CatalogsType
import org.openapitools.models.CreativeAssetsProcessingRecord
import scala.collection.immutable.Seq

/**
 * Object describing the catalogs creative assets items batch
 * @param batchUnderscoreid Id of the catalogs items batch
 * @param createdUnderscoretime Date and time (UTC) of the batch creation: YYYY-MM-DD'T'hh:mm:ss
 * @param completedUnderscoretime Date and time (UTC) of the batch completion: YYYY-MM-DD'T'hh:mm:ss
 * @param status 
 * @param catalogUnderscoretype 
 * @param items Array with the catalogs items processing records part of the catalogs items batch
 */
case class CatalogsCreativeAssetsItemsBatch(batchUnderscoreid: Option[String],
                createdUnderscoretime: Option[ZonedDateTime],
                completedUnderscoretime: Option[ZonedDateTime],
                status: Option[BatchOperationStatus],
                catalogUnderscoretype: CatalogsType,
                items: Option[Seq[CreativeAssetsProcessingRecord]]
                )

object CatalogsCreativeAssetsItemsBatch {
    /**
     * Creates the codec for converting CatalogsCreativeAssetsItemsBatch from and to JSON.
     */
    implicit val decoder: Decoder[CatalogsCreativeAssetsItemsBatch] = deriveDecoder
    implicit val encoder: ObjectEncoder[CatalogsCreativeAssetsItemsBatch] = deriveEncoder
}
