package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import AssetGroupBinding._

case class AssetGroupBinding (
  /* A list of ad account IDs under the asset group */
  adAccountsIds: List[String],
/* Asset group description */
  assetGroupDescription: String,
/* Asset Group name */
  assetGroupName: String,
/* Asset group types */
  assetGroupTypes: List[String],
/* A list of catalog IDs under asset group */
  catalogsIds: List[String],
/* The data of the user that created the asset group. */
  createdBy: BusinessAccessUserSummary,
/* The creation time of the asset group */
  createdTime: Integer,
/* Asset Group ID. */
  id: String,
/* The data of the business that owns the asset group. */
  owner: BusinessAccessUserSummary,
/* A list of profile IDs under asset group */
  profilesIds: List[String],
/* The last update time of the asset group */
  updatedTime: Integer)

object AssetGroupBinding {
  import DateTimeCodecs._

  implicit val AssetGroupBindingCodecJson: CodecJson[AssetGroupBinding] = CodecJson.derive[AssetGroupBinding]
  implicit val AssetGroupBindingDecoder: EntityDecoder[AssetGroupBinding] = jsonOf[AssetGroupBinding]
  implicit val AssetGroupBindingEncoder: EntityEncoder[AssetGroupBinding] = jsonEncoderOf[AssetGroupBinding]
}
