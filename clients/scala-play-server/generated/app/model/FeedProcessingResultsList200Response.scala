package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for feed_processing_results_list_200_response.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-11-05T03:04:47.577040925Z[Etc/UTC]", comments = "Generator version: 7.9.0")
case class FeedProcessingResultsList200Response(
  items: List[CatalogsFeedProcessingResult],
  bookmark: Option[String]
)

object FeedProcessingResultsList200Response {
  implicit lazy val feedProcessingResultsList200ResponseJsonFormat: Format[FeedProcessingResultsList200Response] = Json.format[FeedProcessingResultsList200Response]
}

