package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import AdsAnalyticsAdGroupTargetingType._

case class AdsAnalyticsAdGroupTargetingType (
  
object AdsAnalyticsAdGroupTargetingType {
  import DateTimeCodecs._

  implicit val AdsAnalyticsAdGroupTargetingTypeCodecJson: CodecJson[AdsAnalyticsAdGroupTargetingType] = CodecJson.derive[AdsAnalyticsAdGroupTargetingType]
  implicit val AdsAnalyticsAdGroupTargetingTypeDecoder: EntityDecoder[AdsAnalyticsAdGroupTargetingType] = jsonOf[AdsAnalyticsAdGroupTargetingType]
  implicit val AdsAnalyticsAdGroupTargetingTypeEncoder: EntityEncoder[AdsAnalyticsAdGroupTargetingType] = jsonEncoderOf[AdsAnalyticsAdGroupTargetingType]
}
