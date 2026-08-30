package model

import play.api.libs.json._

/**
  * Information of the published editorial article.
  * @param boardUrl URL of the editorial board
  * @param description Description of the editorial article
  * @param interests List of interests related to the editorial article
  * @param pinsUrl URL of the pins related to the editorial article
  * @param relatedKeywords List of keywords related to the editorial article
  * @param title Title of the editorial article
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T10:17:18.040485445Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class TrendsEditorial(
  boardUrl: String,
  description: String,
  interests: List[String],
  pinsUrl: List[String],
  relatedKeywords: List[KeywordInfo],
  title: String
)

object TrendsEditorial {
  implicit lazy val trendsEditorialJsonFormat: Format[TrendsEditorial] = Json.format[TrendsEditorial]
}

