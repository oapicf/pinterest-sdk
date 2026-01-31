package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import CampaignObjectivesFilter._

case class CampaignObjectivesFilter (
  /* List of values for filtering. [\"WEB_SESSIONS\"] in BETA. */
  campaignObjectiveTypes: Option[List[ObjectiveType]])

object CampaignObjectivesFilter {
  import DateTimeCodecs._

  implicit val CampaignObjectivesFilterCodecJson: CodecJson[CampaignObjectivesFilter] = CodecJson.derive[CampaignObjectivesFilter]
  implicit val CampaignObjectivesFilterDecoder: EntityDecoder[CampaignObjectivesFilter] = jsonOf[CampaignObjectivesFilter]
  implicit val CampaignObjectivesFilterEncoder: EntityEncoder[CampaignObjectivesFilter] = jsonEncoderOf[CampaignObjectivesFilter]
}
