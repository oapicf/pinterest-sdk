package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import CampaignAdPreviewCreate200ResponseInner._

case class CampaignAdPreviewCreate200ResponseInner (
  data: CampaignAdPreviewCreate200ResponseInnerData)

object CampaignAdPreviewCreate200ResponseInner {
  import DateTimeCodecs._

  implicit val CampaignAdPreviewCreate200ResponseInnerCodecJson: CodecJson[CampaignAdPreviewCreate200ResponseInner] = CodecJson.derive[CampaignAdPreviewCreate200ResponseInner]
  implicit val CampaignAdPreviewCreate200ResponseInnerDecoder: EntityDecoder[CampaignAdPreviewCreate200ResponseInner] = jsonOf[CampaignAdPreviewCreate200ResponseInner]
  implicit val CampaignAdPreviewCreate200ResponseInnerEncoder: EntityEncoder[CampaignAdPreviewCreate200ResponseInner] = jsonEncoderOf[CampaignAdPreviewCreate200ResponseInner]
}
