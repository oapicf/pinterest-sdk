package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import CampaignAdPreviewCreate._

case class CampaignAdPreviewCreate (
  /* Ad group ID to create a preview record for. */
  adGroupId: String)

object CampaignAdPreviewCreate {
  import DateTimeCodecs._

  implicit val CampaignAdPreviewCreateCodecJson: CodecJson[CampaignAdPreviewCreate] = CodecJson.derive[CampaignAdPreviewCreate]
  implicit val CampaignAdPreviewCreateDecoder: EntityDecoder[CampaignAdPreviewCreate] = jsonOf[CampaignAdPreviewCreate]
  implicit val CampaignAdPreviewCreateEncoder: EntityEncoder[CampaignAdPreviewCreate] = jsonEncoderOf[CampaignAdPreviewCreate]
}
