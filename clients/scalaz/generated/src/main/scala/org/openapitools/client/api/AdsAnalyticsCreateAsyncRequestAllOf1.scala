package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import AdsAnalyticsCreateAsyncRequestAllOf1._

case class AdsAnalyticsCreateAsyncRequestAllOf1 (
  /* Metric and entity columns */
  columns: List[ReportingColumnAsync],
/* Level of the report */
  level: MetricsReportingLevel,
/* Specification for formatting report data */
  reportFormat: Option[DataOutputFormat])

object AdsAnalyticsCreateAsyncRequestAllOf1 {
  import DateTimeCodecs._

  implicit val AdsAnalyticsCreateAsyncRequestAllOf1CodecJson: CodecJson[AdsAnalyticsCreateAsyncRequestAllOf1] = CodecJson.derive[AdsAnalyticsCreateAsyncRequestAllOf1]
  implicit val AdsAnalyticsCreateAsyncRequestAllOf1Decoder: EntityDecoder[AdsAnalyticsCreateAsyncRequestAllOf1] = jsonOf[AdsAnalyticsCreateAsyncRequestAllOf1]
  implicit val AdsAnalyticsCreateAsyncRequestAllOf1Encoder: EntityEncoder[AdsAnalyticsCreateAsyncRequestAllOf1] = jsonEncoderOf[AdsAnalyticsCreateAsyncRequestAllOf1]
}
