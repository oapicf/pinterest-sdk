package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import CampaignUpdateResponse._

case class CampaignUpdateResponse (
  items: Option[List[CampaignCreateResponseItem]])

object CampaignUpdateResponse {
  import DateTimeCodecs._

  implicit val CampaignUpdateResponseCodecJson: CodecJson[CampaignUpdateResponse] = CodecJson.derive[CampaignUpdateResponse]
  implicit val CampaignUpdateResponseDecoder: EntityDecoder[CampaignUpdateResponse] = jsonOf[CampaignUpdateResponse]
  implicit val CampaignUpdateResponseEncoder: EntityEncoder[CampaignUpdateResponse] = jsonEncoderOf[CampaignUpdateResponse]
}
