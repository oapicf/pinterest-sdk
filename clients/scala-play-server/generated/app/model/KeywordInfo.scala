package model

import play.api.libs.json._

/**
  * Related Keyword information of the editorial article
  * @param name Keyword Name
  * @param pctGrowthMom MoM growth as a percentage, if there is no growth rate, this field is not present
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T10:17:18.040485445Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class KeywordInfo(
  name: String,
  pctGrowthMom: Option[BigDecimal]
)

object KeywordInfo {
  implicit lazy val keywordInfoJsonFormat: Format[KeywordInfo] = Json.format[KeywordInfo]
}

