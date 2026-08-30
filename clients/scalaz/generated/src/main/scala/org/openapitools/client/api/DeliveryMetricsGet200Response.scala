package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import DeliveryMetricsGet200Response._

case class DeliveryMetricsGet200Response (
  items: List[DeliveryMetricsResponseItemsItems])

object DeliveryMetricsGet200Response {
  import DateTimeCodecs._

  implicit val DeliveryMetricsGet200ResponseCodecJson: CodecJson[DeliveryMetricsGet200Response] = CodecJson.derive[DeliveryMetricsGet200Response]
  implicit val DeliveryMetricsGet200ResponseDecoder: EntityDecoder[DeliveryMetricsGet200Response] = jsonOf[DeliveryMetricsGet200Response]
  implicit val DeliveryMetricsGet200ResponseEncoder: EntityEncoder[DeliveryMetricsGet200Response] = jsonEncoderOf[DeliveryMetricsGet200Response]
}
