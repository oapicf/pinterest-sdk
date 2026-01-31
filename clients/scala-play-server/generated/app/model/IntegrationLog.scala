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
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-31T05:12:04.015471536Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class IntegrationLog(
  advertiserId: Option[String],
  appVersionNumber: Option[String],
  clientTimestamp: Int,
  error: Option[IntegrationLogClientError],
  eventType: IntegrationLog.EventType.Value,
  externalBusinessId: Option[String],
  feedProfileId: Option[String],
  logLevel: IntegrationLog.LogLevel.Value,
  merchantId: Option[String],
  message: Option[String],
  platformVersionNumber: Option[String],
  request: Option[IntegrationLogClientRequest],
  tagId: Option[String]
)

object IntegrationLog {
  implicit lazy val integrationLogJsonFormat: Format[IntegrationLog] = Json.format[IntegrationLog]

  // noinspection TypeAnnotation
  object EventType extends Enumeration {
    val APP = Value("APP")
    val API = Value("API")

    type EventType = Value
    implicit lazy val EventTypeJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }

  // noinspection TypeAnnotation
  object LogLevel extends Enumeration {
    val INFO = Value("INFO")
    val WARN = Value("WARN")
    val ERROR = Value("ERROR")

    type LogLevel = Value
    implicit lazy val LogLevelJsonFormat: Format[Value] = Format(Reads.enumNameReads(this), Writes.enumNameWrites[this.type])
  }
}

