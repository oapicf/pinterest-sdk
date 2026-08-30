package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import CampaignDeliveryEstimatesResponse._

case class CampaignDeliveryEstimatesResponse (
  /* Estimated curves. Each curve will pertain to a single estimation type. */
  curves: Option[List[CampaignPlanningCurveEstimate]],
derivedMetrics: Option[CampaignDeliveryEstimatesDerivedMetrics],
/* Maximum potential spend estimate. */
  maxPotentialSpend: Option[Integer])

object CampaignDeliveryEstimatesResponse {
  import DateTimeCodecs._

  implicit val CampaignDeliveryEstimatesResponseCodecJson: CodecJson[CampaignDeliveryEstimatesResponse] = CodecJson.derive[CampaignDeliveryEstimatesResponse]
  implicit val CampaignDeliveryEstimatesResponseDecoder: EntityDecoder[CampaignDeliveryEstimatesResponse] = jsonOf[CampaignDeliveryEstimatesResponse]
  implicit val CampaignDeliveryEstimatesResponseEncoder: EntityEncoder[CampaignDeliveryEstimatesResponse] = jsonEncoderOf[CampaignDeliveryEstimatesResponse]
}
