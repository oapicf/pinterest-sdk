package model

import play.api.libs.json._

/**
  * Resource create or update operation model.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-03T06:25:30.649114982Z[Etc/UTC]", comments = "Generator version: 7.26.0")
case class IntegrationMetadataUpdate(
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
  scopes: Option[String]
)

object IntegrationMetadataUpdate {
  implicit lazy val integrationMetadataUpdateJsonFormat: Format[IntegrationMetadataUpdate] = Json.format[IntegrationMetadataUpdate]
}

