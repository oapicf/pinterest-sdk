package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime

import java.util.HashMap

import CampaignAudienceMultipliers._

case class CampaignAudienceMultipliers (
  AUDIENCE_ID: Option[String])

object CampaignAudienceMultipliers {
  import DateTimeCodecs._

  implicit val CampaignAudienceMultipliersCodecJson: CodecJson[CampaignAudienceMultipliers] = CodecJson.derive[CampaignAudienceMultipliers]
  implicit val CampaignAudienceMultipliersDecoder: EntityDecoder[CampaignAudienceMultipliers] = jsonOf[CampaignAudienceMultipliers]
  implicit val CampaignAudienceMultipliersEncoder: EntityEncoder[CampaignAudienceMultipliers] = jsonEncoderOf[CampaignAudienceMultipliers]
}
