package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import CampaignResponseAllOf1._

case class CampaignResponseAllOf1 (
  objectiveType: Option[ObjectiveType],
/* Campaign creation time. Unix timestamp in seconds. */
  createdTime: Option[Integer],
/* UTC timestamp. Last update time. */
  updatedTime: Option[Integer],
/* Always \"campaign\". */
  `type`: Option[String])

object CampaignResponseAllOf1 {
  import DateTimeCodecs._

  implicit val CampaignResponseAllOf1CodecJson: CodecJson[CampaignResponseAllOf1] = CodecJson.derive[CampaignResponseAllOf1]
  implicit val CampaignResponseAllOf1Decoder: EntityDecoder[CampaignResponseAllOf1] = jsonOf[CampaignResponseAllOf1]
  implicit val CampaignResponseAllOf1Encoder: EntityEncoder[CampaignResponseAllOf1] = jsonEncoderOf[CampaignResponseAllOf1]
}
