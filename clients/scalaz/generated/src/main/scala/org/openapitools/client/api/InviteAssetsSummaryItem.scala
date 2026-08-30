package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import InviteAssetsSummaryItem._

case class InviteAssetsSummaryItem (
  /* Unique identifier of the asset. */
  id: Option[String],
/* Permission levels member or partner has on an asset. */
  permissions: Option[List[String]])

object InviteAssetsSummaryItem {
  import DateTimeCodecs._

  implicit val InviteAssetsSummaryItemCodecJson: CodecJson[InviteAssetsSummaryItem] = CodecJson.derive[InviteAssetsSummaryItem]
  implicit val InviteAssetsSummaryItemDecoder: EntityDecoder[InviteAssetsSummaryItem] = jsonOf[InviteAssetsSummaryItem]
  implicit val InviteAssetsSummaryItemEncoder: EntityEncoder[InviteAssetsSummaryItem] = jsonEncoderOf[InviteAssetsSummaryItem]
}
