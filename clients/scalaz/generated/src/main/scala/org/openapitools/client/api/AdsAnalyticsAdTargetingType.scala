package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import AdsAnalyticsAdTargetingType._

case class AdsAnalyticsAdTargetingType (
  
object AdsAnalyticsAdTargetingType {
  import DateTimeCodecs._

  implicit val AdsAnalyticsAdTargetingTypeCodecJson: CodecJson[AdsAnalyticsAdTargetingType] = CodecJson.derive[AdsAnalyticsAdTargetingType]
  implicit val AdsAnalyticsAdTargetingTypeDecoder: EntityDecoder[AdsAnalyticsAdTargetingType] = jsonOf[AdsAnalyticsAdTargetingType]
  implicit val AdsAnalyticsAdTargetingTypeEncoder: EntityEncoder[AdsAnalyticsAdTargetingType] = jsonEncoderOf[AdsAnalyticsAdTargetingType]
}
