package model

import play.api.libs.json._

/**
  * Schema used for updating the integration metadata.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-26T05:47:41.394513697Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class IntegrationRequestPatch(
  connectedMerchantId: Option[String],
  connectedAdvertiserId: Option[String],
  connectedLbaId: Option[String],
  connectedTagId: Option[String],
  partnerAccessToken: Option[String],
  partnerRefreshToken: Option[String],
  partnerPrimaryEmail: Option[String],
  partnerAccessTokenExpiry: Option[BigDecimal],
  partnerRefreshTokenExpiry: Option[BigDecimal],
  scopes: Option[String],
  additionalId1: Option[String],
  partnerMetadata: Option[String]
)

object IntegrationRequestPatch {
  implicit lazy val integrationRequestPatchJsonFormat: Format[IntegrationRequestPatch] = Json.format[IntegrationRequestPatch]
}

