package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import BulkUpsertRequestUpdate._

case class BulkUpsertRequestUpdate (
  campaigns: Option[List[CampaignUpdateRequest]],
adGroups: Option[List[AdGroupUpdateRequest]],
ads: Option[List[AdUpdateRequest]],
productGroups: Option[List[ProductGroupPromotionUpdateRequest]],
keywords: Option[List[KeywordUpdate]])

object BulkUpsertRequestUpdate {
  import DateTimeCodecs._

  implicit val BulkUpsertRequestUpdateCodecJson: CodecJson[BulkUpsertRequestUpdate] = CodecJson.derive[BulkUpsertRequestUpdate]
  implicit val BulkUpsertRequestUpdateDecoder: EntityDecoder[BulkUpsertRequestUpdate] = jsonOf[BulkUpsertRequestUpdate]
  implicit val BulkUpsertRequestUpdateEncoder: EntityEncoder[BulkUpsertRequestUpdate] = jsonEncoderOf[BulkUpsertRequestUpdate]
}
