package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import UpdateAssetGroupResponse._

case class UpdateAssetGroupResponse (
  /* A list of successfully edited asset groups. */
  updatedAssetGroups: Option[List[AssetGroupBinding]],
/* A list of errors associated with the asset groups. Will be returned if there is an error. */
  exceptions: Option[List[UpdateAssetGroupResponseExceptionsInner]])

object UpdateAssetGroupResponse {
  import DateTimeCodecs._

  implicit val UpdateAssetGroupResponseCodecJson: CodecJson[UpdateAssetGroupResponse] = CodecJson.derive[UpdateAssetGroupResponse]
  implicit val UpdateAssetGroupResponseDecoder: EntityDecoder[UpdateAssetGroupResponse] = jsonOf[UpdateAssetGroupResponse]
  implicit val UpdateAssetGroupResponseEncoder: EntityEncoder[UpdateAssetGroupResponse] = jsonEncoderOf[UpdateAssetGroupResponse]
}
