package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import AssetGroupModificationReadOrUpdate._

case class AssetGroupModificationReadOrUpdate (
  /* A list of asset groups and the data that will be used to update them. */
  assetGroupsToUpdate: Option[List[AssetGroupUpdateItemReadOrUpdateItem]],
/* A list of errors associated with the asset groups. Will be returned if there is an error. */
  exceptions: Option[List[AssetGroupUpdateError]],
/* A list of successfully edited asset groups. */
  updatedAssetGroups: Option[List[AssetGroupBinding]])

object AssetGroupModificationReadOrUpdate {
  import DateTimeCodecs._

  implicit val AssetGroupModificationReadOrUpdateCodecJson: CodecJson[AssetGroupModificationReadOrUpdate] = CodecJson.derive[AssetGroupModificationReadOrUpdate]
  implicit val AssetGroupModificationReadOrUpdateDecoder: EntityDecoder[AssetGroupModificationReadOrUpdate] = jsonOf[AssetGroupModificationReadOrUpdate]
  implicit val AssetGroupModificationReadOrUpdateEncoder: EntityEncoder[AssetGroupModificationReadOrUpdate] = jsonEncoderOf[AssetGroupModificationReadOrUpdate]
}
