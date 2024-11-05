package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import BusinessMembersAssetAccessDeleteRequest._

case class BusinessMembersAssetAccessDeleteRequest (
  /* List of members asset access to be deleted */
  accesses: List[BusinessMembersAssetAccessDeleteRequestAccessesInner])

object BusinessMembersAssetAccessDeleteRequest {
  import DateTimeCodecs._

  implicit val BusinessMembersAssetAccessDeleteRequestCodecJson: CodecJson[BusinessMembersAssetAccessDeleteRequest] = CodecJson.derive[BusinessMembersAssetAccessDeleteRequest]
  implicit val BusinessMembersAssetAccessDeleteRequestDecoder: EntityDecoder[BusinessMembersAssetAccessDeleteRequest] = jsonOf[BusinessMembersAssetAccessDeleteRequest]
  implicit val BusinessMembersAssetAccessDeleteRequestEncoder: EntityEncoder[BusinessMembersAssetAccessDeleteRequest] = jsonEncoderOf[BusinessMembersAssetAccessDeleteRequest]
}
