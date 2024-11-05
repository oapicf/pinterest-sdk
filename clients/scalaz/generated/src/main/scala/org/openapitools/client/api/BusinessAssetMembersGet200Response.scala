package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import BusinessAssetMembersGet200Response._

case class BusinessAssetMembersGet200Response (
  /* List of members with permissions to the asset. */
  items: List[UserSingleAssetBinding],
bookmark: Option[String])

object BusinessAssetMembersGet200Response {
  import DateTimeCodecs._

  implicit val BusinessAssetMembersGet200ResponseCodecJson: CodecJson[BusinessAssetMembersGet200Response] = CodecJson.derive[BusinessAssetMembersGet200Response]
  implicit val BusinessAssetMembersGet200ResponseDecoder: EntityDecoder[BusinessAssetMembersGet200Response] = jsonOf[BusinessAssetMembersGet200Response]
  implicit val BusinessAssetMembersGet200ResponseEncoder: EntityEncoder[BusinessAssetMembersGet200Response] = jsonEncoderOf[BusinessAssetMembersGet200Response]
}
