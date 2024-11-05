package model

import play.api.libs.json._

/**
  * Integration metadata
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-11-05T03:04:47.577040925Z[Etc/UTC]", comments = "Generator version: 7.9.0")
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

