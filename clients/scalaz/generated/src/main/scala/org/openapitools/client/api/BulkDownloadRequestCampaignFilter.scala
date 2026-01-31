package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import BulkDownloadRequestCampaignFilter._

case class BulkDownloadRequestCampaignFilter (
  campaignStatus: Option[List[CampaignSummaryStatus]],
/* Unix UTC timestamp. */
  endTime: Option[String],
/* Campaign name */
  name: Option[String],
objectiveType: Option[List[ObjectiveType]],
/* Unix UTC timestamp. */
  startTime: Option[String])

object BulkDownloadRequestCampaignFilter {
  import DateTimeCodecs._

  implicit val BulkDownloadRequestCampaignFilterCodecJson: CodecJson[BulkDownloadRequestCampaignFilter] = CodecJson.derive[BulkDownloadRequestCampaignFilter]
  implicit val BulkDownloadRequestCampaignFilterDecoder: EntityDecoder[BulkDownloadRequestCampaignFilter] = jsonOf[BulkDownloadRequestCampaignFilter]
  implicit val BulkDownloadRequestCampaignFilterEncoder: EntityEncoder[BulkDownloadRequestCampaignFilter] = jsonEncoderOf[BulkDownloadRequestCampaignFilter]
}
