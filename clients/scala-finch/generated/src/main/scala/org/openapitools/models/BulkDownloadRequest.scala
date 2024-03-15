package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.BulkDownloadRequestCampaignFilter
import org.openapitools.models.BulkEntityType
import org.openapitools.models.BulkOutputFormat
import scala.collection.immutable.Seq

/**
 * Ad entities to get in bulk request.
 * @param entityUnderscoretypes All entity types specified will be downloaded. Fewer types result in faster downloads.
 * @param entityUnderscoreids All entities specified by these IDs as well as their children and grandchildren will be downloaded if the entity type is one of the types requested to be downloaded.
 * @param updatedUnderscoresince Unix UTC timestamp to retrieve all entities that have changed since this time.
 * @param campaignUnderscorefilter 
 * @param outputUnderscoreformat 
 */
case class BulkDownloadRequest(entityUnderscoretypes: Option[Seq[BulkEntityType]],
                entityUnderscoreids: Option[Seq[String]],
                updatedUnderscoresince: Option[String],
                campaignUnderscorefilter: Option[BulkDownloadRequestCampaignFilter],
                outputUnderscoreformat: Option[BulkOutputFormat]
                )

object BulkDownloadRequest {
    /**
     * Creates the codec for converting BulkDownloadRequest from and to JSON.
     */
    implicit val decoder: Decoder[BulkDownloadRequest] = deriveDecoder
    implicit val encoder: ObjectEncoder[BulkDownloadRequest] = deriveEncoder
}
