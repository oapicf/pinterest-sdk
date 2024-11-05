package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import InviteAssetsSummaryAdAccountsInner._

case class InviteAssetsSummaryAdAccountsInner (
  /* Unique identifier of a business ad account. */
  id: Option[String],
/* Permission levels member or partner has on an asset. */
  permissions: Option[List[String]])

object InviteAssetsSummaryAdAccountsInner {
  import DateTimeCodecs._

  implicit val InviteAssetsSummaryAdAccountsInnerCodecJson: CodecJson[InviteAssetsSummaryAdAccountsInner] = CodecJson.derive[InviteAssetsSummaryAdAccountsInner]
  implicit val InviteAssetsSummaryAdAccountsInnerDecoder: EntityDecoder[InviteAssetsSummaryAdAccountsInner] = jsonOf[InviteAssetsSummaryAdAccountsInner]
  implicit val InviteAssetsSummaryAdAccountsInnerEncoder: EntityEncoder[InviteAssetsSummaryAdAccountsInner] = jsonEncoderOf[InviteAssetsSummaryAdAccountsInner]
}
