package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import BulkDownloadRequestCampaignFilter._

case class BulkDownloadRequestCampaignFilter (
  /* Unix UTC timestamp. */
  startTime: Option[String],
/* Unix UTC timestamp. */
  endTime: Option[String],
/* Campaign name */
  name: Option[String],
campaignStatus: Option[List[CampaignSummaryStatus]],
objectiveType: Option[List[ObjectiveType]])

object BulkDownloadRequestCampaignFilter {
  import DateTimeCodecs._

  implicit val BulkDownloadRequestCampaignFilterCodecJson: CodecJson[BulkDownloadRequestCampaignFilter] = CodecJson.derive[BulkDownloadRequestCampaignFilter]
  implicit val BulkDownloadRequestCampaignFilterDecoder: EntityDecoder[BulkDownloadRequestCampaignFilter] = jsonOf[BulkDownloadRequestCampaignFilter]
  implicit val BulkDownloadRequestCampaignFilterEncoder: EntityEncoder[BulkDownloadRequestCampaignFilter] = jsonEncoderOf[BulkDownloadRequestCampaignFilter]
}
