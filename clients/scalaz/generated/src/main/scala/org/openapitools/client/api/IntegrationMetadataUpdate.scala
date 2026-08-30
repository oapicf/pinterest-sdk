package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import IntegrationMetadataUpdate._

case class IntegrationMetadataUpdate (
  additionalId1: Option[String],
connectedAdvertiserId: Option[String],
connectedLbaId: Option[String],
connectedMerchantId: Option[String],
connectedTagId: Option[String],
partnerAccessToken: Option[String],
partnerAccessTokenExpiry: Option[BigDecimal],
partnerMetadata: Option[String],
partnerPrimaryEmail: Option[String],
partnerRefreshToken: Option[String],
partnerRefreshTokenExpiry: Option[BigDecimal],
scopes: Option[String])

object IntegrationMetadataUpdate {
  import DateTimeCodecs._

  implicit val IntegrationMetadataUpdateCodecJson: CodecJson[IntegrationMetadataUpdate] = CodecJson.derive[IntegrationMetadataUpdate]
  implicit val IntegrationMetadataUpdateDecoder: EntityDecoder[IntegrationMetadataUpdate] = jsonOf[IntegrationMetadataUpdate]
  implicit val IntegrationMetadataUpdateEncoder: EntityEncoder[IntegrationMetadataUpdate] = jsonEncoderOf[IntegrationMetadataUpdate]
}
