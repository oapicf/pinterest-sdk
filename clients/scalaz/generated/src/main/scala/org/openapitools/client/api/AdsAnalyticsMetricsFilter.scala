package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import AdsAnalyticsMetricsFilter._

case class AdsAnalyticsMetricsFilter (
  field: AdsAnalyticsFilterColumn,
operator: AdsAnalyticsFilterOperator,
/* List of values for filtering */
  values: List[BigDecimal])

object AdsAnalyticsMetricsFilter {
  import DateTimeCodecs._

  implicit val AdsAnalyticsMetricsFilterCodecJson: CodecJson[AdsAnalyticsMetricsFilter] = CodecJson.derive[AdsAnalyticsMetricsFilter]
  implicit val AdsAnalyticsMetricsFilterDecoder: EntityDecoder[AdsAnalyticsMetricsFilter] = jsonOf[AdsAnalyticsMetricsFilter]
  implicit val AdsAnalyticsMetricsFilterEncoder: EntityEncoder[AdsAnalyticsMetricsFilter] = jsonEncoderOf[AdsAnalyticsMetricsFilter]
}
