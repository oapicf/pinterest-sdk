package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import UpdateMemberAssetResultItem._

case class UpdateMemberAssetResultItem (
  response: Option[UsersForIndividualAssetResponse])

object UpdateMemberAssetResultItem {
  import DateTimeCodecs._

  implicit val UpdateMemberAssetResultItemCodecJson: CodecJson[UpdateMemberAssetResultItem] = CodecJson.derive[UpdateMemberAssetResultItem]
  implicit val UpdateMemberAssetResultItemDecoder: EntityDecoder[UpdateMemberAssetResultItem] = jsonOf[UpdateMemberAssetResultItem]
  implicit val UpdateMemberAssetResultItemEncoder: EntityEncoder[UpdateMemberAssetResultItem] = jsonEncoderOf[UpdateMemberAssetResultItem]
}
