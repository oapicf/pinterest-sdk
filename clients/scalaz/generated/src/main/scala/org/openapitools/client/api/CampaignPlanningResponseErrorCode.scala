package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import CampaignPlanningResponseErrorCode._

case class CampaignPlanningResponseErrorCode (
  
object CampaignPlanningResponseErrorCode {
  import DateTimeCodecs._

  implicit val CampaignPlanningResponseErrorCodeCodecJson: CodecJson[CampaignPlanningResponseErrorCode] = CodecJson.derive[CampaignPlanningResponseErrorCode]
  implicit val CampaignPlanningResponseErrorCodeDecoder: EntityDecoder[CampaignPlanningResponseErrorCode] = jsonOf[CampaignPlanningResponseErrorCode]
  implicit val CampaignPlanningResponseErrorCodeEncoder: EntityEncoder[CampaignPlanningResponseErrorCode] = jsonEncoderOf[CampaignPlanningResponseErrorCode]
}
