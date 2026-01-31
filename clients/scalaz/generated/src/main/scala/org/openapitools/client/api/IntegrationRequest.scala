package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import IntegrationRequest._

case class IntegrationRequest (
  additionalId1: Option[String],
connectedAdvertiserId: Option[String],
connectedLbaId: Option[String],
connectedMerchantId: Option[String],
connectedTagId: Option[String],
/* External business ID for the integration. */
  externalBusinessId: Option[String],
partnerAccessToken: Option[String],
partnerAccessTokenExpiry: Option[Integer],
partnerMetadata: Option[String],
partnerPrimaryEmail: Option[String],
partnerRefreshToken: Option[String],
partnerRefreshTokenExpiry: Option[Integer],
scopes: Option[String])

object IntegrationRequest {
  import DateTimeCodecs._

  implicit val IntegrationRequestCodecJson: CodecJson[IntegrationRequest] = CodecJson.derive[IntegrationRequest]
  implicit val IntegrationRequestDecoder: EntityDecoder[IntegrationRequest] = jsonOf[IntegrationRequest]
  implicit val IntegrationRequestEncoder: EntityEncoder[IntegrationRequest] = jsonEncoderOf[IntegrationRequest]
}
