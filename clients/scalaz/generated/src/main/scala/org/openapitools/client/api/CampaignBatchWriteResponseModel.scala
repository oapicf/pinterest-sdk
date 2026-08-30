package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import CampaignBatchWriteResponseModel._

case class CampaignBatchWriteResponseModel (
  items: List[CampaignBatchItem])

object CampaignBatchWriteResponseModel {
  import DateTimeCodecs._

  implicit val CampaignBatchWriteResponseModelCodecJson: CodecJson[CampaignBatchWriteResponseModel] = CodecJson.derive[CampaignBatchWriteResponseModel]
  implicit val CampaignBatchWriteResponseModelDecoder: EntityDecoder[CampaignBatchWriteResponseModel] = jsonOf[CampaignBatchWriteResponseModel]
  implicit val CampaignBatchWriteResponseModelEncoder: EntityEncoder[CampaignBatchWriteResponseModel] = jsonEncoderOf[CampaignBatchWriteResponseModel]
}
