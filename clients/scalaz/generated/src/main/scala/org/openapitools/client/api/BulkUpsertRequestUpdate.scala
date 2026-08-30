package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import BulkUpsertRequestUpdate._

case class BulkUpsertRequestUpdate (
  adGroups: Option[List[AdGroupUpdateRequest]],
ads: Option[List[AdUpdateRequest]],
campaigns: Option[List[CampaignUpdateRequest]],
catalogProductGroups: Option[List[BulkUpsertRequestUpdateCatalogProductGroupsItems]],
keywords: Option[List[KeywordUpdateGenerated]],
labels: Option[List[LabelBulkUpdateRequest]],
productGroups: Option[List[ProductGroupPromotionUpdateRequest]],
schedules: Option[List[ScheduleUpdateRequest]])

object BulkUpsertRequestUpdate {
  import DateTimeCodecs._

  implicit val BulkUpsertRequestUpdateCodecJson: CodecJson[BulkUpsertRequestUpdate] = CodecJson.derive[BulkUpsertRequestUpdate]
  implicit val BulkUpsertRequestUpdateDecoder: EntityDecoder[BulkUpsertRequestUpdate] = jsonOf[BulkUpsertRequestUpdate]
  implicit val BulkUpsertRequestUpdateEncoder: EntityEncoder[BulkUpsertRequestUpdate] = jsonEncoderOf[BulkUpsertRequestUpdate]
}
