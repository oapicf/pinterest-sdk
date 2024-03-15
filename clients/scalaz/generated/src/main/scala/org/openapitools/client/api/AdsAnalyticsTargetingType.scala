package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import AdsAnalyticsTargetingType._

case class AdsAnalyticsTargetingType (
  
object AdsAnalyticsTargetingType {
  import DateTimeCodecs._

  implicit val AdsAnalyticsTargetingTypeCodecJson: CodecJson[AdsAnalyticsTargetingType] = CodecJson.derive[AdsAnalyticsTargetingType]
  implicit val AdsAnalyticsTargetingTypeDecoder: EntityDecoder[AdsAnalyticsTargetingType] = jsonOf[AdsAnalyticsTargetingType]
  implicit val AdsAnalyticsTargetingTypeEncoder: EntityEncoder[AdsAnalyticsTargetingType] = jsonEncoderOf[AdsAnalyticsTargetingType]
}
