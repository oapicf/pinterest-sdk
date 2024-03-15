package model

import play.api.libs.json._

/**
  * Schema for log sent from an integration application.
  * @param clientTimestamp Timestamp in milliseconds of when the log was executed at the client.
  * @param eventType Log event type
  * @param logLevel Log level type
  * @param message Explanation of the event that occured.
  * @param appVersionNumber Version number of the integration application.
  * @param platformVersionNumber Version number of the platform the integration application is running on.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-03-14T23:15:00.394859410Z[Etc/UTC]", comments = "Generator version: 7.4.0")
case class IntegrationLog(
  clientTimestamp: Int,
  eventType: IntegrationLog.EventType.Value,
  logLevel: IntegrationLog.LogLevel.Value,
  externalBusinessId: Option[String],
  advertiserId: Option[String],
  merchantId: Option[String],
  tagId: Option[String],
  feedProfileId: Option[String],
  message: Option[String],
  appVersionNumber: Option[String],
  platformVersionNumber: Option[String],
  error: Option[IntegrationLogClientError],
  request: Option[IntegrationLogClientRequest]
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

