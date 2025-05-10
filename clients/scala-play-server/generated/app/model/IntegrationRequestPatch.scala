package model

import play.api.libs.json._

/**
  * Schema used for updating the integration metadata.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2025-05-10T05:44:38.070631387Z[Etc/UTC]", comments = "Generator version: 7.12.0")
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

