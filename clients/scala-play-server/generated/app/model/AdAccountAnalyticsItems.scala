package model

import play.api.libs.json._
import java.time.LocalDate

/**
  * Represents the Swagger definition for AdAccountAnalyticsItems.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-08-30T10:17:18.040485445Z[Etc/UTC]", comments = "Generator version: 7.24.0")
case class AdAccountAnalyticsItems(
  AD_ACCOUNT_ID: String,
  DATE: Option[LocalDate]
)

object AdAccountAnalyticsItems {
  implicit lazy val adAccountAnalyticsItemsJsonFormat: Format[AdAccountAnalyticsItems] = Json.format[AdAccountAnalyticsItems]
}

