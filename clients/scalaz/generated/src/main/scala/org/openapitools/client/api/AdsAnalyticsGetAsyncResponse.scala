package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import AdsAnalyticsGetAsyncResponse._

case class AdsAnalyticsGetAsyncResponse (
  reportStatus: Option[String],
url: Option[String],
size: Option[BigDecimal])

object AdsAnalyticsGetAsyncResponse {
  import DateTimeCodecs._

  implicit val AdsAnalyticsGetAsyncResponseCodecJson: CodecJson[AdsAnalyticsGetAsyncResponse] = CodecJson.derive[AdsAnalyticsGetAsyncResponse]
  implicit val AdsAnalyticsGetAsyncResponseDecoder: EntityDecoder[AdsAnalyticsGetAsyncResponse] = jsonOf[AdsAnalyticsGetAsyncResponse]
  implicit val AdsAnalyticsGetAsyncResponseEncoder: EntityEncoder[AdsAnalyticsGetAsyncResponse] = jsonEncoderOf[AdsAnalyticsGetAsyncResponse]
}
