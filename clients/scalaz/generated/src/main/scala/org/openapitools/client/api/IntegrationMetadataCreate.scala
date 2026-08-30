package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import IntegrationMetadataCreate._

case class IntegrationMetadataCreate (
  additionalId1: Option[String],
connectedAdvertiserId: Option[String],
connectedLbaId: Option[String],
connectedMerchantId: Option[String],
connectedTagId: Option[String],
/* External business ID for the integration. */
  externalBusinessId: Option[String],
partnerAccessToken: Option[String],
partnerAccessTokenExpiry: Option[BigDecimal],
partnerMetadata: Option[String],
partnerPrimaryEmail: Option[String],
partnerRefreshToken: Option[String],
partnerRefreshTokenExpiry: Option[BigDecimal],
scopes: Option[String])

object IntegrationMetadataCreate {
  import DateTimeCodecs._

  implicit val IntegrationMetadataCreateCodecJson: CodecJson[IntegrationMetadataCreate] = CodecJson.derive[IntegrationMetadataCreate]
  implicit val IntegrationMetadataCreateDecoder: EntityDecoder[IntegrationMetadataCreate] = jsonOf[IntegrationMetadataCreate]
  implicit val IntegrationMetadataCreateEncoder: EntityEncoder[IntegrationMetadataCreate] = jsonEncoderOf[IntegrationMetadataCreate]
}
