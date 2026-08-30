package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import CampaignBatchItem._

case class CampaignBatchItem (
  /* Campaign data on success. */
  data: Option[CampaignBatchResponseData],
/* Exceptions on failure. */
  exceptions: Option[List[Exception]])

object CampaignBatchItem {
  import DateTimeCodecs._

  implicit val CampaignBatchItemCodecJson: CodecJson[CampaignBatchItem] = CodecJson.derive[CampaignBatchItem]
  implicit val CampaignBatchItemDecoder: EntityDecoder[CampaignBatchItem] = jsonOf[CampaignBatchItem]
  implicit val CampaignBatchItemEncoder: EntityEncoder[CampaignBatchItem] = jsonEncoderOf[CampaignBatchItem]
}
