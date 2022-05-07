package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import AdsAnalyticsFilterOperator._

case class AdsAnalyticsFilterOperator (
  
object AdsAnalyticsFilterOperator {
  import DateTimeCodecs._

  implicit val AdsAnalyticsFilterOperatorCodecJson: CodecJson[AdsAnalyticsFilterOperator] = CodecJson.derive[AdsAnalyticsFilterOperator]
  implicit val AdsAnalyticsFilterOperatorDecoder: EntityDecoder[AdsAnalyticsFilterOperator] = jsonOf[AdsAnalyticsFilterOperator]
  implicit val AdsAnalyticsFilterOperatorEncoder: EntityEncoder[AdsAnalyticsFilterOperator] = jsonEncoderOf[AdsAnalyticsFilterOperator]
}
