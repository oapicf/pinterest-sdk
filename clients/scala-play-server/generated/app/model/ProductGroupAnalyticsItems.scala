package model

import play.api.libs.json._
import java.time.LocalDate

/**
  * Represents the Swagger definition for ProductGroupAnalyticsItems.
  * @param DATE Current metrics date. Only returned when granularity is a time-based value (`DAY`, `HOUR`, `WEEK`, `MONTH`)
  * @param PRODUCT_GROUP_ID The ID of the product group that this metrics belongs to.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T10:17:18.040485445Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class ProductGroupAnalyticsItems(
  DATE: Option[LocalDate],
  PRODUCT_GROUP_ID: String
)

object ProductGroupAnalyticsItems {
  implicit lazy val productGroupAnalyticsItemsJsonFormat: Format[ProductGroupAnalyticsItems] = Json.format[ProductGroupAnalyticsItems]
}

