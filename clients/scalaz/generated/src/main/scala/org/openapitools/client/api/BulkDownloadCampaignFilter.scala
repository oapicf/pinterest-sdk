package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import BulkDownloadCampaignFilter._

case class BulkDownloadCampaignFilter (
  campaignStatus: Option[List[SummaryStatus]],
/* Unix UTC timestamp. */
  endTime: Option[String],
/* Campaign name */
  name: Option[String],
objectiveType: Option[List[ConversionObjectiveType]],
/* Unix UTC timestamp. */
  startTime: Option[String])

object BulkDownloadCampaignFilter {
  import DateTimeCodecs._

  implicit val BulkDownloadCampaignFilterCodecJson: CodecJson[BulkDownloadCampaignFilter] = CodecJson.derive[BulkDownloadCampaignFilter]
  implicit val BulkDownloadCampaignFilterDecoder: EntityDecoder[BulkDownloadCampaignFilter] = jsonOf[BulkDownloadCampaignFilter]
  implicit val BulkDownloadCampaignFilterEncoder: EntityEncoder[BulkDownloadCampaignFilter] = jsonEncoderOf[BulkDownloadCampaignFilter]
}
