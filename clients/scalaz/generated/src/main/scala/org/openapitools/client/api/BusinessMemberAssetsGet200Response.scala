package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import BusinessMemberAssetsGet200Response._

case class BusinessMemberAssetsGet200Response (
  /* List asset permissions the given member was granted. */
  items: List[AssetIdPermissions],
bookmark: Option[String])

object BusinessMemberAssetsGet200Response {
  import DateTimeCodecs._

  implicit val BusinessMemberAssetsGet200ResponseCodecJson: CodecJson[BusinessMemberAssetsGet200Response] = CodecJson.derive[BusinessMemberAssetsGet200Response]
  implicit val BusinessMemberAssetsGet200ResponseDecoder: EntityDecoder[BusinessMemberAssetsGet200Response] = jsonOf[BusinessMemberAssetsGet200Response]
  implicit val BusinessMemberAssetsGet200ResponseEncoder: EntityEncoder[BusinessMemberAssetsGet200Response] = jsonEncoderOf[BusinessMemberAssetsGet200Response]
}
