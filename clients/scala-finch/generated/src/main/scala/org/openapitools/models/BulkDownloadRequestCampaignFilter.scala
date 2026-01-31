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
 * @param campaignUnderscorestatus 
 * @param endUnderscoretime Unix UTC timestamp.
 * @param name Campaign name
 * @param objectiveUnderscoretype 
 * @param startUnderscoretime Unix UTC timestamp.
 */
case class BulkDownloadRequestCampaignFilter(campaignUnderscorestatus: Option[Seq[CampaignSummaryStatus]],
                endUnderscoretime: Option[String],
                name: Option[String],
                objectiveUnderscoretype: Option[Seq[ObjectiveType]],
                startUnderscoretime: Option[String]
                )

object BulkDownloadRequestCampaignFilter {
    /**
     * Creates the codec for converting BulkDownloadRequestCampaignFilter from and to JSON.
     */
    implicit val decoder: Decoder[BulkDownloadRequestCampaignFilter] = deriveDecoder
    implicit val encoder: ObjectEncoder[BulkDownloadRequestCampaignFilter] = deriveEncoder
}
