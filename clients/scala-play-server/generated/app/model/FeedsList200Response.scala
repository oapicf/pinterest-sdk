package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for feeds_list_200_response.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-11-05T03:04:47.577040925Z[Etc/UTC]", comments = "Generator version: 7.9.0")
case class FeedsList200Response(
  items: List[CatalogsFeed],
  bookmark: Option[String]
)

object FeedsList200Response {
  implicit lazy val feedsList200ResponseJsonFormat: Format[FeedsList200Response] = Json.format[FeedsList200Response]
}

