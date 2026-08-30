package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import CampaignAdPreviewDelete200ResponseInner._

case class CampaignAdPreviewDelete200ResponseInner (
  status: CampaignAdPreviewDelete200ResponseInnerStatus)

object CampaignAdPreviewDelete200ResponseInner {
  import DateTimeCodecs._

  implicit val CampaignAdPreviewDelete200ResponseInnerCodecJson: CodecJson[CampaignAdPreviewDelete200ResponseInner] = CodecJson.derive[CampaignAdPreviewDelete200ResponseInner]
  implicit val CampaignAdPreviewDelete200ResponseInnerDecoder: EntityDecoder[CampaignAdPreviewDelete200ResponseInner] = jsonOf[CampaignAdPreviewDelete200ResponseInner]
  implicit val CampaignAdPreviewDelete200ResponseInnerEncoder: EntityEncoder[CampaignAdPreviewDelete200ResponseInner] = jsonEncoderOf[CampaignAdPreviewDelete200ResponseInner]
}
