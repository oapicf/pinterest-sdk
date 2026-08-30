package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.joda.time.DateTime


import IntegrationMetadata._

case class IntegrationMetadata (
  additionalId1: Option[String],
connectedAdvertiserId: Option[String],
connectedLbaId: Option[String],
connectedMerchantId: Option[String],
connectedTagId: Option[String],
connectedUserId: Option[String],
createdTimestamp: Option[BigDecimal],
/* External business ID for the integration. */
  externalBusinessId: Option[String],
id: Option[String],
partnerAccessTokenExpiry: Option[BigDecimal],
partnerMetadata: Option[String],
partnerRefreshTokenExpiry: Option[BigDecimal],
scopes: Option[String],
updatedTimestamp: Option[BigDecimal])

object IntegrationMetadata {
  import DateTimeCodecs._

  implicit val IntegrationMetadataCodecJson: CodecJson[IntegrationMetadata] = CodecJson.derive[IntegrationMetadata]
  implicit val IntegrationMetadataDecoder: EntityDecoder[IntegrationMetadata] = jsonOf[IntegrationMetadata]
  implicit val IntegrationMetadataEncoder: EntityEncoder[IntegrationMetadata] = jsonEncoderOf[IntegrationMetadata]
}
