package model

import play.api.libs.json._

/**
  * Any valid JSON object
  * @param additionalProperties Any additional properties this model may have.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-31T05:12:04.015471536Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class NotificationPostRequest(
  additionalProperties: Map[String, OasAnyTypeNotMapped]
)

object NotificationPostRequest {
  implicit lazy val notificationPostRequestJsonFormat: Format[NotificationPostRequest] = {
    
    val innerFormat = Format.of[Map[String, OasAnyTypeNotMapped]]
    
    Format(
      innerFormat.map(inner => NotificationPostRequest(inner)),
      notificationPostRequest => innerFormat.writes(notificationPostRequest.additionalProperties
    )
    
  }
}

