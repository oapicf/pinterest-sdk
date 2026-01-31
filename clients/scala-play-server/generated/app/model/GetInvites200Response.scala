package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for get_invites_200_response.
  * @param items List of invite and request data.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-26T05:47:41.394513697Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class GetInvites200Response(
  items: List[InviteResponse],
  bookmark: Option[String]
)

object GetInvites200Response {
  implicit lazy val getInvites200ResponseJsonFormat: Format[GetInvites200Response] = Json.format[GetInvites200Response]
}

