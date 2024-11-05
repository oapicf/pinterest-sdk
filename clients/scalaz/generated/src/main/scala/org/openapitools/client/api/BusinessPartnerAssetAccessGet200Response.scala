package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import BusinessPartnerAssetAccessGet200Response._

case class BusinessPartnerAssetAccessGet200Response (
  /* List assets on which you granted access to your partner or assets on which your partner has granted you access. */
  items: List[GetPartnerAssetsResponse],
bookmark: Option[String])

object BusinessPartnerAssetAccessGet200Response {
  import DateTimeCodecs._

  implicit val BusinessPartnerAssetAccessGet200ResponseCodecJson: CodecJson[BusinessPartnerAssetAccessGet200Response] = CodecJson.derive[BusinessPartnerAssetAccessGet200Response]
  implicit val BusinessPartnerAssetAccessGet200ResponseDecoder: EntityDecoder[BusinessPartnerAssetAccessGet200Response] = jsonOf[BusinessPartnerAssetAccessGet200Response]
  implicit val BusinessPartnerAssetAccessGet200ResponseEncoder: EntityEncoder[BusinessPartnerAssetAccessGet200Response] = jsonEncoderOf[BusinessPartnerAssetAccessGet200Response]
}
