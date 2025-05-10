package model

import play.api.libs.json._

/**
  * Integration metadata
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2025-05-10T05:44:38.070631387Z[Etc/UTC]", comments = "Generator version: 7.12.0")
case class IntegrationMetadata(
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
  partnerMetadata: Option[String]
)

object IntegrationMetadata {
  implicit lazy val integrationMetadataJsonFormat: Format[IntegrationMetadata] = Json.format[IntegrationMetadata]
}

