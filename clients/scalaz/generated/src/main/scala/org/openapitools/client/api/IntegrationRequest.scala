package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import IntegrationRequest._

case class IntegrationRequest (
  /* External business ID for the integration. */
  externalBusinessId: Option[String],
connectedMerchantId: Option[String],
connectedAdvertiserId: Option[String],
connectedLbaId: Option[String],
connectedTagId: Option[String],
partnerAccessToken: Option[String],
partnerRefreshToken: Option[String],
partnerPrimaryEmail: Option[String],
partnerAccessTokenExpiry: Option[Integer],
partnerRefreshTokenExpiry: Option[Integer],
scopes: Option[String],
additionalId1: Option[String],
partnerMetadata: Option[String])

object IntegrationRequest {
  import DateTimeCodecs._

  implicit val IntegrationRequestCodecJson: CodecJson[IntegrationRequest] = CodecJson.derive[IntegrationRequest]
  implicit val IntegrationRequestDecoder: EntityDecoder[IntegrationRequest] = jsonOf[IntegrationRequest]
  implicit val IntegrationRequestEncoder: EntityEncoder[IntegrationRequest] = jsonEncoderOf[IntegrationRequest]
}
