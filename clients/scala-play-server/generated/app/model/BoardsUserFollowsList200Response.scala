package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for boards_user_follows_list_200_response.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-03-14T23:15:00.394859410Z[Etc/UTC]", comments = "Generator version: 7.4.0")
case class BoardsUserFollowsList200Response(
  items: List[Board],
  bookmark: Option[String]
)

object BoardsUserFollowsList200Response {
  implicit lazy val boardsUserFollowsList200ResponseJsonFormat: Format[BoardsUserFollowsList200Response] = Json.format[BoardsUserFollowsList200Response]
}

