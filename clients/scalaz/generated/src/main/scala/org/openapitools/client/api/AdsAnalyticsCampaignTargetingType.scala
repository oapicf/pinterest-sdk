package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import AdsAnalyticsCampaignTargetingType._

case class AdsAnalyticsCampaignTargetingType (
  
object AdsAnalyticsCampaignTargetingType {
  import DateTimeCodecs._

  implicit val AdsAnalyticsCampaignTargetingTypeCodecJson: CodecJson[AdsAnalyticsCampaignTargetingType] = CodecJson.derive[AdsAnalyticsCampaignTargetingType]
  implicit val AdsAnalyticsCampaignTargetingTypeDecoder: EntityDecoder[AdsAnalyticsCampaignTargetingType] = jsonOf[AdsAnalyticsCampaignTargetingType]
  implicit val AdsAnalyticsCampaignTargetingTypeEncoder: EntityEncoder[AdsAnalyticsCampaignTargetingType] = jsonEncoderOf[AdsAnalyticsCampaignTargetingType]
}
