package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for TitleKeywordsFilter.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-01-31T05:12:04.015471536Z[Etc/UTC]", comments = "Generator version: 7.18.0")
case class TitleKeywordsFilter(
  TITLE_KEYWORDS: CatalogsProductGroupMultipleStringCriteria
)

object TitleKeywordsFilter {
  implicit lazy val titleKeywordsFilterJsonFormat: Format[TitleKeywordsFilter] = Json.format[TitleKeywordsFilter]
}

