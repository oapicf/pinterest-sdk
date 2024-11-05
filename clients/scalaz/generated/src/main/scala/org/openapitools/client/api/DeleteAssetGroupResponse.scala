package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import DeleteAssetGroupResponse._

case class DeleteAssetGroupResponse (
  /* A list of ids of successfully deleted asset groups. */
  deletedAssetGroups: Option[List[String]],
/* A list of errors associated with the asset groups. Will be returned if there is an error. */
  exceptions: Option[List[DeleteAssetGroupResponseExceptionsInner]])

object DeleteAssetGroupResponse {
  import DateTimeCodecs._

  implicit val DeleteAssetGroupResponseCodecJson: CodecJson[DeleteAssetGroupResponse] = CodecJson.derive[DeleteAssetGroupResponse]
  implicit val DeleteAssetGroupResponseDecoder: EntityDecoder[DeleteAssetGroupResponse] = jsonOf[DeleteAssetGroupResponse]
  implicit val DeleteAssetGroupResponseEncoder: EntityEncoder[DeleteAssetGroupResponse] = jsonEncoderOf[DeleteAssetGroupResponse]
}
