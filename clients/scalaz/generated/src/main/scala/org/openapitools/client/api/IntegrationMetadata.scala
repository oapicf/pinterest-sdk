package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import IntegrationMetadata._

case class IntegrationMetadata (
  id: Option[String],
externalBusinessId: Option[String],
connectedMerchantId: Option[String],
connectedUserId: Option[String],
connectedAdvertiserId: Option[String],
connectedLbaId: Option[String],
connectedTagId: Option[String],
partnerAccessTokenExpiry: Option[BigDecimal],
partnerRefreshTokenExpiry: Option[BigDecimal],
scopes: Option[String],
createdTimestamp: Option[BigDecimal],
updatedTimestamp: Option[BigDecimal],
additionalId1: Option[String],
partnerMetadata: Option[String])

object IntegrationMetadata {
  import DateTimeCodecs._

  implicit val IntegrationMetadataCodecJson: CodecJson[IntegrationMetadata] = CodecJson.derive[IntegrationMetadata]
  implicit val IntegrationMetadataDecoder: EntityDecoder[IntegrationMetadata] = jsonOf[IntegrationMetadata]
  implicit val IntegrationMetadataEncoder: EntityEncoder[IntegrationMetadata] = jsonEncoderOf[IntegrationMetadata]
}
