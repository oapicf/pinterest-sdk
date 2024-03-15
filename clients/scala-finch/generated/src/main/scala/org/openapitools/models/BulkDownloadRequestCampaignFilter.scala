package org.openapitools.models

import io.circe._
import io.finch.circe._
import io.circe.generic.semiauto._
import io.circe.java8.time._
import org.openapitools._
import org.openapitools.models.CampaignSummaryStatus
import org.openapitools.models.ObjectiveType
import scala.collection.immutable.Seq

/**
 * 
 * @param startUnderscoretime Unix UTC timestamp.
 * @param endUnderscoretime Unix UTC timestamp.
 * @param name Campaign name
 * @param campaignUnderscorestatus 
 * @param objectiveUnderscoretype 
 */
case class BulkDownloadRequestCampaignFilter(startUnderscoretime: Option[String],
                endUnderscoretime: Option[String],
                name: Option[String],
                campaignUnderscorestatus: Option[Seq[CampaignSummaryStatus]],
                objectiveUnderscoretype: Option[Seq[ObjectiveType]]
                )

object BulkDownloadRequestCampaignFilter {
    /**
     * Creates the codec for converting BulkDownloadRequestCampaignFilter from and to JSON.
     */
    implicit val decoder: Decoder[BulkDownloadRequestCampaignFilter] = deriveDecoder
    implicit val encoder: ObjectEncoder[BulkDownloadRequestCampaignFilter] = deriveEncoder
}
