package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import PinsAnalyticsMetricTypesParameterInner._

case class PinsAnalyticsMetricTypesParameterInner (
  
object PinsAnalyticsMetricTypesParameterInner {
  import DateTimeCodecs._

  implicit val PinsAnalyticsMetricTypesParameterInnerCodecJson: CodecJson[PinsAnalyticsMetricTypesParameterInner] = CodecJson.derive[PinsAnalyticsMetricTypesParameterInner]
  implicit val PinsAnalyticsMetricTypesParameterInnerDecoder: EntityDecoder[PinsAnalyticsMetricTypesParameterInner] = jsonOf[PinsAnalyticsMetricTypesParameterInner]
  implicit val PinsAnalyticsMetricTypesParameterInnerEncoder: EntityEncoder[PinsAnalyticsMetricTypesParameterInner] = jsonEncoderOf[PinsAnalyticsMetricTypesParameterInner]
}
