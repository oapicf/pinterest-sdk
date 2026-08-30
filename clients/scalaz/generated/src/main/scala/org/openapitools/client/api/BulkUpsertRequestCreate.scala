package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import BulkUpsertRequestCreate._

case class BulkUpsertRequestCreate (
  adGroups: Option[List[AdGroupCreateRequest]],
ads: Option[List[AdCreateRequest]],
campaigns: Option[List[CampaignCreateRequest]],
catalogProductGroups: Option[List[BulkUpsertRequestCreateCatalogProductGroupsItems]],
keywords: Option[List[KeywordsRequest]],
labels: Option[List[LabelBulkCreateRequest]],
productGroups: Option[List[ProductGroupPromotionCreateRequest]],
schedules: Option[List[ScheduleCreateRequest]])

object BulkUpsertRequestCreate {
  import DateTimeCodecs._

  implicit val BulkUpsertRequestCreateCodecJson: CodecJson[BulkUpsertRequestCreate] = CodecJson.derive[BulkUpsertRequestCreate]
  implicit val BulkUpsertRequestCreateDecoder: EntityDecoder[BulkUpsertRequestCreate] = jsonOf[BulkUpsertRequestCreate]
  implicit val BulkUpsertRequestCreateEncoder: EntityEncoder[BulkUpsertRequestCreate] = jsonEncoderOf[BulkUpsertRequestCreate]
}
