package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import BusinessAssetPartnersGet200Response._

case class BusinessAssetPartnersGet200Response (
  /* List of partners with permissions to the asset. */
  items: List[UserSingleAssetBinding],
bookmark: Option[String])

object BusinessAssetPartnersGet200Response {
  import DateTimeCodecs._

  implicit val BusinessAssetPartnersGet200ResponseCodecJson: CodecJson[BusinessAssetPartnersGet200Response] = CodecJson.derive[BusinessAssetPartnersGet200Response]
  implicit val BusinessAssetPartnersGet200ResponseDecoder: EntityDecoder[BusinessAssetPartnersGet200Response] = jsonOf[BusinessAssetPartnersGet200Response]
  implicit val BusinessAssetPartnersGet200ResponseEncoder: EntityEncoder[BusinessAssetPartnersGet200Response] = jsonEncoderOf[BusinessAssetPartnersGet200Response]
}
