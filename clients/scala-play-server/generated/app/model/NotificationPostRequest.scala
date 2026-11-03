package model

import play.api.libs.json._

/**
  * Notification request body. Can be either a batch of notification objects or a single notification object.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-03T06:25:30.649114982Z[Etc/UTC]", comments = "Generator version: 7.26.0")
case class NotificationPostRequest(
)

object NotificationPostRequest {
  implicit lazy val notificationPostRequestJsonFormat: Format[NotificationPostRequest] = Json.format[NotificationPostRequest]
}

