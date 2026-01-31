package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for NotificationResponse.
  * @param success Returns true if the notification accepted.
  * @param receivedAt Received time. Unix timestamp in seconds.
  * @param errorMsg error message when success is false
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-31T05:12:04.015471536Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class NotificationResponse(
  success: Option[Boolean],
  receivedAt: Option[Int],
  errorMsg: Option[String]
)

object NotificationResponse {
  implicit lazy val notificationResponseJsonFormat: Format[NotificationResponse] = Json.format[NotificationResponse]
}

