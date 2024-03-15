package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import CampaignsList200Response._

case class CampaignsList200Response (
  items: List[CampaignResponse],
bookmark: Option[String])

object CampaignsList200Response {
  import DateTimeCodecs._

  implicit val CampaignsList200ResponseCodecJson: CodecJson[CampaignsList200Response] = CodecJson.derive[CampaignsList200Response]
  implicit val CampaignsList200ResponseDecoder: EntityDecoder[CampaignsList200Response] = jsonOf[CampaignsList200Response]
  implicit val CampaignsList200ResponseEncoder: EntityEncoder[CampaignsList200Response] = jsonEncoderOf[CampaignsList200Response]
}
