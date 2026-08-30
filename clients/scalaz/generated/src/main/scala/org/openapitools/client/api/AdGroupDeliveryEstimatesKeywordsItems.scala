package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import AdGroupDeliveryEstimatesKeywordsItems._

case class AdGroupDeliveryEstimatesKeywordsItems (
  matchType: NullalbleMatchType,
/* Keyword value (120 chars max). */
  value: String)

object AdGroupDeliveryEstimatesKeywordsItems {
  import DateTimeCodecs._

  implicit val AdGroupDeliveryEstimatesKeywordsItemsCodecJson: CodecJson[AdGroupDeliveryEstimatesKeywordsItems] = CodecJson.derive[AdGroupDeliveryEstimatesKeywordsItems]
  implicit val AdGroupDeliveryEstimatesKeywordsItemsDecoder: EntityDecoder[AdGroupDeliveryEstimatesKeywordsItems] = jsonOf[AdGroupDeliveryEstimatesKeywordsItems]
  implicit val AdGroupDeliveryEstimatesKeywordsItemsEncoder: EntityEncoder[AdGroupDeliveryEstimatesKeywordsItems] = jsonEncoderOf[AdGroupDeliveryEstimatesKeywordsItems]
}
