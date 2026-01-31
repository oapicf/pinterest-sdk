package model

import play.api.libs.json._

/**
  * Schema used for creating the integration metadata.
  * @param externalBusinessId External business ID for the integration.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-31T05:12:04.015471536Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class IntegrationRequest(
  additionalId1: Option[String],
  connectedAdvertiserId: Option[String],
  connectedLbaId: Option[String],
  connectedMerchantId: Option[String],
  connectedTagId: Option[String],
  externalBusinessId: Option[String],
  partnerAccessToken: Option[String],
  partnerAccessTokenExpiry: Option[Int],
  partnerMetadata: Option[String],
  partnerPrimaryEmail: Option[String],
  partnerRefreshToken: Option[String],
  partnerRefreshTokenExpiry: Option[Int],
  scopes: Option[String]
)

object IntegrationRequest {
  implicit lazy val integrationRequestJsonFormat: Format[IntegrationRequest] = Json.format[IntegrationRequest]
}

