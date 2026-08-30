package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import CampaignPlanningAdGroupAudienceSize._

case class CampaignPlanningAdGroupAudienceSize (
  /* Lower bound of the audience size estimate. */
  countLower: Option[Integer],
/* Upper bound of the audience size estimate. */
  countUpper: Option[Integer])

object CampaignPlanningAdGroupAudienceSize {
  import DateTimeCodecs._

  implicit val CampaignPlanningAdGroupAudienceSizeCodecJson: CodecJson[CampaignPlanningAdGroupAudienceSize] = CodecJson.derive[CampaignPlanningAdGroupAudienceSize]
  implicit val CampaignPlanningAdGroupAudienceSizeDecoder: EntityDecoder[CampaignPlanningAdGroupAudienceSize] = jsonOf[CampaignPlanningAdGroupAudienceSize]
  implicit val CampaignPlanningAdGroupAudienceSizeEncoder: EntityEncoder[CampaignPlanningAdGroupAudienceSize] = jsonEncoderOf[CampaignPlanningAdGroupAudienceSize]
}
