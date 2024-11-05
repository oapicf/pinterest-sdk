package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for search_user_boards_get_200_response.
  * @param items items
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-11-05T03:04:47.577040925Z[Etc/UTC]", comments = "Generator version: 7.9.0")
case class SearchUserBoardsGet200Response(
  items: List[Board],
  bookmark: Option[String]
)

object SearchUserBoardsGet200Response {
  implicit lazy val searchUserBoardsGet200ResponseJsonFormat: Format[SearchUserBoardsGet200Response] = Json.format[SearchUserBoardsGet200Response]
}

