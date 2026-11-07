package model

import play.api.libs.json._

/**
  * Represents the Swagger definition for InnerProductCategoriesMetricsHighlights.
  * @param pctChangeMom Month-over-month percentage change
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-07T02:59:47.831280460Z[Etc/UTC]", comments = "Generator version: 7.26.0")
case class InnerProductCategoriesMetricsHighlights(
  pctChangeMom: BigDecimal
)

object InnerProductCategoriesMetricsHighlights {
  implicit lazy val innerProductCategoriesMetricsHighlightsJsonFormat: Format[InnerProductCategoriesMetricsHighlights] = Json.format[InnerProductCategoriesMetricsHighlights]
}

