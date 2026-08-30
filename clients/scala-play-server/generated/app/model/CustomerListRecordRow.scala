package model

import play.api.libs.json._

/**
  * A single row in a multi-field customer list (v2 format).
  * @param email Email address (plain or hashed with SHA1, SHA256, or MD5).
  * @param externalId External ID identifier (not hashed).
  * @param hashedPhoneNumber Hashed phone number (hashed with SHA1, SHA256, or MD5).
  * @param hashedPinnerId Hashed pinner ID (hashed with SHA1, SHA256, or MD5).
  * @param ipAddress IP address (not hashed).
  * @param liverampEnvelope LiveRamp envelope identifier (Base64-encoded, not hashed).
  * @param maid Mobile advertising ID (plain or hashed with SHA1, SHA256, or MD5).
  * @param userAgent User agent string (not hashed).
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T10:17:18.040485445Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class CustomerListRecordRow(
  email: Option[String],
  externalId: Option[String],
  hashedPhoneNumber: Option[String],
  hashedPinnerId: Option[String],
  ipAddress: Option[String],
  liverampEnvelope: Option[String],
  maid: Option[String],
  userAgent: Option[String]
)

object CustomerListRecordRow {
  implicit lazy val customerListRecordRowJsonFormat: Format[CustomerListRecordRow] = Json.format[CustomerListRecordRow]
}

