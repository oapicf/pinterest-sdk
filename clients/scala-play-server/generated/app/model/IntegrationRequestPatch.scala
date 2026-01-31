package model

import play.api.libs.json._

/**
  * Schema used for updating the integration metadata.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-31T05:12:04.015471536Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class IntegrationRequestPatch(
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

object IntegrationRequestPatch {
  implicit lazy val integrationRequestPatchJsonFormat: Format[IntegrationRequestPatch] = Json.format[IntegrationRequestPatch]
}

