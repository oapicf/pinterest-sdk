package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import BulkCampaignDeliveryEstimatesResponse._

case class BulkCampaignDeliveryEstimatesResponse (
  /* Per-campaign delivery estimate results, in the same order as the request. */
  data: List[BulkCampaignDeliveryEstimatesItem])

object BulkCampaignDeliveryEstimatesResponse {
  import DateTimeCodecs._

  implicit val BulkCampaignDeliveryEstimatesResponseCodecJson: CodecJson[BulkCampaignDeliveryEstimatesResponse] = CodecJson.derive[BulkCampaignDeliveryEstimatesResponse]
  implicit val BulkCampaignDeliveryEstimatesResponseDecoder: EntityDecoder[BulkCampaignDeliveryEstimatesResponse] = jsonOf[BulkCampaignDeliveryEstimatesResponse]
  implicit val BulkCampaignDeliveryEstimatesResponseEncoder: EntityEncoder[BulkCampaignDeliveryEstimatesResponse] = jsonEncoderOf[BulkCampaignDeliveryEstimatesResponse]
}
