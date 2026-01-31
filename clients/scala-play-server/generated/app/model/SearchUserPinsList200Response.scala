package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for search_user_pins_list_200_response.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-31T05:12:04.015471536Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class SearchUserPinsList200Response(
  bookmark: Option[String],
  items: List[Pin]
)

object SearchUserPinsList200Response {
  implicit lazy val searchUserPinsList200ResponseJsonFormat: Format[SearchUserPinsList200Response] = Json.format[SearchUserPinsList200Response]
}

