package model

import play.api.libs.json._

/**
  * Resource create operation model.
  * @param externalBusinessId External business ID for the integration.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T10:17:18.040485445Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class IntegrationMetadataCreate(
  additionalId1: Option[String],
  connectedAdvertiserId: Option[String],
  connectedLbaId: Option[String],
  connectedMerchantId: Option[String],
  connectedTagId: Option[String],
  externalBusinessId: Option[String],
  partnerAccessToken: Option[String],
  partnerAccessTokenExpiry: Option[BigDecimal],
  partnerMetadata: Option[String],
  partnerPrimaryEmail: Option[String],
  partnerRefreshToken: Option[String],
  partnerRefreshTokenExpiry: Option[BigDecimal],
  scopes: Option[String]
)

object IntegrationMetadataCreate {
  implicit lazy val integrationMetadataCreateJsonFormat: Format[IntegrationMetadataCreate] = Json.format[IntegrationMetadataCreate]
}

