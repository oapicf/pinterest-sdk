package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import DeliveryMetricsResponse._

case class DeliveryMetricsResponse (
  items: Option[List[DeliveryMetricsResponseItemsInner]])

object DeliveryMetricsResponse {
  import DateTimeCodecs._

  implicit val DeliveryMetricsResponseCodecJson: CodecJson[DeliveryMetricsResponse] = CodecJson.derive[DeliveryMetricsResponse]
  implicit val DeliveryMetricsResponseDecoder: EntityDecoder[DeliveryMetricsResponse] = jsonOf[DeliveryMetricsResponse]
  implicit val DeliveryMetricsResponseEncoder: EntityEncoder[DeliveryMetricsResponse] = jsonEncoderOf[DeliveryMetricsResponse]
}
