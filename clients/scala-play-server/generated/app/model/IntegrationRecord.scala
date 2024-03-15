package model

import play.api.libs.json._

/**
  * Integration record
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-03-14T23:15:00.394859410Z[Etc/UTC]", comments = "Generator version: 7.4.0")
case class IntegrationRecord(
  id: Option[String],
  externalBusinessId: Option[String],
  connectedMerchantId: Option[String],
  connectedUserId: Option[String],
  connectedAdvertiserId: Option[String],
  connectedLbaId: Option[String],
  connectedTagId: Option[String],
  partnerAccessToken: Option[String],
  partnerRefreshToken: Option[String],
  partnerPrimaryEmail: Option[String],
  partnerAccessTokenExpiry: Option[Int],
  partnerRefreshTokenExpiry: Option[Int],
  scopes: Option[String],
  partnerMetadata: Option[String],
  additionalId1: Option[String],
  createdTime: Option[Int],
  updatedTime: Option[Int]
)

object IntegrationRecord {
  implicit lazy val integrationRecordJsonFormat: Format[IntegrationRecord] = Json.format[IntegrationRecord]
}

