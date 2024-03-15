package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for search_user_boards_get_200_response.
  * @param items items
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-03-14T23:15:00.394859410Z[Etc/UTC]", comments = "Generator version: 7.4.0")
case class SearchUserBoardsGet200Response(
  items: List[Board],
  bookmark: Option[String]
)

object SearchUserBoardsGet200Response {
  implicit lazy val searchUserBoardsGet200ResponseJsonFormat: Format[SearchUserBoardsGet200Response] = Json.format[SearchUserBoardsGet200Response]
}

