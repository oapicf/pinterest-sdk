package model

import play.api.libs.json._

/**
  * Schema used for creating the integration metadata.
  * @param externalBusinessId External business ID for the integration.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-26T05:47:41.394513697Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class IntegrationRequest(
  externalBusinessId: Option[String],
  connectedMerchantId: Option[String],
  connectedAdvertiserId: Option[String],
  connectedLbaId: Option[String],
  connectedTagId: Option[String],
  partnerAccessToken: Option[String],
  partnerRefreshToken: Option[String],
  partnerPrimaryEmail: Option[String],
  partnerAccessTokenExpiry: Option[Int],
  partnerRefreshTokenExpiry: Option[Int],
  scopes: Option[String],
  additionalId1: Option[String],
  partnerMetadata: Option[String]
)

object IntegrationRequest {
  implicit lazy val integrationRequestJsonFormat: Format[IntegrationRequest] = Json.format[IntegrationRequest]
}

