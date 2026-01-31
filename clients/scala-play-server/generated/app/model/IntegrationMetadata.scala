package model

import play.api.libs.json._

/**
  * Integration metadata
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-31T05:12:04.015471536Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class IntegrationMetadata(
  additionalId1: Option[String],
  connectedAdvertiserId: Option[String],
  connectedLbaId: Option[String],
  connectedMerchantId: Option[String],
  connectedTagId: Option[String],
  connectedUserId: Option[String],
  createdTimestamp: Option[BigDecimal],
  externalBusinessId: Option[String],
  id: Option[String],
  partnerAccessTokenExpiry: Option[BigDecimal],
  partnerMetadata: Option[String],
  partnerRefreshTokenExpiry: Option[BigDecimal],
  scopes: Option[String],
  updatedTimestamp: Option[BigDecimal]
)

object IntegrationMetadata {
  implicit lazy val integrationMetadataJsonFormat: Format[IntegrationMetadata] = Json.format[IntegrationMetadata]
}

