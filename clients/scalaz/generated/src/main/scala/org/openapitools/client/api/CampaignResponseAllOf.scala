package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import CampaignResponseAllOf._

case class CampaignResponseAllOf (
  /* Campaign ID. */
  id: String)

object CampaignResponseAllOf {
  import DateTimeCodecs._

  implicit val CampaignResponseAllOfCodecJson: CodecJson[CampaignResponseAllOf] = CodecJson.derive[CampaignResponseAllOf]
  implicit val CampaignResponseAllOfDecoder: EntityDecoder[CampaignResponseAllOf] = jsonOf[CampaignResponseAllOf]
  implicit val CampaignResponseAllOfEncoder: EntityEncoder[CampaignResponseAllOf] = jsonEncoderOf[CampaignResponseAllOf]
}
