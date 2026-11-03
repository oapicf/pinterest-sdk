package model

import play.api.libs.json._
import java.time.LocalDate

/**
  * Represents the Swagger definition for AdAccountAnalyticsItems.
  */
@javax.annotation.Generated(value = Array("org.openapitools.codegen.languages.ScalaPlayFrameworkServerCodegen"), date = "2026-11-03T06:25:30.649114982Z[Etc/UTC]", comments = "Generator version: 7.26.0")
case class AdAccountAnalyticsItems(
  AD_ACCOUNT_ID: String,
  DATE: Option[LocalDate]
)

object AdAccountAnalyticsItems {
  implicit lazy val adAccountAnalyticsItemsJsonFormat: Format[AdAccountAnalyticsItems] = Json.format[AdAccountAnalyticsItems]
}

