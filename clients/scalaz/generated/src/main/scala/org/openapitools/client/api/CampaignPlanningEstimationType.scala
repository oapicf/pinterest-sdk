package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import CampaignPlanningEstimationType._

case class CampaignPlanningEstimationType (
  
object CampaignPlanningEstimationType {
  import DateTimeCodecs._

  implicit val CampaignPlanningEstimationTypeCodecJson: CodecJson[CampaignPlanningEstimationType] = CodecJson.derive[CampaignPlanningEstimationType]
  implicit val CampaignPlanningEstimationTypeDecoder: EntityDecoder[CampaignPlanningEstimationType] = jsonOf[CampaignPlanningEstimationType]
  implicit val CampaignPlanningEstimationTypeEncoder: EntityEncoder[CampaignPlanningEstimationType] = jsonEncoderOf[CampaignPlanningEstimationType]
}
