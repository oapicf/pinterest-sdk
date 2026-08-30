package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import AssetGroupUpdateItemReadOrUpdateItem._

case class AssetGroupUpdateItemReadOrUpdateItem (
  /* Unique identifier of the asset group to update. */
  assetGroupId: String,
/* Asset Group Types. Note: The asset group types are used for user reference and categorization purposes only and do not impact the functionality of the asset group. */
  assetGroupTypes: Option[List[AssetGroupType]],
/* A list of asset ids to add to the asset group. */
  assetsToAdd: Option[List[String]],
/* A list of asset ids to remove from the asset group. */
  assetsToRemove: Option[List[String]],
/* Asset group description. */
  description: Option[String],
/* Asset Group name. */
  name: Option[String])

object AssetGroupUpdateItemReadOrUpdateItem {
  import DateTimeCodecs._

  implicit val AssetGroupUpdateItemReadOrUpdateItemCodecJson: CodecJson[AssetGroupUpdateItemReadOrUpdateItem] = CodecJson.derive[AssetGroupUpdateItemReadOrUpdateItem]
  implicit val AssetGroupUpdateItemReadOrUpdateItemDecoder: EntityDecoder[AssetGroupUpdateItemReadOrUpdateItem] = jsonOf[AssetGroupUpdateItemReadOrUpdateItem]
  implicit val AssetGroupUpdateItemReadOrUpdateItemEncoder: EntityEncoder[AssetGroupUpdateItemReadOrUpdateItem] = jsonEncoderOf[AssetGroupUpdateItemReadOrUpdateItem]
}
