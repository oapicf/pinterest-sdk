package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import AdsAnalyticsFilterColumn._

case class AdsAnalyticsFilterColumn (
  
object AdsAnalyticsFilterColumn {
  import DateTimeCodecs._

  implicit val AdsAnalyticsFilterColumnCodecJson: CodecJson[AdsAnalyticsFilterColumn] = CodecJson.derive[AdsAnalyticsFilterColumn]
  implicit val AdsAnalyticsFilterColumnDecoder: EntityDecoder[AdsAnalyticsFilterColumn] = jsonOf[AdsAnalyticsFilterColumn]
  implicit val AdsAnalyticsFilterColumnEncoder: EntityEncoder[AdsAnalyticsFilterColumn] = jsonEncoderOf[AdsAnalyticsFilterColumn]
}
