package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import CampaignAdPreviewCreate200ResponseInnerDataOneOf._

case class CampaignAdPreviewCreate200ResponseInnerDataOneOf (
  exceptions: Error)

object CampaignAdPreviewCreate200ResponseInnerDataOneOf {
  import DateTimeCodecs._

  implicit val CampaignAdPreviewCreate200ResponseInnerDataOneOfCodecJson: CodecJson[CampaignAdPreviewCreate200ResponseInnerDataOneOf] = CodecJson.derive[CampaignAdPreviewCreate200ResponseInnerDataOneOf]
  implicit val CampaignAdPreviewCreate200ResponseInnerDataOneOfDecoder: EntityDecoder[CampaignAdPreviewCreate200ResponseInnerDataOneOf] = jsonOf[CampaignAdPreviewCreate200ResponseInnerDataOneOf]
  implicit val CampaignAdPreviewCreate200ResponseInnerDataOneOfEncoder: EntityEncoder[CampaignAdPreviewCreate200ResponseInnerDataOneOf] = jsonEncoderOf[CampaignAdPreviewCreate200ResponseInnerDataOneOf]
}
