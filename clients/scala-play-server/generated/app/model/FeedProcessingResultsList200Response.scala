package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for feed_processing_results_list_200_response.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2024-03-14T23:15:00.394859410Z[Etc/UTC]", comments = "Generator version: 7.4.0")
case class FeedProcessingResultsList200Response(
  items: List[CatalogsFeedProcessingResult],
  bookmark: Option[String]
)

object FeedProcessingResultsList200Response {
  implicit lazy val feedProcessingResultsList200ResponseJsonFormat: Format[FeedProcessingResultsList200Response] = Json.format[FeedProcessingResultsList200Response]
}

