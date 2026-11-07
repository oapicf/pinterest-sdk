package model

import play.api.libs.json._

/**
  * Integration metadata
  * @param externalBusinessId External business ID for the integration.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-07T04:12:42.952922086Z[Etc/UTC]", comments = "Generator version: 7.26.0")
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

