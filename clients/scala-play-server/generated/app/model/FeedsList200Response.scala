package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for feeds_list_200_response.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-03-14T23:15:00.394859410Z[Etc/UTC]", comments = "Generator version: 7.4.0")
case class FeedsList200Response(
  items: List[CatalogsFeed],
  bookmark: Option[String]
)

object FeedsList200Response {
  implicit lazy val feedsList200ResponseJsonFormat: Format[FeedsList200Response] = Json.format[FeedsList200Response]
}

