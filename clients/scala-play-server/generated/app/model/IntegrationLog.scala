package model

import play.api.libs.json._

/**
  * Schema for log sent from an integration application.
  * @param appVersionNumber Version number of the integration application.
  * @param clientTimestamp Timestamp in milliseconds of when the log was executed at the client.
  * @param eventType Log event type
  * @param logLevel Log level type
  * @param message Explanation of the event that occured.
  * @param platformVersionNumber Version number of the platform the integration application is running on.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T10:17:18.040485445Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class IntegrationLog(
  advertiserId: Option[String],
  appVersionNumber: Option[String],
  clientTimestamp: Int,
  error: Option[IntegrationLogClientError],
  eventType: IntegrationLogEventType,
  externalBusinessId: Option[String],
  feedProfileId: Option[String],
  logLevel: IntegrationLogLevel,
  merchantId: Option[String],
  message: Option[String],
  platformVersionNumber: Option[String],
  request: Option[IntegrationLogClientRequest],
  tagId: Option[String]
)

object IntegrationLog {
  implicit lazy val integrationLogJsonFormat: Format[IntegrationLog] = Json.format[IntegrationLog]
}

