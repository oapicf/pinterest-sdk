package model

import play.api.libs.json._

/**
  * Schema used for creating the integration metadata.
  * @param externalBusinessId External business ID for the integration.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-03-14T23:15:00.394859410Z[Etc/UTC]", comments = "Generator version: 7.4.0")
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

