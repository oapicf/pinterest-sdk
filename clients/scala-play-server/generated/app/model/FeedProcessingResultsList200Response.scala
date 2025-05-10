package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for feed_processing_results_list_200_response.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2025-05-10T05:44:38.070631387Z[Etc/UTC]", comments = "Generator version: 7.12.0")
case class FeedProcessingResultsList200Response(
  items: List[CatalogsFeedProcessingResult],
  bookmark: Option[String]
)

object FeedProcessingResultsList200Response {
  implicit lazy val feedProcessingResultsList200ResponseJsonFormat: Format[FeedProcessingResultsList200Response] = Json.format[FeedProcessingResultsList200Response]
}

