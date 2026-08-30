package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import MultiPinsAnalyticsMetricTypesItem._

case class MultiPinsAnalyticsMetricTypesItem (
  
object MultiPinsAnalyticsMetricTypesItem {
  import DateTimeCodecs._

  implicit val MultiPinsAnalyticsMetricTypesItemCodecJson: CodecJson[MultiPinsAnalyticsMetricTypesItem] = CodecJson.derive[MultiPinsAnalyticsMetricTypesItem]
  implicit val MultiPinsAnalyticsMetricTypesItemDecoder: EntityDecoder[MultiPinsAnalyticsMetricTypesItem] = jsonOf[MultiPinsAnalyticsMetricTypesItem]
  implicit val MultiPinsAnalyticsMetricTypesItemEncoder: EntityEncoder[MultiPinsAnalyticsMetricTypesItem] = jsonEncoderOf[MultiPinsAnalyticsMetricTypesItem]
}
