package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for feeds_list_200_response.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-03T06:25:30.649114982Z[Etc/UTC]", comments = "Generator version: 7.26.0")
case class FeedsList200Response(
  bookmark: Option[String],
  items: List[CatalogsFeed]
)

object FeedsList200Response {
  implicit lazy val feedsList200ResponseJsonFormat: Format[FeedsList200Response] = Json.format[FeedsList200Response]
}

