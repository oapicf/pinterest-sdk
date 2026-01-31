package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for system_user_update_request.
  * @param name New system user name
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-31T05:12:04.015471536Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class SystemUserUpdateRequest(
  name: String
)

object SystemUserUpdateRequest {
  implicit lazy val systemUserUpdateRequestJsonFormat: Format[SystemUserUpdateRequest] = Json.format[SystemUserUpdateRequest]
}

