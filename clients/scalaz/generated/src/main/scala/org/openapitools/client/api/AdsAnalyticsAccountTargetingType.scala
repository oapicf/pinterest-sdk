package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import AdsAnalyticsAccountTargetingType._

case class AdsAnalyticsAccountTargetingType (
  
object AdsAnalyticsAccountTargetingType {
  import DateTimeCodecs._

  implicit val AdsAnalyticsAccountTargetingTypeCodecJson: CodecJson[AdsAnalyticsAccountTargetingType] = CodecJson.derive[AdsAnalyticsAccountTargetingType]
  implicit val AdsAnalyticsAccountTargetingTypeDecoder: EntityDecoder[AdsAnalyticsAccountTargetingType] = jsonOf[AdsAnalyticsAccountTargetingType]
  implicit val AdsAnalyticsAccountTargetingTypeEncoder: EntityEncoder[AdsAnalyticsAccountTargetingType] = jsonEncoderOf[AdsAnalyticsAccountTargetingType]
}
