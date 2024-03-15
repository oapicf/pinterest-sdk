package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import BulkUpsertRequestCreate._

case class BulkUpsertRequestCreate (
  campaigns: Option[List[CampaignCreateRequest]],
adGroups: Option[List[AdGroupCreateRequest]],
ads: Option[List[AdCreateRequest]],
productGroups: Option[List[ProductGroupPromotionCreateRequest]],
keywords: Option[List[KeywordsRequest]])

object BulkUpsertRequestCreate {
  import DateTimeCodecs._

  implicit val BulkUpsertRequestCreateCodecJson: CodecJson[BulkUpsertRequestCreate] = CodecJson.derive[BulkUpsertRequestCreate]
  implicit val BulkUpsertRequestCreateDecoder: EntityDecoder[BulkUpsertRequestCreate] = jsonOf[BulkUpsertRequestCreate]
  implicit val BulkUpsertRequestCreateEncoder: EntityEncoder[BulkUpsertRequestCreate] = jsonEncoderOf[BulkUpsertRequestCreate]
}
