package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import CampaignPlanningResponseError._

case class CampaignPlanningResponseError (
  code: Option[CampaignPlanningResponseErrorCode],
/* Human-readable error message. */
  message: Option[String])

object CampaignPlanningResponseError {
  import DateTimeCodecs._

  implicit val CampaignPlanningResponseErrorCodecJson: CodecJson[CampaignPlanningResponseError] = CodecJson.derive[CampaignPlanningResponseError]
  implicit val CampaignPlanningResponseErrorDecoder: EntityDecoder[CampaignPlanningResponseError] = jsonOf[CampaignPlanningResponseError]
  implicit val CampaignPlanningResponseErrorEncoder: EntityEncoder[CampaignPlanningResponseError] = jsonEncoderOf[CampaignPlanningResponseError]
}
