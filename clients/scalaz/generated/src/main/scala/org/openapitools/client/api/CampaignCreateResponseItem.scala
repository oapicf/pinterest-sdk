package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import CampaignCreateResponseItem._

case class CampaignCreateResponseItem (
  data: Option[CampaignCreateResponseData],
exceptions: Option[List[Exception]])

object CampaignCreateResponseItem {
  import DateTimeCodecs._

  implicit val CampaignCreateResponseItemCodecJson: CodecJson[CampaignCreateResponseItem] = CodecJson.derive[CampaignCreateResponseItem]
  implicit val CampaignCreateResponseItemDecoder: EntityDecoder[CampaignCreateResponseItem] = jsonOf[CampaignCreateResponseItem]
  implicit val CampaignCreateResponseItemEncoder: EntityEncoder[CampaignCreateResponseItem] = jsonEncoderOf[CampaignCreateResponseItem]
}
