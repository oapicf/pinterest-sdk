package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import CustomConversionEventMetrics._

case class CustomConversionEventMetrics (
  customEventMetricsType: AdeColumnType,
/* Name of the advertiser-defined custom conversion event */
  customEventName: String)

object CustomConversionEventMetrics {
  import DateTimeCodecs._

  implicit val CustomConversionEventMetricsCodecJson: CodecJson[CustomConversionEventMetrics] = CodecJson.derive[CustomConversionEventMetrics]
  implicit val CustomConversionEventMetricsDecoder: EntityDecoder[CustomConversionEventMetrics] = jsonOf[CustomConversionEventMetrics]
  implicit val CustomConversionEventMetricsEncoder: EntityEncoder[CustomConversionEventMetrics] = jsonEncoderOf[CustomConversionEventMetrics]
}
