package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import CampaignSummaryStatus._

case class CampaignSummaryStatus (
  
object CampaignSummaryStatus {
  import DateTimeCodecs._

  implicit val CampaignSummaryStatusCodecJson: CodecJson[CampaignSummaryStatus] = CodecJson.derive[CampaignSummaryStatus]
  implicit val CampaignSummaryStatusDecoder: EntityDecoder[CampaignSummaryStatus] = jsonOf[CampaignSummaryStatus]
  implicit val CampaignSummaryStatusEncoder: EntityEncoder[CampaignSummaryStatus] = jsonEncoderOf[CampaignSummaryStatus]
}
