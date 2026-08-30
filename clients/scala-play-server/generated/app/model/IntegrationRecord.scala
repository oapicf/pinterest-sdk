package model

import play.api.libs.json._

/**
  * Integration record
  * @param id Integration record ID.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T10:17:18.040485445Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class IntegrationRecord(
  additionalId1: Option[String],
  connectedAdvertiserId: Option[String],
  connectedLbaId: Option[String],
  connectedMerchantId: Option[String],
  connectedTagId: Option[String],
  connectedUserId: Option[String],
  createdTime: Option[Int],
  externalBusinessId: Option[String],
  id: String,
  partnerAccessToken: Option[String],
  partnerAccessTokenExpiry: Option[Int],
  partnerMetadata: Option[String],
  partnerPrimaryEmail: Option[String],
  partnerRefreshToken: Option[String],
  partnerRefreshTokenExpiry: Option[Int],
  scopes: Option[String],
  updatedTime: Option[Int]
)

object IntegrationRecord {
  implicit lazy val integrationRecordJsonFormat: Format[IntegrationRecord] = Json.format[IntegrationRecord]
}

