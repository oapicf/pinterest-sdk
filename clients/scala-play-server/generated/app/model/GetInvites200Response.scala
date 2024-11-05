package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for get_invites_200_response.
  * @param items List of invite and request data.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-11-05T03:04:47.577040925Z[Etc/UTC]", comments = "Generator version: 7.9.0")
case class GetInvites200Response(
  items: List[InviteResponse],
  bookmark: Option[String]
)

object GetInvites200Response {
  implicit lazy val getInvites200ResponseJsonFormat: Format[GetInvites200Response] = Json.format[GetInvites200Response]
}

