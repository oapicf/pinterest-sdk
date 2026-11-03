package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for NotificationResponse.
  * @param errorMsg error message when success is false
  * @param receivedAt Received time. Unix timestamp in seconds.
  * @param success Returns true if the notification accepted.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-03T06:25:30.649114982Z[Etc/UTC]", comments = "Generator version: 7.26.0")
case class NotificationResponse(
  errorMsg: Option[String],
  receivedAt: Option[Int],
  success: Option[Boolean]
)

object NotificationResponse {
  implicit lazy val notificationResponseJsonFormat: Format[NotificationResponse] = Json.format[NotificationResponse]
}

