package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for get_invites_200_response.
  * @param items List of invite and request data.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-31T05:12:04.015471536Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class GetInvites200Response(
  bookmark: Option[String],
  items: List[InviteResponse]
)

object GetInvites200Response {
  implicit lazy val getInvites200ResponseJsonFormat: Format[GetInvites200Response] = Json.format[GetInvites200Response]
}

