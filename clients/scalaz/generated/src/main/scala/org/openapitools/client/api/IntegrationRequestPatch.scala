package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import IntegrationRequestPatch._

case class IntegrationRequestPatch (
  connectedMerchantId: Option[String],
connectedAdvertiserId: Option[String],
connectedLbaId: Option[String],
connectedTagId: Option[String],
partnerAccessToken: Option[String],
partnerRefreshToken: Option[String],
partnerPrimaryEmail: Option[String],
partnerAccessTokenExpiry: Option[BigDecimal],
partnerRefreshTokenExpiry: Option[BigDecimal],
scopes: Option[String],
additionalId1: Option[String],
partnerMetadata: Option[String])

object IntegrationRequestPatch {
  import DateTimeCodecs._

  implicit val IntegrationRequestPatchCodecJson: CodecJson[IntegrationRequestPatch] = CodecJson.derive[IntegrationRequestPatch]
  implicit val IntegrationRequestPatchDecoder: EntityDecoder[IntegrationRequestPatch] = jsonOf[IntegrationRequestPatch]
  implicit val IntegrationRequestPatchEncoder: EntityEncoder[IntegrationRequestPatch] = jsonEncoderOf[IntegrationRequestPatch]
}
