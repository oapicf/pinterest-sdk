package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import CampaignCreateResponse._

case class CampaignCreateResponse (
  items: Option[List[CampaignCreateResponseItem]])

object CampaignCreateResponse {
  import DateTimeCodecs._

  implicit val CampaignCreateResponseCodecJson: CodecJson[CampaignCreateResponse] = CodecJson.derive[CampaignCreateResponse]
  implicit val CampaignCreateResponseDecoder: EntityDecoder[CampaignCreateResponse] = jsonOf[CampaignCreateResponse]
  implicit val CampaignCreateResponseEncoder: EntityEncoder[CampaignCreateResponse] = jsonEncoderOf[CampaignCreateResponse]
}
