package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import CreateAssetAccessRequestBodyAssetRequestsInner._

case class CreateAssetAccessRequestBodyAssetRequestsInner (
  /* Unique identifier of a business partner to request asset access to. */
  partnerId: String,
/* An object mapping asset ids to lists of business permissions. This can be used to setting/requesting permissions on various assets. If accepting an invite or request, this object would be used to grant asset permissions to the member or partner.  */
  assetIdToPermissions: Map[String, List[Permissions]])

object CreateAssetAccessRequestBodyAssetRequestsInner {
  import DateTimeCodecs._

  implicit val CreateAssetAccessRequestBodyAssetRequestsInnerCodecJson: CodecJson[CreateAssetAccessRequestBodyAssetRequestsInner] = CodecJson.derive[CreateAssetAccessRequestBodyAssetRequestsInner]
  implicit val CreateAssetAccessRequestBodyAssetRequestsInnerDecoder: EntityDecoder[CreateAssetAccessRequestBodyAssetRequestsInner] = jsonOf[CreateAssetAccessRequestBodyAssetRequestsInner]
  implicit val CreateAssetAccessRequestBodyAssetRequestsInnerEncoder: EntityEncoder[CreateAssetAccessRequestBodyAssetRequestsInner] = jsonEncoderOf[CreateAssetAccessRequestBodyAssetRequestsInner]
}
