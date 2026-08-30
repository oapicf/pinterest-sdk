package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import AssetGroupDeletion._

case class AssetGroupDeletion (
  deletedAssetGroups: Option[List[String]],
exceptions: Option[List[AssetGroupDeleteError]])

object AssetGroupDeletion {
  import DateTimeCodecs._

  implicit val AssetGroupDeletionCodecJson: CodecJson[AssetGroupDeletion] = CodecJson.derive[AssetGroupDeletion]
  implicit val AssetGroupDeletionDecoder: EntityDecoder[AssetGroupDeletion] = jsonOf[AssetGroupDeletion]
  implicit val AssetGroupDeletionEncoder: EntityEncoder[AssetGroupDeletion] = jsonEncoderOf[AssetGroupDeletion]
}
