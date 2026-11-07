package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for items_post_200_response.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-07T02:59:47.831280460Z[Etc/UTC]", comments = "Generator version: 7.26.0")
case class ItemsPost200Response(
  items: List[ItemResponse]
)

object ItemsPost200Response {
  implicit lazy val itemsPost200ResponseJsonFormat: Format[ItemsPost200Response] = Json.format[ItemsPost200Response]
}

