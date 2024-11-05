package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import AssetGroupBinding._

case class AssetGroupBinding (
  /* Asset Group ID. */
  id: Option[String],
/* Asset Group name */
  assetGroupName: Option[String],
/* Asset group description */
  assetGroupDescription: Option[String],
/* Asset group types */
  assetGroupTypes: Option[List[String]],
/* A list of ad account IDs under the asset group */
  adAccountsIds: Option[List[String]],
/* A list of profile IDs under asset group */
  profilesIds: Option[List[String]],
/* The creation time of the asset group */
  createdTime: Option[Integer],
/* The last update time of the asset group */
  updatedTime: Option[Integer],
/* The data of the business that owns the asset group. */
  owner: Option[BusinessAccessUserSummary],
/* The data of the user that created the asset group. */
  createdBy: Option[BusinessAccessUserSummary])

object AssetGroupBinding {
  import DateTimeCodecs._

  implicit val AssetGroupBindingCodecJson: CodecJson[AssetGroupBinding] = CodecJson.derive[AssetGroupBinding]
  implicit val AssetGroupBindingDecoder: EntityDecoder[AssetGroupBinding] = jsonOf[AssetGroupBinding]
  implicit val AssetGroupBindingEncoder: EntityEncoder[AssetGroupBinding] = jsonEncoderOf[AssetGroupBinding]
}
