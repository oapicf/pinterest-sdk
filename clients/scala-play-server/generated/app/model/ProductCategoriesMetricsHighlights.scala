package model

import play.api.libs.json._

/**
  * Key performance metrics highlights for this product category
  * @param engagement Engagement metric value
  * @param outboundClicks Number of outbound clicks
  * @param pinSaves Number of pin saves
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T10:17:18.040485445Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class ProductCategoriesMetricsHighlights(
  engagement: Option[InnerProductCategoriesMetricsHighlights],
  outboundClicks: Option[InnerProductCategoriesMetricsHighlights],
  pinSaves: Option[InnerProductCategoriesMetricsHighlights]
)

object ProductCategoriesMetricsHighlights {
  implicit lazy val productCategoriesMetricsHighlightsJsonFormat: Format[ProductCategoriesMetricsHighlights] = Json.format[ProductCategoriesMetricsHighlights]
}

