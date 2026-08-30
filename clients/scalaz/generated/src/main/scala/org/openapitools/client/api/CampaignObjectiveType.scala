package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import CampaignObjectiveType._

case class CampaignObjectiveType (
  
object CampaignObjectiveType {
  import DateTimeCodecs._

  implicit val CampaignObjectiveTypeCodecJson: CodecJson[CampaignObjectiveType] = CodecJson.derive[CampaignObjectiveType]
  implicit val CampaignObjectiveTypeDecoder: EntityDecoder[CampaignObjectiveType] = jsonOf[CampaignObjectiveType]
  implicit val CampaignObjectiveTypeEncoder: EntityEncoder[CampaignObjectiveType] = jsonEncoderOf[CampaignObjectiveType]
}
