package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import CampaignId._

case class CampaignId (
  /* Campaign ID. */
  id: Option[String])

object CampaignId {
  import DateTimeCodecs._

  implicit val CampaignIdCodecJson: CodecJson[CampaignId] = CodecJson.derive[CampaignId]
  implicit val CampaignIdDecoder: EntityDecoder[CampaignId] = jsonOf[CampaignId]
  implicit val CampaignIdEncoder: EntityEncoder[CampaignId] = jsonEncoderOf[CampaignId]
}
