package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import MetricsResponseDataItems._

case class MetricsResponseDataItems (
  /* Metrics object containing the requested metric columns and their values. The keys are metric names (e.g., AD_GROUP_ID, DATE, SPEND_IN_DOLLAR) and values are the metric values (strings or numbers). */
  metrics: Any,
/* The targeting type for this data item (e.g., KEYWORD, APPTYPE, GENDER) */
  targetingType: String,
/* The targeting value for this data item (e.g., 'christmas decor ideas', 'iphone', 'female') */
  targetingValue: String)

object MetricsResponseDataItems {
  import DateTimeCodecs._

  implicit val MetricsResponseDataItemsCodecJson: CodecJson[MetricsResponseDataItems] = CodecJson.derive[MetricsResponseDataItems]
  implicit val MetricsResponseDataItemsDecoder: EntityDecoder[MetricsResponseDataItems] = jsonOf[MetricsResponseDataItems]
  implicit val MetricsResponseDataItemsEncoder: EntityEncoder[MetricsResponseDataItems] = jsonEncoderOf[MetricsResponseDataItems]
}
