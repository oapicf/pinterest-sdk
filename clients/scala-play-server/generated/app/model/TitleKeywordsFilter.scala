package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for TitleKeywordsFilter.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T10:17:18.040485445Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class TitleKeywordsFilter(
  TITLE_KEYWORDS: CatalogsProductGroupMultipleStringCriteria
)

object TitleKeywordsFilter {
  implicit lazy val titleKeywordsFilterJsonFormat: Format[TitleKeywordsFilter] = Json.format[TitleKeywordsFilter]
}

