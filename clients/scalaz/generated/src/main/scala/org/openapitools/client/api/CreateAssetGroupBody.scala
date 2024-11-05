package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import CreateAssetGroupBody._

case class CreateAssetGroupBody (
  /* Asset Group name */
  assetGroupName: String,
/* Asset group description */
  assetGroupDescription: String,
/* Asset Group Types. Note: The asset group types are used for user reference and categorization purposes only and do not impact the functionality of the asset group. */
  assetGroupTypes: List[AssetGroupType])

object CreateAssetGroupBody {
  import DateTimeCodecs._

  implicit val CreateAssetGroupBodyCodecJson: CodecJson[CreateAssetGroupBody] = CodecJson.derive[CreateAssetGroupBody]
  implicit val CreateAssetGroupBodyDecoder: EntityDecoder[CreateAssetGroupBody] = jsonOf[CreateAssetGroupBody]
  implicit val CreateAssetGroupBodyEncoder: EntityEncoder[CreateAssetGroupBody] = jsonEncoderOf[CreateAssetGroupBody]
}
