package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for get_invites_200_response.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-07T04:12:42.952922086Z[Etc/UTC]", comments = "Generator version: 7.26.0")
case class GetInvites200Response(
  bookmark: Option[String],
  items: List[InviteResponse]
)

object GetInvites200Response {
  implicit lazy val getInvites200ResponseJsonFormat: Format[GetInvites200Response] = Json.format[GetInvites200Response]
}

